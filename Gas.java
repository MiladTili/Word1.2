/*The following program takes the distance and 
cost of each liter of gasoline and consumption 
per kilometer per liter from the user and 
calculates the cost of gasoline in dollars.*/
public class Gas {
    private int distance;
    private int Liter;
    private int Consumption;
    public void setdistance(int distance){
        this.distance=distance;
    }
    public int getdistance(){
        return distance;
    }
    public void setliter(int Liter){
        this.Liter=Liter;
    }
    public int getLiter(){
        return Liter;
    }
    public void setConsumption(int Consumption){
        this.Consumption=Consumption;
    }
    public int getConsumption(){
        return Consumption;
    }
    public void Mohasebat(){
        int X;
        X=(distance/Consumption)*Liter;
        System.out.println("The distance you want to go is $"+X+"for your gas price.");
    }
}
//M.T