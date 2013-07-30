package com.example.roommate2;


public class Person {

	/**
	 * items of information
	 */
	protected String name;
	protected int age;
	protected int rent;
	protected String location;
	protected Gender gender;
	protected HouseStatus houseStatus;
	protected Relationship relationship;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Person() {
		this.name = null;
		this.age = 0;
		this.rent = 0;
		this.location = null;
		this.gender = Gender.FEMALE;
		this.houseStatus = HouseStatus.NO;
		this.relationship = Relationship.SINGLE;
	}

	public int getGenderResId() {
		switch (gender){
		case FEMALE:
			return R.drawable.icon72;
		case MALE:
			return R.drawable.iconwhere;
		}
		return 0;
	}
	

}






