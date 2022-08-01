public class ProductRepository {

    private Tickets[] tickets = new Tickets[0];

    public void add(Tickets ticket) {
        Tickets[] tmp = new Tickets[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public Tickets[] findAll() {
        return tickets;
    }

    // public void remoteById(int id) {
    //     Product[] tmp = new Product[products.length - 1];
    //    int copyToIndex = 0;
    //     for (Product product : products) {
    //         if (product.getId() != id) {
    //            tmp[copyToIndex] = product;
    //              copyToIndex++;
    //      }
    //     }
    //    products = tmp;
    // }

    public Tickets[] getTickets() {
        return tickets;
    }
}
