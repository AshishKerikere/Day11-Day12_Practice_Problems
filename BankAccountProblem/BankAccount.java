public class BankAccount {
    protected double bank_Balance;

    public void setbank_Balance(double bank_Balance){
        this.bank_Balance = bank_Balance;
    }
    public double getbank_Balance(){
        return bank_Balance;
    }

    public boolean debit(double withdrawAmount){
        if(withdrawAmount <= bank_Balance){
            bank_Balance = bank_Balance - withdrawAmount;
            return true;
        }

        else {
            return false;
        }
    }
}
