package model.dao.impl;

import java.sql.Connection;
import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
