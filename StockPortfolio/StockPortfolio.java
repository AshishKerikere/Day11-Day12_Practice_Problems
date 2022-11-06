import java.util.Scanner;
public class StockPortfolio {

      int number_ofStocks = 0;
      int index = 0;
      double value_ofThePortfolio = 0;
      Scanner scanner = new Scanner(System.in);
      Stock stock[];

      public StockPortfolio(int number_ofStocks){
            stock = new Stock[number_ofStocks];
      }

     public void fillPortfolio(){
         System.out.println("Enter the details of the Portfolio as follows");
           for(int i = 0; i<number_ofStocks; i++){
               System.out.print("Enter the name of" +(i+1) +"Stock");
               stock[i].name_ofStock = scanner.next();
                 System.out.println("Enter the Price of" +(i+1) +"Stock");
                 stock[i].price_ofShare = scanner.nextDouble();
                 System.out.println("Enter the Quantity of" +(i+1) +"Stock");
                 stock[i].number_ofShare = scanner.nextInt();
                 stock[i].total_Value_ofStock = stock[i].price_ofShare * stock[i].number_ofShare;
           }
     }

     public void printPortfolio(){
            System.out.println("The details of the Portfolio are as follows");
            System.out.println("Sl No\tName of the Stock\tPrice of the Stock\tQuantity of the Stock\tValue of the Stock");

           for(int i = 0; i<number_ofStocks; i++){
                 System.out.print(+(i+1) +"\t" +stock[i].name_ofStock +"\t" +stock[i].price_ofShare +"\t");
                 System.out.print(+stock[i].number_ofShare +"\t" +stock[i].total_Value_ofStock);
           }
     }

     public void calculateValueofPortfolio(){
         for(int i = 0; i<number_ofStocks; i++){
             value_ofThePortfolio = stock[i].total_Value_ofStock;
         }
     }
}
