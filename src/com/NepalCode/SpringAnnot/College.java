package com.NepalCode.SpringAnnot;

public class College {
	
	private Principal principal;
	
	private Teacher teacher;
	
	/*public College(Principal principal) {
		this.principal = principal;
	}
	*/

	public void collegeTest() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("college test started");
	}
	

	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("Setter method called");
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
	
	

}

