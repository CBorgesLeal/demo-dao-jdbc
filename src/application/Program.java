package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		
		if (conn != null) {
			System.out.println(conn);
			System.out.println("Conexão efetuada com sucesso!");
			DB.closeConnection(conn);
		}
		

//		Department dep = new Department(1, "Books");
//		System.out.println("Department: " + dep);
//		
//		Seller sel = new Seller(1, "Bob Dylan", "bob@gmail.com", 
//				new Date(), 5000.0, dep);
//		System.out.println("Seller: " + sel);
	}

}
