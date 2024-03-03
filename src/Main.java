public class Main {
    public static void main(String[] args) {

        Route r1 = new Route("Riyadh", "Dammam", 500);
        Route r2 = new Route("Jeddah", "Riyadh", 800);

        Car c1 = new Car("11", r1, 3);
        Car c2 = new Car("13", r2, 0);


        Subscribers s1 = new Subscribers("Reenad", "1");
        NonSupscribers n1 = new NonSupscribers("Lana", "22", true);


       try {
           s1.calculateTripCost(c1);
           n1.calculateTripCost(c2);
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }




        Passenger[] passengers = {s1, n1};

        for (Passenger p : passengers) {

          p.disinfo();

        }


    }
}
