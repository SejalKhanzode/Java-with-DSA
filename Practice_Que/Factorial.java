package Practice_Que;
import java.util.*;

public class Factorial {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        while(n>=1){
            fact=fact*n;
            n=n-1;
        }
        System.out.println("factorial is : "+fact);
    }
}
