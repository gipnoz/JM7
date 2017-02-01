package JavaModule7;


import java.util.*;



public class Main {
    public static void main(String[] args) {

        List<Order> usersOrder = new ArrayList<>();
        usersOrder.add(new Order(1, 100, Currency.UAH, "iPhone5", "Smart phone", new User(1, "Semen", "Petrov", "Kiev", 5000)));
        usersOrder.add(new Order(2, 1000, Currency.UAH, "iMac", "Computer", new User(2, "Boris", "Antonov", "Kiev", 10000)));
        usersOrder.add(new Order(7, 150, Currency.USD, "iPhone7", "Smart phone", new User(3, "John", "Travolta", "Odessa", 1000)));
        usersOrder.add(new Order(4, 500, Currency.UAH, "iWatch", "Accessories", new User(4, "Justin", "Bieber", "Lviv", 4000)));
        usersOrder.add(new Order(8, 500, Currency.USD, "iCar", "Vehicle", new User(5, "Lev", "Yakovlev", "Donetsk", 5000)));
        usersOrder.add(new Order(6, 150, Currency.UAH, "iCat", "iPet", new User(6, "Gennadiy", "Tokarev", "Herson", 500)));
        usersOrder.add(new Order(3, 1000, Currency.UAH, "iDog", "iPet", new User(7, "Madonna", "Spears", "Sumi", 5000)));
        usersOrder.add(new Order(5, 1500, Currency.UAH, "iPhone5", "Smart phone", new User(8, "Semen", "Petrov", "Kiev", 5000)));
        usersOrder.add(new Order(8, 500, Currency.USD, "iPhone7", "Smart phone", new User(9, "John", "Travolta", "Odessa", 1000)));
        usersOrder.add(new Order(10, 400, Currency.UAH, "iMac", "Computer", new User(10, "Lev", "Tyler", "Yalta", 1500)));

        usersOrder.sort(new PriceComporator());
        usersOrder.sort(new ItemNameIdCity());
        usersOrder.sort(PriceRaiseAndCity.SortByPriceRaiseAndCity);
    }
}
