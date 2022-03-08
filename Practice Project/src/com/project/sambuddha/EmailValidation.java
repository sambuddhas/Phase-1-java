package com.project.sambuddha;
import java.util.*;
import java.util.regex.*;
public class EmailValidation {
public static void main(String[] args) {

List<String> emails = new ArrayList<String>();

for (String value : emails) {
System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
//valid email addresses emails.add("gajendraverma@xyz.com");
//invalid email addresses emails.add("aguero.kun.xyz.com");
}
System.out.println("Enter a email address to check"); Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));


}

public static boolean isValidEmail(String email) { String regex = "^(.+)@(.+)$";
Pattern pattern = Pattern.compile(regex); Matcher matcher = pattern.matcher(email); return matcher.matches();


}

}
