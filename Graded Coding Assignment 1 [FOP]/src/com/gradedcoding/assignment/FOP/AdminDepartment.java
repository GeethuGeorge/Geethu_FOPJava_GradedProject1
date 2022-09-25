package com.gradedcoding.assignment.FOP;



//child class
class AdminDepartment extends SuperDepartment {
	//method 1
   public String departmentName() {
		return "Admin Department";
  }
   @Override
   public String getTodaysWork() { 
  	 return "Complete your documents Submission";
   }
   @Override
   public String getWorkDeadline() {
  	 return "Complete by EOD ";
   }
   
}