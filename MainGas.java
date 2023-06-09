/* Main gas program. */
import java.util.Scanner;
public class MainGas {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        Gas B=new Gas();
        System.out.println("please enter the distance and Consumption and Liter: ");
        B.setdistance(A.nextInt());B.setConsumption(A.nextInt());B.setliter(A.nextInt());
        B.Mohasebat();
        A.close();
    }
}
//M.T