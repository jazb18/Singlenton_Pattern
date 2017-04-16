package com.jazb.pattern;

public class Singlenton {
	
	private static Singlenton instance;
	
	private Singlenton(){}
	
	public static Singlenton getInstance(){
		if (instance == null) {
			return new Singlenton(); 
		}
		return instance;
	}
	
}
