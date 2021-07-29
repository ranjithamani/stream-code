package com.xworkz.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		Collection<String> collection =Arrays.asList("Titan","Swatch","Timex","Casio","Tommy Hilfiger","Titan");
		
		Collection<String> watch = collection.stream().sorted().filter((r) -> r.startsWith("T")).collect(Collectors.toList());
		watch.forEach((h) -> System.out.println(h));
		System.out.println(watch.size());

		System.out.println("*******************************");
		
		Collection<String> pan =Arrays.asList("EKGPK3456G","AAKPK3456G","MKGPK1206G","ABGPK7899G","WEGPK4506G","AGPKJ3456G");
		Collection<String> temp = pan.stream().filter((l) -> l.startsWith("A")).collect(Collectors.toList());
		temp.forEach((m) -> System.out.println(m));
		System.out.println(temp.size());

		System.out.println("************************************");

		Collection<String> usn =Arrays.asList("1GH15EC412","1SK16CS567","1SI18EC007","1HM16CS003","1SP16CS014");

		Collection<String> value = usn.stream().filter((f) -> f.contains("CS")).collect(Collectors.toList());
		value.forEach((v)->System.out.println(v));
		System.out.println(value.size());
	}

}
