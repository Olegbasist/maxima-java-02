package org.example;

// TODO:- Название и стоимость — для самолета, корабля и грузовика различные константы
//              , выберите их сами, задайте их в начале метода.
//      - Если скорость, необходимая для выполнения заказа до 40 км/ч и город на воде, то корабль.
//      Если нужна скорость выше 120 км/ч, и есть аэропорт, то самолет.
//      В остальных случаях — грузовик.

// TODO: - Грузоподъемность должна равняться весу груза, округленного вверх до числа кратного 500.
//       - Скорость должна равняться скорости, необходимой для прибытия в срок, округленной вверх до ближайшего десятка.
//       - Если вес кратен 500 и или скорость кратна 10, то округлять не нужно.

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;


public class TransportFactoryTest {

    private City city;
    private TransportFactory transportFactory;
    @Before
    public void prepare () {
        city = new City("City",1);
        //transportFactory = new TransportFactory();
    }



}
