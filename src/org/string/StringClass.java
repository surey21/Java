package org.string;

public class StringClass {

	public static void main(String[] args) {
		String a = "Welcome to great magic show ";
		String a1 = "welcome to great magic show";


		int length = a.length();
		System.out.println(length);		

		String upperCase = a.toUpperCase();
		System.out.println(upperCase);

		String LowerCase =a.toLowerCase();
		System.out.println(LowerCase);

		boolean equals = a.equals(a1);
		System.out.println(equals);

		boolean equalsIgnoreCase = a.equalsIgnoreCase(a1);
		System.out.println(equalsIgnoreCase);

		int indexOf = a.indexOf('e');
		System.out.println(indexOf);
		
		int lastIndexOf = a.lastIndexOf('e');
		System.out.println(lastIndexOf);
		
		char charAt = a.charAt(0);
		System.out.println(charAt);
		
		boolean contains = a.contains("Wel");
		System.out.println(contains);
		
		String replace = a.replace("Welcome", "Hai");
		System.out.println(replace);
		
		String replaceAll = a.replaceAll("e", " ");
		System.out.println(replaceAll);
		
		boolean startsWith = a.startsWith("We");
		System.out.println(startsWith);
		
		boolean endsWith = a.endsWith("ow");
		System.out.println(endsWith);
		
		boolean empty = a.isEmpty();
		System.out.println(empty);
		
		String trim = a.trim();
		System.out.println(trim);
		
		String substring = a.substring(6);
		System.out.println(substring);
		
		CharSequence subSequence = a.subSequence(4, 8);
		System.out.println(subSequence);
		
		String substring2 = a.substring(1, 15);
		System.out.println(substring2);
		
		int compareTo = a.compareTo(a1);
		System.out.println(compareTo);
		System.out.println(substring2);
		
		
		


	}
}
