public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.SetTip(5);
        System.out.println(p1.tip);
        //p1.setcolor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);

    }


}
 class Pen {
    //define all functions and properties
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    
    }
    void SetTip(int newTip) {
        tip = newTip;
    }
 }
 

 class Student{
    String name;
    int age;
    float percentage; //cgpa

    void calcpercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Mahipal Goyal";
        myAcc.setPassword("abcdefghi");

    }
 }

 class BankAccount {
    public String username;
    private String password;
    //private void setPassword(String pwd) {
        password = pwd;
    }
 }
