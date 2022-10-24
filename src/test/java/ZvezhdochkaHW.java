import org.junit.jupiter.api.Test;

public class ZvezhdochkaHW {
    @Test
    public void checkingTransport () {
        Transport carTransport = new Transport();
        Transport ferryTransport = new Transport();
        Transport planeTransport = new Transport();

        carTransport.setFuelConsumption(7);
        carTransport.setTankVolume(62);
        ferryTransport.setFuelConsumption(13);
        ferryTransport.setTankVolume(600000);
        planeTransport.setFuelConsumption(12);
        planeTransport.setTankVolume(30000);
    }
    @Test
    public void setRoute () {
        Route route1 = new Route();
        Route route2 = new Route();
        Route route3 = new Route();

        route1.setDistance(310);
        route1.setStart("Tallin");
        route1.setFinish("Riga");

        route2.setDistance(3533);
        route2.setStart("Madrid");
        route2.setFinish("Riga");

        route3.setDistance(1610);
        route3.setStart("Kiel");
        route3.setFinish("Riga");


        System.out.println(route1.getStart());
        System.out.println(route1.getFinish());
        System.out.println(route1.getDistance());

        System.out.println(route2.getStart());
        System.out.println(route2.getFinish());
        System.out.println(route2.getDistance());

        System.out.println(route3.getStart());
        System.out.println(route3.getFinish());
        System.out.println(route3.getDistance());
    }

}
