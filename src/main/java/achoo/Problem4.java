package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem4 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String one = a.nextLine();
        System.out.print("Enter a verb: ");
        String two = a.nextLine();
        System.out.print("Enter a adjective: ");
        String three = a.nextLine();
        System.out.println("Is your " + three + " " + one + " running? Better go and " + two);
    }
}
