package org.example;

//      - Название и стоимость — для самолета, корабля и грузовика различные константы
//              , выберите их сами, задайте их в начале метода.
//      - Если скорость, необходимая для выполнения заказа до 40 км/ч и город на воде, то корабль.
//      Если нужна скорость выше 120 км/ч, и есть аэропорт, то самолет.
//      В остальных случаях — грузовик.

//       - Грузоподъемность должна равняться весу груза, округленного вверх до числа кратного 500.
//       - Скорость должна равняться скорости, необходимой для прибытия в срок, округленной вверх до ближайшего десятка.
//       - Если вес кратен 500 и или скорость кратна 10, то округлять не нужно.

//  fix: Покрытие неполное (не все случаи)
//  по названию теста непонятно какой тестовый случай он покрывает.
//  Нет тестов на случай когда округление не нужно

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
