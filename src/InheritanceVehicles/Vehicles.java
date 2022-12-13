package InheritanceVehicles;

public class Vehicles extends InheritanceVehicles{
    Vehicles() {
        // System.out.println("Vehicles");
    }

    // speed
    public int speed(int kms, int hours) {
        int result = kms / hours;
        return result;
    }

    // weight
    public int weight(int height, int width, int depth) {
        int result = height * width * depth;
        return result;
    }


}
