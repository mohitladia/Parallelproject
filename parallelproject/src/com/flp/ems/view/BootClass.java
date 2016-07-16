package com.flp.ems.view;
import java.util.Scanner;


public class BootClass 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM!!!!!!");
			System.out.println("1 ------------------ ADD EMPLOYEE");
			System.out.println("2 ------------------ MODIFY EMPLOYEE");
			System.out.println("3 -------------------REMOVE EMPLOYEE");
			System.out.println("4 ------------------ SEARCH EMPLOYEE");
			System.out.println("5 ----------------- GET ALL EMPLOYEE");
			menu_selection();
		}
	}
		public static void menu_selection()
			{
				System.out.println("Enter your choice");
				Scanner s = new Scanner(System.in);
				int choice = s.nextInt();
				Userinteraction us = new Userinteraction();
				switch(choice)
				{
					case 1:  us.AddEmployee();break;
					case 2:  us.ModifyEmployee();break;
					case 3:  us.RemoveEmployee();break;
					case 4:  us.SearchEmployee();break;
					case 5:  us.GetallEmployee();break;
					default: System.out.println("invalid input");
				}
			}
}
		
			
				
		
			
					
					
				
				


		
		
		
		
		
		
	
	
	
	
	
	


