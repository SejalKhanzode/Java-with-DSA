// Write a program that will ask the user to enter his/her marks (out of 100). 
// Define a method that will display grades according to the marks entered as below:

// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 

package Methods;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks :");
        int marks = sc.nextInt();

        String result = Grades(marks);
System.out.println("Grades "+ result);
    }

    static String Grades(int marks) {
        String result;
        if (marks >= 91  && marks <= 100) {
            result = "AA";
        }
       else if (marks >= 81  && marks <= 90) {
            result = "AB";
        }
        else if (marks >= 71  && marks <= 80) {
            result = "BB";
        }
        else if (marks >= 61 &&  marks <= 70) {
            result = "BC";
        }
        else if (marks >= 51  && marks <= 60) {
            result = "CD";
        }
        else if (marks >= 41  && marks <= 50) {
            result = "DD";
        }
        else if (marks <= 40) {
            result = "Fail";
        }
        else{
            result ="check input";
        }
        return result;

    }
}
