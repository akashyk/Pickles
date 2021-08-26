package com.favorite.pickle.api.model;

public class Pickle {
	private String name;
	private String taste;
	public Pickle(String name, String taste) {
		super();
		this.name = name;
		this.taste = taste;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
}
