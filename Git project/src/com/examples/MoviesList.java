package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MoviesList {

	public static void main(String[] args) {

		List<Movies> moviesList = new ArrayList<>();
		Movies m1 = new Movies("varisu", 4, "2022");
		Movies m2 = new Movies("Komban", 5, "2021");
		moviesList.add(m1);
		moviesList.add(m2);
		// list count
		System.out.println("List Size:" + moviesList.size());
		// normal forloop
		for (int i = 0; i < moviesList.size(); i++) {
			System.out.println(moviesList.get(i));
		}
		// for each loop
		for (Movies m : moviesList) {
			System.out.println(m);
		}
		int i = 0;
		// while loop
		while (i < moviesList.size()) {
			System.out.println(moviesList.get(i));
			i++;
		}
		int i1 = 0;
		// do while loop
		do {
			System.out.println("do:" + moviesList.get(i1));
			i1++;
		} while (i1 < moviesList.size());
		// Iterator
		Iterator<Movies> it = moviesList.iterator();
		while (it.hasNext()) {
			System.out.println("iterator:" + it.next());
		}
		// ListIterator
		ListIterator<Movies> listIterator = moviesList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println("List iterator:" + listIterator.next());
		}
		//java 8 -lamda exp
		moviesList.forEach(movies -> System.out.println(movies));
        //java 8 -stream lamda exp
		moviesList.stream().forEach(movies -> System.out.println(movies));
		// java 8 for each
		moviesList.forEach(System.out::println);

		int id = 10;

		switch (id) {
		case 10:
			System.out.println("Value is 10");
			break;
		case 20:
			System.out.println("Value is 20");
			break;

		}
		// TODO Auto-generated method stub

	}

}
