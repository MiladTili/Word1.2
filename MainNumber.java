/* Main program Nimber. */
import java.util.Scanner;
public class MainNumber {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        Number B=new Number();
        System.out.println("please enter the number: ");
        B.setnumber1(A.nextInt());
        B.setnumber2(A.nextInt());
        A.close();
    }
}
//M.T