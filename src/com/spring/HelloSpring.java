package com.spring;

public class HelloSpring {
	//HelloSpringµƒ Ù–‘
	private String words = null;
	private String person=null;
	public String getWords() {
		return words;
	}


	public void setWords(String words) {
		this.words = words;
	}


	public String getPerson() {
		return person;
	}


	public void setPerson(String person) {
		this.person = person;
	}


	public void print(){
		System.out.println(this.getPerson()+"Àµ:"+ this.getWords() + "!!");
	}
	
	
}
