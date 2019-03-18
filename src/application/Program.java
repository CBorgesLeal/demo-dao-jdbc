package application;

import java.util.Date;

import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dep = new Department(1, "Books");
		System.out.println("Department: " + dep);
		
		Seller sel = new Seller(1, "Bob Dylan", "bob@gmail.com", 
				new Date(), 5000.0, dep);
		System.out.println("Seller: " + sel);
	}

}
