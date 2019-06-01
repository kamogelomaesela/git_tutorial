package com.psybergate.git.tut;

import java.util.Date;

public class Customer {

	private long customerNum = 1234;

	private String name = "Kamogelo";

	private String surname = "Maesela";

	private Date dateOfBirth ;


	public Customer (){

	}


	public String toString(){
		return "customerNum="+ customerNum + "name=" + name + "surname=" + surname + "Date of birth ="+dateOfBirth;
	} 

	public static void main(String[] args) {
		System.out.println(new Customer().toString());
	}


}