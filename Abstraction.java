package com.company;
import java.util.Scanner;
abstract class display{
    abstract void tamil();
    abstract void english();
    abstract void maths();
    void science(){
        System.out.println("Enter the Science Mark");
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        System.out.println("Registered Succesfully!");
    }
    void social() {
        System.out.println("Enter the Social Mark");
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        System.out.println("Registered Succesfully!");
    }
}
class mark extends display
{
    void tamil()
    {
        System.out.println("Enter the tamil Mark");
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        System.out.println("Registered Succesfully!");
    }
    void english()
    {
        System.out.println("Enter the English Mark");
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        System.out.println("Registered Succesfully!");
    }
    void maths()
    {
        System.out.println("Enter the Maths Mark");
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        System.out.println("Registered Succesfully!");
    }
}
class Main
{
    public static void main(String [] args)
    {
        mark n = new mark();
        Scanner in = new Scanner(System.in);
        System.out.println("1.Tamil Mark" +"\n"+
                "2.English Mark " +"\n"+
                "3.Maths Mark" +"\n"+
                "4.Science Mark" +"\n"+
                "5.Social Mark");
        System.out.println("Enter your choice : ");
        int i=in.nextInt();
        switch(i)
        {
            case 1:
                n.tamil();
                break;
            case 2:
                n.english();
                break;
            case 3 :
                n.maths();
                break;
            case 4:
                n.science();
                break;
            case 5 :
                n.social();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
