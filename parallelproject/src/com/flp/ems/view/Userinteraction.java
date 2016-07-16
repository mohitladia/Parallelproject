package com.flp.ems.view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;


import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;



public class Userinteraction 
{	
	static HashMap <Integer,Object>hashMap = new HashMap();
		public void AddEmployee()
		{	
		// 1.EMPLOYEE NAME
		System.out.println("ENTER THE NAME ");
		Scanner scanner= new Scanner(System.in);
		String name=scanner.next();
		if(!Validate.is_name_valid(name))
		System.out.println("INVALID NAME");
		
		hashMap.put(1, name);
		
		
		// 2.EMPLOYEE ID
		System.out.println("ENTER YOUR EMPLOYMENT ID");
		String id = scanner.next();
		if(!Validate.is_employe_id_valid(id))
		System.out.println("INVALID EMPLOYMENT ID");
		hashMap.put(2,id);
		
		//3.EMPLOYEE EMAIL ID
		System.out.println("ENTER YOUR EMAIL ADRESS");
		String email_id=scanner.next();
		if(!Validate.is_email_valid(email_id))
		System.out.println("INVALID EMAIL ID");
		hashMap.put(3,email_id);
		
		
		//4.PHONE NO
		System.out.println("ENTER YOUR PHONE NO");
		String phoneNo=scanner.next();
		if(!Validate.validatePhoneNumber(phoneNo))
		System.out.println("INVALID PHONE NO");
		hashMap.put(4,phoneNo);
		
		//5.DATE OF BIRTH
		System.out.println("ENTER YOUR DATE OF BIRTH");
		String dob = scanner.next();
		if(!Validate.is_dob_valid(dob))
		System.out.println("INVALID DOB");
		hashMap.put(5, dob);
		
		
		//6.DATE OF JOINING
		System.out.println("ENTER YOUR DATE OF JOINING");
		String doj = scanner.next(); 
		if(!Validate.is_doj_valid(doj))
		System.out.println("INVALID DOJ");
		System.out.println(doj);
		hashMap.put(6, doj);
		  
		
		// 7.ADDRESS
		System.out.println("ENTER THE ADRESS");
		String adress=scanner.next();
		if(!Validate.is_adress_valid(adress))
			System.out.println("INVALID ADRESS");
		hashMap.put(7, adress);
		
		//8.PROJECT ID
		System.out.println("ENTER YOUR PROJECT ID");
		String project_id=scanner.next();
		if(!Validate.is_projectid_valid(project_id))
		System.out.println("Invalid project_id");
		hashMap.put(8, project_id);
		
		
		//9.DEPARTMENT ID
		System.out.println("ENTER YOUR DEPARTMENT ID");
		String department_id=scanner.next();
		if(!Validate.is_department_id_valid(department_id))
		System.out.println("INVALID DEPARTMENT ID");
		hashMap.put(9, department_id);
		
		
		//10.ROLES ID
		System.out.println("ENTER THE ROLES ID");
		String roles_id=scanner.next();
		//if(!Validate.is_roles_id_valid(roles_id))
		System.out.println("INVALID ROLES_ID");
		hashMap.put(10,roles_id);
		EmployeeServiceImpl empl =new EmployeeServiceImpl();
		empl.AddEmployee(hashMap);
		
		
		}
		
	public void ModifyEmployee()
	{	
		while(true){
		System.out.println("Enter your employment id");
		Scanner scanner= new Scanner(System.in);
		String id = scanner.next();
		if(Validate.is_employe_id_valid(id));
		System.out.println("1--------MODIFY NAME");
		System.out.println("2--------Modify EMAIL_ID");
		System.out.println("3--------MODIFY PHONE NO");
		System.out.println("4--------MODIFY ADRESS");
		System.out.println("5--------MODIFY DATE OF JOINING");
		System.out.println("6--------MODIFY DATE OF BIRTH ");
		System.out.println("7--------MODIFY PROJECT_ID");
		System.out.println("8--------MODIFY DEPARTMENT ID");
		System.out.println("9-------MODIFY ROLES_ID");
		System.out.println("ENTER THE CHOICE");
		int choice = scanner.nextInt();
		boolean[] flag = new boolean[11];
		switch (choice) 
		{
		case 1:
			System.out.println("ENTER THE NAME OF EMPLOYEE");
			String name = scanner.next();
			if(!Validate.is_name_valid(name))
			System.out.println("INVALID NAME");
			hashMap.put(1,name);
			flag[1]=true;
			
			break;

		case 2:
			System.out.println("ENTER THE EMAIL_ID ");
			String email_id=scanner.next();
			if(!Validate.is_email_valid(email_id))
			System.out.println("INVALID EMAIL_ID");
			hashMap.put(2, email_id);
			flag[2]=true;
			break;
			
		case 3:
			System.out.println("ENTER THE PHONE NO");
			String phone_no=scanner.next();
			if(!Validate.validatePhoneNumber(phone_no))
			System.out.println("INVALID PHONE NO");
			hashMap.put(3,phone_no);
			flag[3]=true;
			break;
			
		case 4:
			System.out.println("ENTER THE ADRESS");
			String adress=scanner.next();
			if(!Validate.is_adress_valid(adress))
			System.out.println("INVALID ADRESS");
			hashMap.put(4, adress);
			flag[4]=true;
			break;
			
		case 5:
			System.out.println("ENTER YOUR DATE OF BIRTH");
			String dob = scanner.next();
			if(!Validate.is_dob_valid(dob))
			System.out.println("INVALID DOB");
			hashMap.put(5, dob);
			flag[5]=true;
			break;
			
		case 6:
			System.out.println("ENTER YOUR DATE OF JOINING");
			String doj = scanner.next(); 
			if(!Validate.is_doj_valid(doj))
			System.out.println("INVALID DOJ");
			hashMap.put(6, doj);
			flag[6]=true;
			break;
			
			
		case 7:
			System.out.println("ENTER YOUR PROJECT ID");
			String project_id=scanner.next();
			if(!Validate.is_projectid_valid(project_id))
			System.out.println("INVALID PROJECT_ID");
			hashMap.put(7, project_id);
			flag[7]=true;
			break;
			
			
			
		case 8:
			System.out.println("ENTER YOUR DEPARTMENT ID");
			String department_id=scanner.next();
			if(!Validate.is_department_id_valid(department_id))
			System.out.println("INVALID DEPARTMENT ID");
			hashMap.put(8, department_id);
			flag[8]=true;
			break;
		case 9:
			System.out.println("ENTER THE ROLES ID");
			String roles_id=scanner.next();
			if(!Validate.is_roles_id_valid(roles_id))
			System.out.println("INVALID ROLES_ID");
			hashMap.put(9,roles_id);
			flag[9]=true;
			break;
			
		}
		hashMap.put(10,id);
		EmployeeServiceImpl empl =new EmployeeServiceImpl();
		empl.ModifyEmployee(hashMap,flag);
		
		
		
		
	}			
	}
	public void RemoveEmployee()
	{
		System.out.println("Enter the employemnt id to remove ");
		Scanner s= new Scanner(System.in);
		String id =s.next();
		EmployeeServiceImpl empl =new EmployeeServiceImpl();
		empl.RemoveEmployee(id);
	}
	public void SearchEmployee()
	{	System.out.println("Search of an Employee");
		System.out.println("1.Search by email id");
		System.out.println("2.Search by employee id");
		System.out.println("Enter the choice");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		switch (choice) 
		{
		case 1:
			System.out.println("Enter the email id to search");
			String email =scanner.next();
			EmployeeServiceImpl empl =new EmployeeServiceImpl();
			empl.SearchEmployee(email);
			break;
		case 2:
			System.out.println("Enter the kin_id to search");
			String kin_id =scanner.next();
			EmployeeServiceImpl emp =new EmployeeServiceImpl();
			emp.SearchEmployee(kin_id);
			default:
				System.out.println("invalid input");
		}
	}
	public void GetallEmployee()
	{
		EmployeeServiceImpl empl =new EmployeeServiceImpl();
		empl.GetallEmployee();
	}
}