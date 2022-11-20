public class Stock {
    String name_ofStock;
    int number_ofShare;
    double price_ofShare;
    double total_Value_ofStock;

    public Stock(String name_ofStock,int number_ofShare, double price_ofShare){
        this.name_ofStock = name_ofStock;
        this.number_ofShare = number_ofShare;
        this.price_ofShare = price_ofShare;
        total_Value_ofStock = number_ofShare * price_ofShare;
    }

}
