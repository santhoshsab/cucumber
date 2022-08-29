package org.scc;

public class Changes extends Std {
	
	
	@Override
	public void stdAddress() {
		System.out.println("student address is ecr for 2022");
	}
	
	public static void main(String[] args) {
		Changes c = new Changes();
		c.stdAddress();
		c.stdName();
	}
}
