package com.flp.ems.dao;

import java.util.HashMap;

import com.flp.ems.view.Employee;

public interface IemployeeDao 
{
	 public void AddEmployee(Employee e);
	 public void ModifyEmployee(HashMap<Integer,Object> hmap,boolean[] flag);
	 public void RemoveEmployee(String id);
	 public void SearchEmployee(String s);
	 public void GetallEmployee();

}
