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
    public void getAndSetTicket4() {
        Tickets ticket = new Tickets(12, 2300, "Москва", "Казань", 95);

        ticket.setTime(95);

        int expected = (95);
        int actual = ticket.getTime();

        Assertions.assertEquals(expected, actual);


    }

}
