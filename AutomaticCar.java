public class AutomaticCar extends Car {


    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    public String drive() {
        return "Automatic "+ getBrand();
    }


}
