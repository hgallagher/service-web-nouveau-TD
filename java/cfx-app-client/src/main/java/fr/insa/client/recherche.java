package fr.insa.client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import fr.insa.service.Product;
import fr.insa.service.ProductService;
import fr.insa.service.ProductServiceService;

public class recherche {
	
	public List<Product> getResult(String productName,String category) throws RemoteException {
		

		ProductServiceService productServiceSvc = new ProductServiceService();
		ProductService productService = productServiceSvc.getProductServicePort();
		
		System.out.println("List des produitSearch");
		
		List<Product> r =  productService.searchProductsByCriteria(productName, category);
		return r;
	}

	public static void main(String[] args) throws RemoteException {

		recherche r = new recherche();
		System.out.println(r.getResult("Bannana","Fruits"));

	}

}
