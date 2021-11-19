package com.syntax1;

public class StringReview {
public static void main(String[] args) {
	

String str="Today is Thursday and it is Java class";

boolean empty =str.isEmpty();

System.out.println("My string is empty="+empty);


//str.full(); the method full() is undefined for the type String

int length =str.length() ;

System.out.println("Length of the String is "+length);

// istead Thursday I want to have Monday

str.replace(" Thursdaty", "Monday"); // if you don't reassign it it will print Thursdat
System.out.println(str); // if you reassign it str=str.replace it will print Monday


/*to define a method we MUST
 * 
 *          OPTIONAL       OPTIONAL      MUST              MUST
 *    access modifier    non access       returnType       name()
 * 
 */


String[]allwords=str.split("");

System.out.println(" In my string I have "+allwords.length+"words");
// print all one by one
for (String word:allwords) {
	System.out.print(word+"");
}

//how would you reverse a String?
String give="Hello"; // length-5
System.out.println("");
StringBuilder sb=new StringBuilder(give);
sb.reverse();

System.out.print(sb);

// how would you reverse a String without using reverse
String reverse="";
for (int i=give.length()-1;i>=0;i--) {
	
	reverse+=give.charAt(i);
}
System.out.println();
System.out.println(reverse);

// substring
String s= "Today I am happy";

s=s.substring(6);
System.out.println(s);// I am Happy

s=s.substring(0, 4);
System.out.println(s); // I am
}

}