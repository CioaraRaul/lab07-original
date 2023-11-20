package ieti.cont;

public class ContBancar {
    public int amount;

    public ContBancar(int amount){
        this.amount = amount;
    }
    public int getWithdraw(int amount){
        if (amount > 0){
            this.amount -= amount;
        }
        return this.amount;
    }

    public int getDeposit(int amount){
        if(amount < 0) return 0;
        return this.amount + amount;
    }
    public int getBalance(){
        return amount;
    }
}
