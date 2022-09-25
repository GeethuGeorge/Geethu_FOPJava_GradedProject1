package com.gradedcoding.assignment.FOP;

public class Driver {

	public static void main(String[] args) {
		AdminDepartment objAdmin=new AdminDepartment();
		
		String dn=objAdmin.departmentName();
		System.out.println("Welcome to "+ dn);
		
		String tw=objAdmin.getTodaysWork();
		System.out.println(tw);
		
		String dl=objAdmin.getWorkDeadline();
		System.out.println(dl);
		
		String hy=objAdmin.isTodayAHoliday();
		System.out.println(hy);
		
		System.out.println();
		
	   HrDepartment objHr=new HrDepartment();
	   
		String dnA=objHr.departmentName();
		System.out.println("Welcome to "+ dnA);
		
		String twW=objHr.doActivity();
		System.out.println(twW);
		
		String dlL=objHr.getTodaysWork();
		System.out.println(dlL);
		
		String hld=objHr.getWorkDeadline();
		System.out.println(hld);
	   
		String hlh=objAdmin.isTodayAHoliday();
		System.out.println(hlh);
		
		System.out.println();
	   
		TechDepartment objTech=new TechDepartment();
		
		String dntech=objTech.departmentName();
		System.out.println("Welcome to "+ dntech);
		
		String dnwork=objTech.getTodaysWork();
		System.out.println(dnwork);
		
		String twd=objTech.getWorkDeadline();
		System.out.println(twd);
		
		String gtsl=objTech.getTechStackInformation() ;
		System.out.println(gtsl);
	
		String htech=objTech.isTodayAHoliday();
		System.out.println(htech);

	}
}