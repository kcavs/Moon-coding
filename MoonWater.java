public class MoonWater{
    public static void main(String[]args){
        double surfVol= (4*3.14*(1731000*1731000))*0.001
        double regolith= (surfVol*3000)/1000;
        double water= regolith/4;
        System.out.println("the surface volume in 1mm is "+surfVol);
        System.out.println("there are "+regolith+" metric tons of regolith");
        System.out.println(water+" liters of water");
    }
}