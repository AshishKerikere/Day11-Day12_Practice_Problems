public class StockPortfolio {

    String stockPortfolioName = "";
    Stock stock[];
    int numberOfStocks;
    double totalValueofAllStocks;

    public StockPortfolio(String stockPortfolioName, int numberOfStocks){
        this.stockPortfolioName = stockPortfolioName;
        this.numberOfStocks = numberOfStocks;
        stock = new Stock[numberOfStocks];
    }

    public void calculateTotalValueOfStock(){
        for (int i = 0; i<numberOfStocks; i++){
            totalValueofAllStocks = stock[i].total_Value_ofStock+totalValueofAllStocks;
        }
    }

   
    public void printStockPortfolio(){

        for(int i = 0; i<numberOfStocks; i++){
            System.out.print(stock[i].name_ofStock +"\t");
            System.out.print(stock[i].price_ofShare +"\t");
            System.out.print(stock[i].number_ofShare +"\t");
            System.out.print(stock[i].total_Value_ofStock +"\t");
            System.out.println();
        }


        System.out.println("Total Value of Stock Portfolio = " +totalValueofAllStocks);
    }
}
