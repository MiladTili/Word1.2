/*The following program receives seconds from 
the user and converts them into hours
minutes and seconds. */
public class ConvertSeconds{
    private int seconds;
    public void setTime(int seconds){
        this.seconds=seconds;
    }
    public int getTime(){
        return seconds;
      }
    public void Mohasebat(){
        int hour,min,sec;
        hour=seconds/3600;
        min=(seconds%3600)/60;
        sec=min%60;
        System.out.println("The time is: "+hour+':'+min+':'+sec);
    }
    }      
    //M.T