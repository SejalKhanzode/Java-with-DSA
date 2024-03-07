package Pattern;

public class Assignmentque {
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        pattern6(5);
        pattern30(5);
    }

    static void pattern1(int n) {
        // sq star
        System.out.println("1");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        // fancy pattern1
        System.out.println("2");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        // fancy pattern2
        System.out.println("3");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        System.out.println("4");
        for (int row=0 ; row<5 ; row++){
            for(int col=0; col<row+1 ; col++){
                System.out.print(col+1 +" ");               
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        // fancy
        System.out.println("5");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        // fancy
        System.out.println("6");
        for (int row = 0; row <n; row--) {
            for (int col = row; col > 1 ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    static void pattern30(int n){
        System.out.println("30");

    }
}
