/*The program below receives two numbers from 
the user and performs mathematical calculations 
and prints the result in the output*/
public class Number {
        private int number1;
        private int number2;
        public void setnumber1(int number1){
            this.number1=number1;
        }
        public int getnumber1(){
            return number1;
        }
        public void setnumber2(int number2){
            this.number2=number2;
        }
        public int getnumber2(){
            return number2;
        }
        public void Mohasebat(){
            System.out.print("Total: "+(number1+number2)+"\nSubtraction: "+(number1-number2));
            System.out.print("\nMultiplication: "+number1*number2+"\nDivision: "+(number1/number2 )
            +"\nremaining: "+(number1%number2));
            System.out.println("\nPower: "+Math.pow(number1, number2)+"\nSQRT: "+Math.sqrt(number1)+"\nSQRT: "+Math.sqrt(number2));
        }
        }
//M.T
