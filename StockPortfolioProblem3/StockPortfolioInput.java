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

    public int stockSearck(String symbol){
        int index = -1;
        for(int i = 0; i < numberOfStocks; i++){
            if(stock[i].name_ofStock.equals(symbol)){
                index = i;
            }
        }
        return index;
    }

    public void buy(int amount, String symbol){
        int indexOfStock = stockSearck(symbol);
        if (indexOfStock >= 0){
            stock[indexOfStock].number_ofShare = stock[indexOfStock].number_ofShare + amount;
            stock[indexOfStock].total_Value_ofStock = stock[indexOfStock].number_ofShare*stock[indexOfStock].price_ofShare;
        }
        else{
            System.out.println("Symbol not found");
        }

    }

    public void sell(int amount, String symbol){
        int indexOfStock = stockSearck(symbol);
        if (indexOfStock >= 0 ) {
            if (amount <= stock[indexOfStock].number_ofShare) {
                stock[indexOfStock].number_ofShare = stock[indexOfStock].number_ofShare - amount;
                stock[indexOfStock].total_Value_ofStock = stock[indexOfStock].number_ofShare * stock[indexOfStock].price_ofShare;
            }
            else {
                System.out.println("Amount of Stocks Exceeds the Number of Stocks");
            }
        }
        else{
            System.out.println("Symbol not found");
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
