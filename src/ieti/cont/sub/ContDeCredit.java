package ieti.cont.sub;
import ieti.cont.ContBancar;

public class ContDeCredit extends ContBancar {
    public int monthAmount;
    public double increaseRate;
    public int storedAmount;
    public int diffAmount;
    public ContDeCredit(int amount, int monthAmount, double increaseRate, int storedAmount,int diffAmount) {
        super(amount);
        this.monthAmount = monthAmount;
        this.increaseRate = increaseRate;
        this.storedAmount = storedAmount;
        this.diffAmount = diffAmount;
    }
    @Override
    public int getWithdraw(int amountCur){
        if(this.amount < amountCur){
            this.storedAmount = this.amount - amountCur;
            this.diffAmount = storedAmount - amountCur;
            if(diffAmount < 0){
                increaseRate = diffAmount * 0.15;
                System.out.println("increase rate" + increaseRate);
            }
        }
        return amountCur;
    }

}