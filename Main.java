import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accList = new ArrayList<>();
        accList.add(new Account(1, "j bosco Nzeyimana","Deposing", "102000","0.18"));
        accList.add(new Account(2, "Bizimana venustine","Credit", "220000", "0.12"));
        accList.add(new Account(3, "Iradukunda Divine","Checking","350000","0.11"));
        accList.add(new Account(4, "Mukeshimana Desire","Saving", "150000", "0.16"));
        accList.add(new Account(5, "Bikorimana Bollard","Checking", "350000","0.10"));
        accList.add(new Account(6, "Bangirimana  Stone","Deposit","650000","0.18"));
        accList.add(new Account(7, "Sindayigaya  Lucas","Credit", "950000",  "0.16"));
        accList.add(new Account(8, "Bangirinama  Darcy","Debit", "230000",   "0.15"));
        accList.add(new Account(9, "Mukeshimana alinee","Saving", "2230000", "0.11"));
        accList.add(new Account(10, "Hakizimana bernice","Checking","6720000","0.17"));



        for (Account acc:accList){
            System.out.println(acc);
        }
    }
}