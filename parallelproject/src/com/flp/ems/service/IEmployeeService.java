package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.view.Employee;

public interface IEmployeeService {
	public void AddEmployee(HashMap<Integer, Object> hmap);
	public void ModifyEmployee(HashMap<Integer, Object> map,boolean flag[]);
	public void RemoveEmployee(String id);
	public void SearchEmployee(String s);
	public void GetallEmployee();

}
