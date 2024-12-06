package com.klu.JFSDS25_JPASB;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeLoad implements CommandLineRunner{
	    EmployeeDAO edao;
	    
	    public EmployeeLoad(EmployeeDAO edao) {
	    	this.edao=edao;
	    }
	    
	    public void run(String[] args) {
	    	Employee e = new Employee();
	    	e.setEid(111);
	    	e.setEname("ABC");
	    	e.setEsal(50000);
	    	
	    	edao.insertEmployee(e);
	   
	    System.out.println("Details inserted successfully");
   }
}
