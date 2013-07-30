package com.example.roommate2;

public enum Relationship {
	SINGLE("����", 1), COUPLE("����", 2);

	private String name;
	private int value;

	private Relationship(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
	
	public   static  String getName( int  index) {  
        for  (Relationship c : Relationship.values()) {  
            if  (c.getValue() == index) { 
                return  c.name;  
            }  
        }  
        return   null ;  
    }  
}