
public class main {

    public static void main(String[] args) {

        Car companyCar = new Car(150, 30, 200, true, 'B', "ABC-223", 4800, 40000);
        companyCar.changeModel("Fiat");
        companyCar.changeMaxFuel(150);
        companyCar.fuelUp();
        companyCar.changeCosumption(10);
        companyCar.printMainAtributes();

        companyCar.travel(10);
        companyCar.printMainAtributes();

        Car audi = new Car();
        audi.changeModel("audi");
        audi.fuelUp();
        audi.changeCosumption(20);

        audi.printMainAtributes();
        audi.travel(3);
        audi.printMainAtributes();
        audi.travel(3);
    }

}
