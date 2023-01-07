package org.example;

// TODO:- Название и стоимость — для самолета, корабля и грузовика различные константы
//              , выберите их сами, задайте их в начале метода.
//      - Если скорость, необходимая для выполнения заказа до 40 км/ч и город на воде, то корабль.
//      Если нужна скорость выше 120 км/ч, и есть аэропорт, то самолет.
//      В остальных случаях — грузовик.

// TODO: - Грузоподъемность должна равняться весу груза, округленного вверх до числа кратного 500.
//       - Скорость должна равняться скорости, необходимой для прибытия в срок, округленной вверх до ближайшего десятка.
//       - Если вес кратен 500 и или скорость кратна 10, то округлять не нужно.

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Test;


public class TransportFactoryTest {
    private TransportFactory transportFactory = new TransportFactory();
    private City city; //= new City("City",1);
    private Transport transport; // = transportFactory.getTransport(city,1,1);

    @Before
    public void prepare () {
        city = new City("City",1);
        transport = getTransport(city,1,1);
    }
    private Transport getTransport (City city, int weight, int hours) {
        return transportFactory.getTransport(city,weight,hours);
    }

    /*@Test
    public void shouldGetTrack () {
        //Transport transport = transportFactory.getTransport(city,1,1);
        System.out.println(transport);
        //System.out.println(getTransport(city,1,1).getName());
    }*/
    @Test
    public void shouldBeNotNulCity () {
        
    }

}
