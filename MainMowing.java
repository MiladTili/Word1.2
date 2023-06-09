import java.util.Scanner;

public class MainMowing {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        Mowing B=new Mowing();
        Mowing C=new Mowing();
        System.out.println("Please Enter two number for length and width home and length and width Yard: ");
        B.setlength(A.nextInt());
        C.setlength(A.nextInt());
        B.setwidth(A.nextInt());
        C.setwidth(A.nextInt());
        System.out.println("Time required for mowing:"+(((B.getlength()*B.getwidth())-(C.getlength()*C.getwidth())/2.3)/60)+"(in minutes).");
        A.close();
    }
    
}
