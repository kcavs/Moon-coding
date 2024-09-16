public class NoGravity{
    public static void main(String[]args){
        int distance= 380000.0;
        int rate= 10;
        int perSec= distance/rate;
        int perHour= (perSec/60)/60;
        System.out.print(perHour);
    }
}