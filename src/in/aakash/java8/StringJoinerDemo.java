package in.aakash.java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		// StringJoiner sj1=new StringJoiner(" ");//aakash milan patel
		StringJoiner sj1 = new StringJoiner("-");// aakash-milan-patel

		sj1.add("aakash");
		sj1.add("milan");
		sj1.add("patel");
		System.out.println(sj1);// aakash-milan-patel

		StringJoiner sj2 = new StringJoiner("-", "[", "]");
		sj2.add("AAKASH");
		sj2.add("MILAN");
		sj2.add("PATEL");
		System.out.println(sj2); // [AAKASH-MILAN-PATEL]

	}
}
