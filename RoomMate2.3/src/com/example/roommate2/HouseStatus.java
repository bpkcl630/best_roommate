package com.example.roommate2;

public enum HouseStatus {

	YES("有房", true), NO("无房", false);
	private final String name;
	private boolean value;

	HouseStatus(String name, boolean value) {
		this.name = name;
		this.value = value;
	}

	public boolean getValue() {
		return value;
	}

	public String getString() {
		return name;
	}
}
