/*main program convrts secons. */
import java.util.Scanner;

public class MainConvertSeconds {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        ConvertSeconds B=new ConvertSeconds();
        System.out.println("please enter the seconds: ");
        B.setTime(A.nextInt());
        B.Mohasebat();
    A.close();
    }
}
//M.T