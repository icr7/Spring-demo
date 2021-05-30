package com.icr7.springdemo;

public class Gbpiet implements Student {
	//define a private field for the dependency
	private Branch myBranch;
	
	//create no-args constructor
	public Gbpiet() {
		//inside no-arg constructor 
	}
	
	//our setter method
	public void setMyBranch(Branch myBranch) {
		this.myBranch = myBranch;
	}

	@Override
	public String getCollegeName() {
		return "G.B Pant institute of engineering and technology Pauri Garwal";
	}

	@Override
	public String getBranchName() {
	// use myBranch to get Branch 
		return myBranch.getBranch();
	}

}
