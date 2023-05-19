public class Car {

private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car-> start Engine" );

    }

    protected void runEngine(){
        System.out.println("Car->runEngine");

    }
    public void drive(){
        System.out.println("Car-> driving, type is " +getClass().getSimpleName());
        runEngine();


    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
       System.out.printf("Gas-> %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
    System.out.printf("Gas -> usage exceeds the average : %2f %n", avgKmPerLiter);
    }

}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int baterrySize =6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int baterrySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.baterrySize = baterrySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", baterrySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2F %n", avgKmPerCharge);
    }

}

class HybridCar extends Car{
    private double avgKmPerCharge;
    private int baterrySize;
    private int cylinders = 6;


    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerCharge, int baterrySize, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.baterrySize = baterrySize;
        this.cylinders=cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid-> d% cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid-> %d kWh battery on, Ready !%n",baterrySize);

    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid-> usage below average: %.2F %n", avgKmPerCharge);

    }

}