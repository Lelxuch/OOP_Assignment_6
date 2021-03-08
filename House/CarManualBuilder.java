public class CarManualBuilder implements Builder{
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }
    public void reset(){
        this.manual = new Manual();
    }
    public void setSeats(){

    }
    public void setEngine(){

    }
    public void setTripComputer(){

    }
    public void setGPS(){

    }
    public Manual returnManual(){
        return this.manual;
    }
}