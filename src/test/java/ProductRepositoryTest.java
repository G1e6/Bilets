import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {
    // Product products = new Product();
    //Smartphone smartphons = new Smartphone(products);


    Tickets tickets1 = new Tickets(12, 2300, "Москва", "Казань", 95);
    Tickets tickets2 = new Tickets(34, 6200, "Екатеринбург", "Москва", 150);
    Tickets tickets3 = new Tickets(56, 11300, "Екатеринбург", "Сочи", 235);

    @Test
    public void test() {
        ProductRepository repo = new ProductRepository();
        repo.add(tickets1);
        repo.add(tickets2);
        repo.add(tickets3);
       // repo.remoteById(tickets2.getId());

        Tickets[] expected = {tickets1, tickets2, tickets3};
        Tickets[] actual = repo.getTickets();

        Assertions.assertArrayEquals(expected, actual);

    }

}

