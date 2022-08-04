import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);


    Tickets tickets1 = new Tickets(12, 2300, "Москва", "Казань", 95);
    Tickets tickets2 = new Tickets(34, 6200, "Екатеринбург", "Москва", 150);
    Tickets tickets3 = new Tickets(56, 11300, "Екатеринбург", "Сочи", 235);
    Tickets tickets4 = new Tickets(76, 500, "Пермь", "Пермь", 470);

    @Test
    public void nothingFound() {
        manager.add(tickets1);
        manager.add(tickets2);
        manager.add(tickets3);
        manager.add(tickets4);



        Tickets[] actual = manager.searchBy("Тюмень", "Пермь");
        Tickets[] expected = {tickets1, tickets2, tickets3};

        Assertions.assertArrayEquals(actual, expected);

    }
}
