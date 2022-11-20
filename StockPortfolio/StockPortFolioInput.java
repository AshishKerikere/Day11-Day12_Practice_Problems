import java.util.Scanner;
public class StockPortFolioInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Stocks");
        int number= scanner.nextInt();

        StockPortfolio stockPortfolio = new StockPortfolio("Ashish's Stocks", number);
        for (int i = 0; i < 3; i++){
            System.out.println("Enter the name of the Stock");
            String s = scanner.next();
            System.out.println("Enter the number of Shares");
            int k = scanner.nextInt();
            System.out.println("Enter the Price of the Shares");
            double d = scanner.nextDouble();
            stockPortfolio.stock[i] = new Stock(s, k, d);
        }

        stockPortfolio.calculateTotalValueOfStock();
        stockPortfolio.printStockPortfolio();
    }
}
