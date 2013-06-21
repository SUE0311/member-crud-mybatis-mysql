package com.jsnote.model;

/**
 * Member POJO
 * 
 * @author JISU LEE
 */
public class Member {

	private int id;
	private String name;
	private String phone;
	private String email;
	
	
	public Member(int id, String name, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public Member() {}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	
	public boolean equals(Object obj) {  
		Member member = (Member) obj;
		if (this.id != member.id){
			return false;
		}
		if (!this.name.equals(member.getName())){
			return false;
		}
		if (!this.phone.equals(member.getPhone())){
			return false;
		}
		if (!this.email.equals(member.getEmail())){
			return false;
		}
		return true;
	}
}
