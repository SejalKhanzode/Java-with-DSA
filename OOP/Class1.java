public class Class1 {
    public static void main(String[] args) {
        // Student[] kunal = new Student[5];

        Student kunal = new Student();
        System.out.println(kunal.rno);
    }
    
}
class Student{
        int rno;
        String name= "kunal";
        float marks;

         Student(){
            this.rno = 13;
            this.name = "Kunal";
            this.marks = 88.5f;
         }
    }