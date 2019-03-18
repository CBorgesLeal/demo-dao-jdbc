package model.dao;

import java.util.List;

import entities.Seller;

public interface SellerDao {

	void insert(Seller department);
	void update(Seller department);
	void delete(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
