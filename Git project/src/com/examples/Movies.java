package com.examples;

public class Movies {
	
	private String name;
	private int rating;
	private String releaseYear;
	
	




	public Movies(String name, int rating, String releaseYear) {
		super();
		this.name = name;
		this.rating = rating;
		this.releaseYear = releaseYear;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public String getReleaseYear() {
		return releaseYear;
	}



	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	@Override
	public String toString() {
		return "Movies [name=" + name + ", rating=" + rating + ", releaseYear=" + releaseYear + "]";
	}

}
