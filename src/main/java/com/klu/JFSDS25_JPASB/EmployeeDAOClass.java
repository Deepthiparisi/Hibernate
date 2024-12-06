package com.klu.JFSDS25_JPASB;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class EmployeeDAOClass implements EmployeeDAO{
	
	   @PersistenceContext
	      EntityManager em;

	   @Transactional
	    public void insertEmployee(Employee emp) {
	    	em.persist(emp);
	    }


		@Override
		public void updateEmployee(Employee emp) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void deleteEmployee(int id) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public Employee getEmployeeById(int id) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<Employee> getAllEmployees() {
			// TODO Auto-generated method stub
			return null;
		}
}
