package org.example;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TransportFactoryTest {
    private TransportFactory transportFactory;
    private City city;
    private Transport transport;

    @Before
    public void prepare () {
        transportFactory = new TransportFactory();
        city = new City("City",1);
        transport = getTransportFromTransportFactory();
    }
    private Transport getTransportFromTransportFactory() {
        return transportFactory.getTransport(city, 1, 1);
    }

    @Test
    public void shouldReturnNotNulCity () {
        assertNotNull(city);
    }
    @Test
    public void shouldReturnNotNullTransport () {
        assertNotNull(transport);
    }
    @Test
    public void shouldReturnObjectTrack () {
        city.setOnWater(false);
        assertSame(Truck.class, getTransportFromTransportFactory().getClass());
    }
    @Test
    public void shouldReturnObjectShip () {
        city.setOnWater(true);
        assertSame(Ship.class, getTransportFromTransportFactory().getClass());
    }
    @Test
    public void shouldReturnObjectPlane () {
        city.setHasAirport(true);
        city.setDistanceKm(121);
        assertSame(Plane.class, getTransportFromTransportFactory().getClass());
    }
    // Тесты вместимости
    @Test
    public void shouldRoundCapacityToFivesHundreds() {
        int weight = 0;
        for (int i=0; i<999; i++) {
            assertEquals(0,transportFactory
                    .getTransport(city,weight,1)
                    .getCapacity()%500);
            weight += 117;
        }
    }
    @Test
    public void shouldNotRoundCapacityOfFiveHanded() {
        assertEquals(500,transportFactory.getTransport(city,500,1).getCapacity());
    }
    // Тесты скорости

    @Test
    public void shouldRoundSpeedToTenth () {
        int distance = 1;
        for (int i=0; i<142; i++){
            city.setDistanceKm(distance);
            assertEquals(0,getTransportFromTransportFactory().getSpeed()%10);
            distance += 7;
        }
    }
    @Test
    public void shouldNotRoundSpeedOfTen () {
        city.setDistanceKm(10);
        assertEquals(10,getTransportFromTransportFactory().getSpeed());
    }
}