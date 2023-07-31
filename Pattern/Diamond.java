package Pattern;

public class Diamond {
    public static void main(String[] args) {
        for(int i=0 ; i<5 ; i++){
            for(int j=0; j<5-i-1 ; j++){
               System.out.print(" ");
            }
            for(int j=0 ; j<i+1 ; j++){
               System.out.print("* ");
            }
            System.out.println();
        }

        for(int row=0 ; row<5 ; row++){
            for(int col=0; col<row ; col++){
               System.out.print(" ");
            }
            for(int col=0 ; col<5-row ; col++){
               System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
