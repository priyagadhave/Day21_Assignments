package com.userregistrationucTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    public static void welcome() {
        System.out.println("Welcome to User Registration System Problem");
    }

    public static void main(String[] args) {
        List emails = new ArrayList();
        //Valid Emails
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

        Pattern pattern = Pattern.compile(regex);

        for(Object emaillist : emails){
            Matcher matcher = pattern.matcher((String) emaillist);
            System.out.println(emaillist +" : "+ matcher.matches());
        }
        welcome();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Last Name");
        System.out.println("Enter 3 : to validate Email");
        System.out.println("Enter 4 : to validate Mobile Number");
        System.out.println("Enter 5 : to validate Password");
        switch (scanner.nextInt()){
            //    case 1:
            //   UserRegistration.validFirstName();
            //   break;
            //  case 2:
            //  UserRegistration.validLastName();
            //  break;
            //  case 3:
            //   UserRegistration.validEmail();
            //  break;
            // case 4:
            //  UserRegistration.validMobileNumber();
            // break;
            //case 5:
            // UserRegistration.validPassword();
            //  break;
        }//
    }
}
