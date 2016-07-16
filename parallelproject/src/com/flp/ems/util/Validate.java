package com.flp.ems.util;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
			static public boolean is_name_valid(String name)
			{
				if(name.matches("[A-Za-z0-9]+"))
					return true;
				else 
					return false;
			}
	
			static public boolean is_employe_id_valid(String id)
			{
				if(id.matches("[A-Za-z0-9]+"))
					return true;
				else 
					return false;
			}
			static public  boolean is_email_valid(String Email)
			{
				String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
				Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(Email);
				return matcher.matches();
			}
			
			
			static public boolean validatePhoneNumber(String phoneNo)
			{
			//validate phone numbers of format "1234567890"
			if (phoneNo.matches("\\d{10}")) return true;
			//validating phone number with -, . or spaces
			else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
			//validating phone number with extension length from 3 to 5
			else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
			//validating phone number where area code is in braces ()
			else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
			//return false if nothing matches the input
			else return false;
			}
	
	
			static public boolean is_dob_valid(String dob)
			{
				Pattern pattern =Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
				Matcher matcher = pattern.matcher(dob);
				return matcher.matches();
			}
			static public boolean is_doj_valid(String doj)
			{
				Pattern pattern =Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
				Matcher matcher = pattern.matcher(doj);
				return matcher.matches();
			}
	
			static public boolean is_adress_valid(String adress)
			{
				if(adress.matches("[A-Za-z0-9]+"))
					return true;
				else
					return false;
			}
		
			static public boolean is_projectid_valid(String project_id)
			{
				if(project_id.matches("[A-Za-z0-9]+"))
					return true;
				else
					return false;
			}
		
			static public boolean is_department_id_valid(String department_id)
			{
				if(department_id.matches("[A-Za-z0-9]+"))
					return true;
				else
					return false;
			} 
	  
	  
			static public boolean is_roles_id_valid(String roles_id)
			{
				if(roles_id.matches("[A-Za-z0-9]+"))
					return true;
				else
					return false;
			}		
			}


	
	
	

