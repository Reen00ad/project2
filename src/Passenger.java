
public abstract class Passenger {
     String name,ID;
     Car reservedCarObject;
     double tripCost;

    public Passenger(String name, String ID, Car reservedCarObject, double tripCost) {
        this.name = name;
        this.ID = ID;
        this.reservedCarObject = reservedCarObject;
        this.tripCost = tripCost;
    }

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getReservedCarObject() {
        return reservedCarObject;
    }

    public void setReservedCarObject(Car reservedCarObject) {
        this.reservedCarObject = reservedCarObject;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }



    public abstract void calculateTripCost(Car c);
    public abstract void disinfo();
}
