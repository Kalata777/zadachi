package alg;

import java.util.LinkedList;
import java.util.Scanner;

public class nizove3 {
	static String str=" ";
	static char[] ch;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter strings:");
str=sc.nextLine();
LinkedList<Character> seq = new LinkedList<>();
LinkedList<Character> list = new LinkedList<>();
for(int i=0;i<str.length();i++) {
	list.add(str.charAt(i));
	for(int j= i+1;j<str.length();j++) {
		if(str.charAt(j)>list.getLast()) {
			list.add(str.charAt(j));
		}
	}
	if(list.size()>seq.size()) {
		seq.clear();
		seq.addAll(list);
	}
	list.clear();
}
System.out.println(seq.toString());
	}
	}

