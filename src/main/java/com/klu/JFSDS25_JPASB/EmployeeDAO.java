package com.klu.JFSDS25_JPASB;

import java.util.List;

public interface EmployeeDAO {
       public void insertEmployee(Employee emp);
       public void updateEmployee(Employee emp);
       public void deleteEmployee(int id);
       Employee getEmployeeById(int id);
       List<Employee> getAllEmployees();
	
}
