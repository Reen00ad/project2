public class Subscribers extends Passenger{
    private double discount=.5;

    public Subscribers(String name, String ID) {
        super(name, ID);

    }



    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public void calculateTripCost(Car c) throws IllegalArgumentException{
        tripCost=c.getFixedRoute().getTripPrice()*.5;
        if(c.getMaxCapacity()==0){
            throw new IllegalArgumentException("cannot reseve a car with zero capacity");
        }
        reservedCarObject= c;


    }

    @Override
    public void disinfo() {
        System.out.println("SUBSCRIBER.");
        System.out.printf("name : "+getName());
        System.out.printf(" ID : "+getID());
        System.out.println( " car code : "+getReservedCarObject().getCode());
        System.out.println(" route price : "+getReservedCarObject().getFixedRoute().getTripPrice());
        System.out.println(" discount : "+getTripCost());
        System.out.println("-------------------------------------------------");

    }}
