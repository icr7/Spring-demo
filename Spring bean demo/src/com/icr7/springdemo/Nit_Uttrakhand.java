package com.icr7.springdemo;

public class Nit_Uttrakhand implements Student {
	private Branch myBranch;
	

	public Nit_Uttrakhand(Branch myBranch) {
		
		this.myBranch = myBranch;
	}

	@Override
	public String getCollegeName() {
		// TODO Auto-generated method stub
		return "National institute of technology Uttrakhand";
	}

	@Override
	public String getBranchName() {
		// TODO Auto-generated method stub
		return myBranch.getBranch();
	}

}
