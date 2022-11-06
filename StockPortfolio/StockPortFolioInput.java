public class StockPortFolioInput {
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of stocks in Portfolio");
        int number_ofStocks = sc.nextInt();*/

        StockPortfolio stockPortfolio = new StockPortfolio(3);
        stockPortfolio.fillPortfolio();// Method to fill the details of Portfolio
        stockPortfolio.printPortfolio();
    }
}
