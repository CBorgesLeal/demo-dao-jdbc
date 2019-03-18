package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.SellerDao;

public class SellerDaoJDBC implements SellerDao {

	Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;	
	}
	
	@Override
	public void insert(Seller department) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller department) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findById(Integer id) {
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			pst = conn.prepareStatement(
					"SELECT seller.*, department.name AS depName "
					+ "FROM seller "
					+ "INNER JOIN department "
					+ "ON seller.departmentid = department.id "
					+ "WHERE seller.id=?"
					);
			
			pst.setInt(1, id);
			
			rs = pst.executeQuery();
			
			while (rs.next()) {
				Department dep = new Department();
				dep.setName(rs.getString(7));
				
			}
					
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		return null;
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
