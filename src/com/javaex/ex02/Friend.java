package com.javaex.ex02;

public class Friend {

    private String name;
    private String hp;
    private String school;
    
	public Friend() {
	}

	public Friend(String[] strings) {
		this.name = strings[0];
		this.hp = strings[1];
		this.school = strings[2];
	}
	
	public Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	

    

}
