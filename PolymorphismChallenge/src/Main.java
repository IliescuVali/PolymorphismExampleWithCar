public class Main {
    public static void main(String[] args) {




        Car ferrai=new GasPoweredCar("Ford Focus",
                15.4, 6);
        runRace(ferrai);


         Car tesla = new ElectricCar("Dacia Spring", 250,30);

        runRace( tesla);

        Car toyota = new HybridCar("Model Corolla Sedan ", 800,
                50 , 4 );
        runRace(toyota);


    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();

    }
}
