public class NonSupscribers extends Passenger{

    private boolean discountCoupon;

    public NonSupscribers(String name, String ID, boolean discountCoupon) {
        super(name, ID);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }


    @Override
    public void calculateTripCost(Car c) throws IllegalArgumentException{
        if(discountCoupon){
            tripCost=c.getFixedRoute().getTripPrice() - (c.getFixedRoute().getTripPrice()*.1);
        }else {
            tripCost=c.getFixedRoute().getTripPrice();
        }
        if(c.getMaxCapacity()==0){
        throw new IllegalArgumentException("cannot reseve a car with zero capacity");}
        reservedCarObject = c;
        c.maxCapacity--;
    }
   @Override
    public void disinfo() {
        System.out.println("NON-SUBSCRIBER.");
        System.out.printf(" name : "+getName());
        System.out.printf(" ID : "+getID());
        System.out.println( " car code : "+getReservedCarObject().getCode());
        System.out.println(" route price : "+getReservedCarObject().getFixedRoute().getTripPrice());
        System.out.println(" has discount coupun : "+discountCoupon);
        System.out.println(" discount : "+getTripCost());
        System.out.println("-------------------------------------------------");

    }

}
