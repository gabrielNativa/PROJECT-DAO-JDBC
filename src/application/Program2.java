package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
			
		/*
		System.out.println("\n=== TEST 1: Department Insert =====");
		Department d = new Department(null, "MECANICO");
		departmentDao.insert(d);
		System.out.println("Inserted! New id " + d.getId() ); */
		
		System.out.println("=== TEST 2: department findById =====");
		 Department d = departmentDao.findById(5); 
		System.out.println(d);
		
	
		 
		System.out.println("\n=== TEST3: Department UPDATE =====");
		 d = departmentDao.findById(5);
		 d.setName("PASTELEIRO");
		 departmentDao.update(d);
	
		 System.out.println("\n=== TEST 4: department findALL =====");
		 List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		 System.out.println("\n=== TEST 5: department delete =====");
		departmentDao.deleteById(5);
		System.out.println("DELETE COMPLETE");
		
		
		
		
	}

}
