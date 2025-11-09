public class Constructors {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Mahipal");
        Student s3 = new Student(123);
        //Student s4 = new Student("aman");
        //System.out.println((s1.name));
    }
}

class Student {
    String name;
    int roll;

   Student() {
        System.out.println("constructor is called...");
    
    }

   Student(String name) {
    this.name = name;
   }
   Student(int roll) {
    this.roll = roll;
   }
}
