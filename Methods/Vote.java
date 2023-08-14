// A person is eligible to vote if his/her age is greater than or equal to 18. 
// Define a method to find out if he/she is eligible to vote.


package Methods;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age :");
        int age = sc.nextInt();

        Boolean result = SorNo(age);
        if(result == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    static Boolean SorNo(int age){
        boolean result;
        if(age>=18){
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }

}
