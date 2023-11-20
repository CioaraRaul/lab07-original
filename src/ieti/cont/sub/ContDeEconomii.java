package ieti.cont.sub;

import ieti.cont.ContBancar;

import java.awt.desktop.SystemEventListener;

public class ContDeEconomii extends ContBancar {
    public int limitAmount;
    public ContDeEconomii(int amount,int limitAmount) {
        super(amount);
        this.limitAmount = limitAmount;
    }
    @Override
    public int getWithdraw(int amountCur){

      if (amountCur >= this.limitAmount)  {
          System.out.println("The limit has reached");
      }

      else {
            if (amount > amountCur) {
                this.amount -= amountCur;

            }
            if (amount < amountCur){
                System.out.println("You cant withdraw bcs your cur acc is lower");

            }
        }

      return this.amount;

    }
}
