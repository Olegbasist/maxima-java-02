package org.example;

//      - Название и стоимость — для самолета, корабля и грузовика различные константы
//              , выберите их сами, задайте их в начале метода.
//      - Если скорость, необходимая для выполнения заказа до 40 км/ч и город на воде, то корабль.
//      Если нужна скорость выше 120 км/ч, и есть аэропорт, то самолет.
//      В остальных случаях — грузовик.

//       - Грузоподъемность должна равняться весу груза, округленного вверх до числа кратного 500.
//       - Скорость должна равняться скорости, необходимой для прибытия в срок, округленной вверх до ближайшего десятка.
//       - Если вес кратен 500 и или скорость кратна 10, то округлять не нужно.


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransportFactoryAnotherTryTest {
    private TransportFactoryAnotherTry transportFactory;
    private City city;
    private Transport transport;

    @Before
    public void prepare () {
        transportFactory = new TransportFactoryAnotherTry();
        city = new City("City",1);
        transport = getTransportFromTransportFactory();
    }
    private Transport getTransportFromTransportFactory() {
        return transportFactory.getTransport(city, 1, 1);
    }

    @Test
    public void shouldBeNotNulCity () {
        assertNotNull(city);
    }
    @Test
    public void shouldBeNotNullTransport () {
        assertNotNull(transport);
    }
    @Test
    public void shouldMakeTrack () {
        city.setOnWater(false);
        assertSame(Truck.class, getTransportFromTransportFactory().getClass());
    }
    @Test
    public void shouldMakeShip () {
        city.setOnWater(true);
        assertSame(Ship.class, getTransportFromTransportFactory().getClass());
    }
    @Test
    public void shouldMakePlane () {
        city.setHasAirport(true);
        city.setDistanceKm(121);
        assertSame(Plane.class, getTransportFromTransportFactory().getClass());
    }
    @Test
    public void shouldRoundCapacity () {
        assertEquals(500,transport.getCapacity());
    }
    @Test
    public void shouldRoundSpeed () {
        assertEquals(10,transport.getSpeed());
    }

}
