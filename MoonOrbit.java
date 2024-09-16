public class MoonOrbit{
    public static void main(Sttring[]args){
        int hChange= 2000;
        int vChange= 3000;
        int tChangeSq= ((3000*3000)+(2000*2000));
        int tChange= Math.sqrt(tChangeSq);
        System.out.print("the total speed change needed is "+tChange);
    }
}