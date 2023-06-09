import java.util.Scanner;

public class MainFraction {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        Fraction B=new Fraction();
        Fraction C=new Fraction();
        System.out.println("please enter the two numerator and two denominator: ");
        B.setnumerator(A.nextInt());
        C.setnumerator(A.nextInt());
        B.setdenominator(A.nextInt());
        C.setdenominator(A.nextInt());
        System.out.println("Fraction Response: "+(B.getnumerator()*C.getnumerator())/(B.getdenominator()*C.getdenominator()));
        A.close();
    }
    
}
