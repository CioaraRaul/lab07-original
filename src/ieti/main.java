package ieti;
import ieti.cont.ContBancar;
import ieti.cont.sub.ContDeEconomii;
import ieti.cont.sub.ContDeCredit;

public class main {
    public static void main(String[] args) {
       ContBancar jerry = new ContBancar(10000);
        ContDeEconomii anca = new ContDeEconomii(jerry.getBalance(),1000);
        ContDeCredit raul = new ContDeCred();
        jerry.getBalance();
        System.out.println(anca.getWithdraw(100));


    }
}
