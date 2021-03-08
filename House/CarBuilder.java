public class CarBuilder implements Builder {
    private Car car;

    public void CarBuilder() {
        this.reset();
    }
    public void reset() {
        this.car = new Car();
    }
    public void setSeats() {

    }
    public void setEngine() {

    }
    public void setTripComputer() {

    }
    public void setGPS() {

    }
    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
