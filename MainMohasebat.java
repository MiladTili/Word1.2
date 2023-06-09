import java.util.Scanner;

public class MainMohasebat {
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        Mohasebat X=new Mohasebat();
        Mohasebat Y=new Mohasebat();
        Mohasebat Z=new Mohasebat();
        System.out.println("Please enter the Three number: ");
        X.setnumber(A.nextInt());
        Y.setnumber(A.nextInt());
        Z.setnumber(A.nextInt());
        System.out.println("1) "+Math.round((Math.pow(X.getnumber(),Y.getnumber())+(Math.pow(Y.getnumber(),X.getnumber()))/Math.abs(Z.getnumber()))));
        System.out.println("2) "+Math.floor(Math.pow(2.71828, Y.getnumber())-(Math.log(X.getnumber()*Y.getnumber()))));
        System.out.println("3) "+Math.ceil((Math.max(X.getnumber(),Y.getnumber())%Math.min(Y.getnumber(),Z.getnumber()))));
        A.close();
    }
}
