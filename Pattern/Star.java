package Pattern;

public class Star {
    public static void main(String[] args) {

        // fancy pattern
        // for (int row=0 ; row<5 ; row++){
        //     for(int col=0; col<row+1 ; col++){
        //         System.out.print("* ");               
        //     }
        //     System.out.println();
        // }

         for (int row=0 ; row<5 ; row++){
            for(int col=0; col<5-row ; col++){
                System.out.print("* ");               
            }
            System.out.println();
        }


        // palindrome pattern
        // for (int row=0 ; row<5 ; row++){
        //     for(int col=0; col<row+1 ; col++){
        //         System.out.print(col+1);               
        //     }
        
        //     for(int col=row; col>=1; col--){
        //         System.out.print(col);               
        //     }
        //     System.out.println();
        // }
    }
}
