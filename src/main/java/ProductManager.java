import java.util.Arrays;

public class ProductManager {
    protected ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Tickets tickets) {
        repository.add(tickets);
    }

    public Tickets[] searchBy(String from, String to) {
        Tickets[] result = new Tickets[0];
        for (Tickets tickets : repository.findAll()) {
            if (matches(tickets, from, to)) {
                Tickets[] tmp = new Tickets[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = tickets;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }


    public boolean matches(Tickets tickets, String from, String to) {
        if (tickets.getFrom().contains(from) | tickets.getTo().contains(to)) {
            return true;
        } else {
            return false;
        }

    }


}
