public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    public void Director(Builder builder) {
        builder.reset();
        builder.setSeats();
        builder.setEngine();
        builder.setTripComputer();
        builder.setGPS();
    }
    public void constructSportsCar(Builder builder){

    }
}
