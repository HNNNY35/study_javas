public class inheritanceMain {
    public static void main(String[] args) {
        // InheritanceObject inheritanceObject = new InheritanceObject();

        Calculations calculations = new Calculations();
        Calculations calculationsWithParam = new Calculations(6,7);
        ExtendCalculations extendCalculations = new ExtendCalculations();

        System.out.println("Done");
    }
}

// {   // calculations
//     first = 0
//     {   // Calculations()
//         this.first = 1;
//     }
//     {   // addition()
//         this.first = 2;
//     }




// }