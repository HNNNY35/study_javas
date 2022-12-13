package InheritanceVehicles;

public class Cars extends Vehicles{
    int _oneway_count = 0;
    Cars() {
        // System.out.println("Cars");
    }
    
    Cars(int oneway_count) {
        this._oneway_count = oneway_count;
        // System.out.println("Cars - with Param");

    }

    // speed
    public int speed(int kms, int hours) {
        int result = (kms/hours) + _oneway_count;
        return result;
    }

}
