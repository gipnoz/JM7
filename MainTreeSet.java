package JavaModule7;


import java.util.*;
import java.lang.String;


public class MainTreeSet {
    public static void main(String[] args) {
        Set<Order> usersOrder = new TreeSet<>();
        usersOrder.add(new Order(1, 100, Currency.UAH, "iPhone5", "Smart phone", new User(1, "Semen", "Petrov", "Kiev", 5000)));
        usersOrder.add(new Order(2, 1000, Currency.UAH, "iMac", "Computer", new User(2, "Boris", "Antonov", "Kiev", 10000)));
        usersOrder.add(new Order(7, 150, Currency.USD, "iPhone7", "Smart phone", new User(3, "John", "Travolta", "Odessa", 1000)));
        usersOrder.add(new Order(4, 500, Currency.UAH, "iWatch", "Accessories", new User(4, "Justin", "Bieber", "Lviv", 4000)));
        usersOrder.add(new Order(8, 500, Currency.USD, "iCar", "Vehicle", new User(5, "Lev", "Yakovlev", "Donetsk", 5000)));
        usersOrder.add(new Order(6, 150, Currency.UAH, "iCat", "iPet", new User(6, "Gennadiy", "Tokarev", "Herson", 500)));
        usersOrder.add(new Order(3, 1000, Currency.UAH, "iDog", "iPet", new User(7, "Madonna", "Spears", "Sumi", 5000)));
        usersOrder.add(new Order(5, 1500, Currency.UAH, "iPhone5", "Smart phone", new User(1, "Semen", "Petrov", "Kiev", 5000)));
        usersOrder.add(new Order(8, 500, Currency.USD, "iPhone7", "Smart phone", new User(9, "John", "Travolta", "Odessa", 1000)));
        usersOrder.add(new Order(10, 400, Currency.UAH, "iMac", "Computer", new User(10, "Lev", "Tyler", "Yalta", 1500)));


        checkPetrov(usersOrder);
        deleteUsd(usersOrder);

        TreeSet<Order> increasePrice = new TreeSet<>(PriceRaiseAndCity.SortByPriceRaiseAndCity);
        for(Order r : usersOrder){
            increasePrice.add(r);
        }
        Order largePrice = increasePrice.last();
        System.out.println(largePrice);

    }

    private static void checkPetrov(Set<Order> usersOrder) {
        for (Order order : usersOrder) {
            if (order.getUser().getLastName().equals("Petrov")) {
                System.out.println("Petrov here.");
            }
        }
    }

    private static void deleteUsd(Set<Order> usersOrder) {
        Iterator<Order> iterator = usersOrder.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(Currency.USD)) {
                iterator.remove();
            }
        }
    }
}

