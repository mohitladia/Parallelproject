package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.flp.ems.view.Employee;

public  class EmployeeDaoImplForList implements IemployeeDao {

	
	static ArrayList<Employee> al=new ArrayList<Employee>();
	public void AddEmployee(Employee e) 
	{
	al.add(e);
	}
	public void ModifyEmployee(HashMap<Integer,Object> hmap,boolean flag[]) 
	{
		System.out.println("1--------MODIFY NAME");
		System.out.println("2--------Modify EMAIL_ID");
		System.out.println("3--------MODIFY PHONE NO");
		System.out.println("4--------MODIFY ADRESS");
		System.out.println("5--------MODIFY DATE OF JOINING");
		System.out.println("6--------MODIFY DATE OF BIRTH ");
		System.out.println("7--------MODIFY PROJECT_ID");
		System.out.println("8--------MODIFY DEPARTMENT ID");
		System.out.println("9-------MODIFY ROLES_ID");
		Employee em=new Employee();
		Employee temp=new Employee();
		String id =((String)hmap.get(10));
		for(Employee e : al) 
		{
			if(id.equals(e.getEmployeeid()))
			{
				temp=e;
				em=e;
			}
			
		}
		al.remove(temp);
		if(flag[1]==true)
		{
			em.setName((String)hmap.get(1));
		}
		if(flag[2]==true)				
		{			
			em.setEmail_id((String)hmap.get(2));
		}
		if(flag[3]==true)
		{
			em.setPhoneno((String)hmap.get(3));
		}
		if(flag[4]==true)
		{
			em.setAdress((String)hmap.get(4));
		}
		if(flag[5]==true)
		{
			em.setDoj((String)hmap.get(5));
		}
		if(flag[6]==true)
		{
			em.setDob((String)hmap.get(6));
		}
		if(flag[7]==true)
		{
			em.setProject_id((String)hmap.get(7));
		}
		if(flag[8]==true)
		{
			em.setDepartment_id((String)hmap.get(8));
		}
		if(flag[9]==true)
		{
			em.setRoles_id((String)hmap.get(9));		
		}
		al.add(em);
	}
	
	
	public void RemoveEmployee(String id) 
	{
		
		System.out.println("Do you want to remove(Y/N)");
		Scanner scanner=new Scanner(System.in);
		String option = scanner.next();
		if(option.equals("Y"))
		{
			Iterator<Employee> it = al.iterator();
			while (it.hasNext()) 
				{
					Employee user = it.next();
						if (user.getEmployeeid().equals(id)) 
							{
								it.remove();
							}
				}
		}
	}
	


	public void SearchEmployee(String s) 
	{
		for(Employee e : al) 
			{
				String temp1 = e.getEmail_id();
				String temp2 = e.getEmployeeid();
				if( temp1.equals(s) ||temp2.equals(s))
					{
						System.out.println("Employee details ="+ e);
		            }
			}
	}
	public void GetallEmployee() 
	{
		for (Employee a : al) 
			{
			System.out.println("Employee details = " + a);
			}
	}
	
	
}
