package com.xworkz.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();
		collection.add("Titan");
		collection.add("Daniel Klein");
		collection.add("Swatch");
		collection.add("Timex");
		collection.add("Casio");
		collection.add("Rolex");
		collection.add("Tommy Hilfiger");
		collection.add("Fastrack");
		collection.add("Titan");

		Collection<String> watch = collection.stream().filter((r) -> r.startsWith("T")).collect(Collectors.toList());
		watch.forEach((h) -> System.out.println(h));
		System.out.println(watch.size());

		System.out.println("*******************************");
		Collection<String> pan = new ArrayList<String>();

		pan.add("EKGPK3456G");
		pan.add("AAKPK3456G");
		pan.add("MKGPK1206G");
		pan.add("ABGPK7899G");
		pan.add("WEGPK4506G");
		pan.add("AGPKJ3456G");

		Collection<String> temp = pan.stream().filter((l) -> l.startsWith("A")).collect(Collectors.toList());
		temp.forEach((m) -> System.out.println(m));
		System.out.println(temp.size());

		System.out.println("************************************");

		Collection<String> usn = new ArrayList<String>();
		usn.add("1GH15EC412");
		usn.add("1SK16CS567");
		usn.add("1SI18EC007");
		usn.add("1HM16CS003");
		usn.add("1SP16CS014");

		Collection<String> value = usn.stream().filter((f) -> f.contains("CS")).collect(Collectors.toList());
		value.forEach((v)->System.out.println(v));
		System.out.println(value.size());
	}

}
