public class Main {

    public static void main(String[] args) {

        System.out.println((checkDiscount("Kraków",18,"Monday")));

    }
    public static String checkDiscount(String residence, int age, String weekday) {

        int ticketprice = 40;

        String discount;

        if (age < 10) {

            ticketprice = 0;

        } else if (age < 18) {

            ticketprice = ticketprice / 2;

            discount = "50%";

            System.out.println("Discount: " + discount);

        } else if (residence.equals("Warsaw")) {

            ticketprice = ticketprice / 10;

            discount = "10%";

            System.out.println("Discount: " + discount);

        } else if (weekday.equals("Thursday")) {

            ticketprice = 0;

        }

        String data = "Data: " + residence + ", " + age + " years old, " + weekday + " " + ticketprice  + " PLN";

        return data;

    }
}