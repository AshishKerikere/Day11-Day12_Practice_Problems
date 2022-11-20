public class BankAccountProcessing {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setbank_Balance(1108.57);
        boolean temp = bankAccount.debit(1201.33);

        if (temp){
            System.out.println("The Bank Balance is = " +bankAccount.getbank_Balance());
        }
        else {
            System.out.println("Debit amount exceeded account balance.");
            System.out.println("The Bank Balance is = " +bankAccount.getbank_Balance());
        }
    }
}
