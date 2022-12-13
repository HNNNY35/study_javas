package InheritanceVehicles;

public class InheritanceVehicles extends Object{
    public static void main(String[] args) {
        int kms = 100;
        int hours = 2;
        int height = 30;
        int width = 40;
        int depth = 50;
        int oneway_count = 10;

        System.out.printf("kms : %d, hours : %d \nheight : %d, width : %d, depth : %d\noneway_count : %d\n",
        kms, hours, height, width, depth, oneway_count);

        Vehicles vehicles = new Vehicles();
        System.out.println("Vehicles");
        System.out.printf("vehicles.speed : %d\n", vehicles.speed(kms, hours));
        System.out.printf("vehicles.weight : %d\n",vehicles.weight(height, width, depth));
        
        Vans vans = new Vans();
        System.out.println("Vans");
        System.out.printf("vans.speed : %d\n",vans.speed(kms, hours));
        System.out.printf("vans.weight : %d\n",vans.weight(height, width, depth));
        
        Cars cars = new Cars(oneway_count);
        System.out.println("Cars");
        System.out.printf("cars.speed : %d\n",cars.speed(kms, hours));
        System.out.printf("cars.weight : %d\n",cars.weight(height, width, depth));
        

        System.out.println("Done");

    }
}
