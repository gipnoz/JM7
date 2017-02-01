package JavaModule7;


import java.util.Comparator;

public abstract class PriceRaiseAndCity implements Comparator<Order> {
    public static final Comparator<Order> SortByPriceRaiseAndCity = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            if (o1.getPrice() == o2.getPrice()) {
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            } else if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else if (o1.getPrice() > o2.getPrice()) {
                return 1;
            }
            return 0;
        }
    };
}
