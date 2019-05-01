
public class Car {

    int maxSpees = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean IstheCarOn = false;
    String license = "2424";
    char conditional = 'A';
    double currentPrice = 3000;
    int mileagePassed = 50000;

    String model;
    int maxFuel;
    int curentFuel;
    int cosumption;

    public Car() {
        this.model = "default";
        this.curentFuel = 0;
        this.maxFuel = 100;
    }

    public Car(int maxSpees, int minSpeed, double weight, boolean IstheCarOn, char conditional,
            String license, double currentPrice, int mileagePassed) {
        this.maxSpees = maxSpees;
        this.minSpeed = minSpeed;
        this.weight = weight;
        this.IstheCarOn = IstheCarOn;
        this.license = license;
        this.conditional = conditional;
        this.mileagePassed = mileagePassed;
        this.currentPrice = currentPrice;

    }

    public void printAtributes() {
        System.out.println("MAksimalna brzina je: " + this.maxSpees);
        System.out.println("Minimalna brzina je: " + this.minSpeed);
        System.out.println("Tezina kola je: " + this.weight);
        System.out.println("Da li je auto na stanju: " + this.IstheCarOn);
        System.out.println("Registracija: " + this.license);
        System.out.println("Stanje: " + this.conditional);
        System.out.println("Kilometraza: " + this.mileagePassed);
        System.out.println("Cena: " + this.currentPrice);
    }

    public void printMainAtributes() {
        System.out.println("Model: " + this.model);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);
        System.out.println("Trenutno goriva: " + this.curentFuel);
        System.out.println("Kilometraza: " + this.mileagePassed);
    }

    public void changeModel(String customModel) {
        this.model = customModel;

    }

    public void changeMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }

    public void fuelUp() {
        this.curentFuel = this.maxFuel;
    }

    public void changeCosumption(int customCosumption) {
        this.cosumption = customCosumption;
    }

    public void travel(int distance) {
        if (this.curentFuel > distance * this.cosumption) {
            this.mileagePassed = this.mileagePassed + distance;
            this.curentFuel = this.curentFuel - distance * this.cosumption;
            System.out.println("Putovali ste: " + distance);
            
        } else {
            System.out.println("Nema dovoljno goriva");
        }

    }
}
