package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department d = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(d);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller findALL =====");
		 list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n=== TEST 4: seller Insert =====");
		Seller s = new Seller(null, "Greg", "gref@gmail.com", new Date(), 4000.0, d);
		sellerDao.insert(s);
		System.out.println("Inserted! New id " + s.getId() );
		
		System.out.println("\n=== TEST 5: seller Update =====");
		seller = sellerDao.findById(1);
		seller.setName("GABRIEL GOSTOSAO");
		sellerDao.update(seller);
		System.out.println("UPDATE COMPLETE");
		
		
		System.out.println("\n=== TEST 6: seller DELETE =====");
		seller = sellerDao.findById(8);
		sellerDao.deleteById(seller.getId());
		System.out.println("DELETE COMPLETE");
		
	}
}
