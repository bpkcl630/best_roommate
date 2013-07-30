package com.example.roommate2;

public enum Gender {
	FEMALE("Å®", 0), MALE("ÄÐ", 1);
	private String name;
	private int value;

	private Gender(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String getString() {
		return name;
	}
}