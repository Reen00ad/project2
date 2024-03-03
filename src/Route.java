public class Route {
     String startAdd,desAdd;
     double tripPrice;

    public Route(String startAdd, String desAdd, double tripPrice) {
        this.startAdd = startAdd;
        this.desAdd = desAdd;
        this.tripPrice = tripPrice;
    }

    public String getStartAdd() {
        return startAdd;
    }

    public void setStartAdd(String startAdd) {
        this.startAdd = startAdd;
    }

    public String getDesAdd() {
        return desAdd;
    }

    public void setDesAdd(String desAdd) {
        this.desAdd = desAdd;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }
}
