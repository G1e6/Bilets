import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketsTest {

    @Test
    public void getAndSetTicket() {
        Tickets ticket = new Tickets(12, 2300, "Москва", "Казань", 95);

        ticket.setFrom("Москва");

        String expected = ("Москва");
        String actual = ticket.getFrom();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getAndSetTicket1() {
        Tickets ticket = new Tickets(12, 2300, "Москва", "Казань", 95);

        ticket.setTo("Казань");

        String expected = ("Казань");
        String actual = ticket.getTo();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getAndSetTicket2() {
        Tickets ticket = new Tickets(12, 2300, "Москва", "Казань", 95);

        ticket.setId(12);

        int expected = (12);
        int actual = ticket.getId();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getAndSetTicket3() {
        Tickets ticket = new Tickets(12, 2300, "Москва", "Казань", 95);

        ticket.setPrice(2300);

        int expected = (2300);
        int actual = ticket.getPrice();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void getAndSetTicket5() {
        Tickets tickets5 = new Tickets(12, 2300, "Москва", "Казань", 95);
        Tickets tickets1 = new Tickets(12, 2300, "Москва", "Казань", 95);
        Tickets tickets2 = new Tickets(34, 6200, "Екатеринбург", "Москва", 150);
        Tickets tickets3 = new Tickets(56, 11300, "Екатеринбург", "Сочи", 235);
        Tickets tickets4 = new Tickets(76, 500, "Пермь", "Пермь", 470);



        System.out.println(tickets1.compareTo(tickets2));
        System.out.println(tickets5.compareTo(tickets1));
        System.out.println(tickets3.compareTo(tickets4));

    }


    @Test
    public void getAndSetTicket4() {
        Tickets ticket = new Tickets(12, 2300, "Москва", "Казань", 95);

        ticket.setTime(95);

        int expected = (95);
        int actual = ticket.getTime();

        Assertions.assertEquals(expected, actual);


    }

}
