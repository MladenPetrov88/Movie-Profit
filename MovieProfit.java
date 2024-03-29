import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movieName = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        int ticketsCount = Integer.parseInt(scan.nextLine());
        double ticketPrice = Double.parseDouble(scan.nextLine());
        int percentMoneyForCinema = Integer.parseInt(scan.nextLine());

        double ticketsPricePerDay = ticketsCount * ticketPrice;

        double totalPrice = ticketsPricePerDay * days;
        double moneyForCinema = totalPrice * percentMoneyForCinema / 100.0;
        double studioIncome = totalPrice - moneyForCinema;

        System.out.println(String.format("The profit from the movie %s is %.2f lv.", movieName, studioIncome));
    }
}
