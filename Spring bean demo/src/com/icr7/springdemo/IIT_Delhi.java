package com.icr7.springdemo;

public class IIT_Delhi implements Student {
    private Branch myBranch;
    
	public IIT_Delhi(Branch myBranch) {
		
		this.myBranch = myBranch;
	}

	@Override
	public String getCollegeName() {
		// TODO Auto-generated method stub
		return "Indian institute of technology Delhi";
	}

	@Override
	public String getBranchName() {
		// TODO Auto-generated method stub
		return myBranch.getBranch();
	}

}
