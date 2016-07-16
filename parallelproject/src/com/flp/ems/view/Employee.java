package com.flp.ems.view;

public class Employee 
	{
	private String Employeeid;
	private String name;
	private String email_id;
	private String dob;
	private String phoneno;
	private String doj;
	private String Adress;
	private String project_id;
	private String Department_id;
	private String roles_id;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Employeeid == null) ? 0 : Employeeid.hashCode());
		result = prime * result + ((email_id == null) ? 0 : email_id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Employeeid == null)
		{
			if (other.Employeeid != null)
				return false;
		} 
		else if (!Employeeid.equals(other.Employeeid))
			return false;
		if (email_id == null) 
		{
			if (other.email_id != null)
				return false;
		} 
		else if (!email_id.equals(other.email_id))
			return false;
			return true;
	}
	
	public String getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(String employeeid) {
		Employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public String getDepartment_id() {
		return Department_id;
	}
	public void setDepartment_id(String department_id) {
		Department_id = department_id;
	}
	public String getRoles_id() {
		return roles_id;
	}
	public void setRoles_id(String roles_id) {
		this.roles_id = roles_id;
	}
	public void setEmployee()
	{
		this.name=name;
		this.email_id=email_id;
		this.dob=dob;
		this.doj=doj;
		this.Adress=Adress;
		this.Department_id=Department_id;
		this.project_id=project_id;
		this.roles_id=roles_id;
		this.phoneno=phoneno; 
		
	}
	public void getEmployee()
	{
		System.out.println(this.name=name);
		System.out.println(this.email_id=email_id);
		System.out.println(this.dob=dob);
		System.out.println(this.doj=doj);
		System.out.println(this.Adress=Adress);
		System.out.println(this.Department_id=Department_id);
		System.out.println(this.project_id=project_id);
		System.out.println(this.roles_id=roles_id);
		System.out.println(this.phoneno=phoneno); 
	}
	@Override
	public String toString()
	{
		return "Employee [Employeeid=" + Employeeid + ", name=" + name + ", email_id=" + email_id + ", dob=" + dob
				+ ", phoneno=" + phoneno + ", doj=" + doj + ", Adress=" + Adress + ", project_id=" + project_id
				+ ", Department_id=" + Department_id + ", roles_id=" + roles_id + "]";
	}
	public String getPhoneno() 
	{
		return phoneno;
	}
	public void setPhoneno(String phoneno) 
	{
		this.phoneno = phoneno;
	}
	
	

	
}
