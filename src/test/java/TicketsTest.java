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
}
