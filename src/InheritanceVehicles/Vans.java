package InheritanceVehicles;


public class Vans extends Vehicles{
    Vans() {
        // System.out.println("Vans");
    }

    // windows_count
    public int windows_count(int oneway_count) {
        int result = oneway_count * 3;
        return result;
    }


    
}
