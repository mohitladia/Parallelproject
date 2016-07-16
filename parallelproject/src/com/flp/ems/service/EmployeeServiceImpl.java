package com.flp.ems.service;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.view.Employee;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class EmployeeServiceImpl implements IEmployeeService {
	
		static HashSet<String> h = new HashSet<String>();
		static Employee employee=new Employee();
		public void AddEmployee(HashMap<Integer,Object> hmap) {
		
		 
		 //DUPLICATE AND UNIQUE CHECK
		
		if(h.contains((String)hmap.get(2)) || h.contains((String)hmap.get(3))){
			System.out.println("Duplicate email id or employment id exists");}
		else{
		 	h.add((String)hmap.get(2));
			h.add((String)hmap.get(3));
			
			
			//SETTER AND GETTER METHOD
		
		employee.setName((String) hmap.get(1));
		employee.setEmployeeid((String) hmap.get(2));
		employee.setAdress((String) hmap.get(7));
		employee.setDepartment_id((String) hmap.get(9));
		employee.setProject_id((String) hmap.get(8));
		employee.setDob((String) hmap.get(5));
		employee.setDoj((String) hmap.get(6));
		employee.setEmail_id((String) hmap.get(3));
		employee.setRoles_id((String)hmap.get(10));
		EmployeeDaoImplForList empld = new EmployeeDaoImplForList();
		empld.AddEmployee(employee);}
	}
	public void ModifyEmployee(HashMap<Integer,Object> hmap,boolean[] flag) {
		if(h.contains((String)hmap.get(10)))
		{
			
		EmployeeDaoImplForList empld = new EmployeeDaoImplForList();
		empld.ModifyEmployee(hmap,flag);
		}
		else
			System.out.println("employee id is not there");
	}

	@Override
	public void RemoveEmployee(String id) {
		EmployeeDaoImplForList empld = new EmployeeDaoImplForList();
		empld.RemoveEmployee(id);}

	
	public void SearchEmployee(String s) {
		EmployeeDaoImplForList emplde = new EmployeeDaoImplForList();
		emplde.SearchEmployee(s);
	}

	@Override
	public void GetallEmployee() {
		EmployeeDaoImplForList empl = new EmployeeDaoImplForList();
		empl.GetallEmployee();
		
	}

}
