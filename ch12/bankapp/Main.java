package gr.aueb.cf.ch12.bankapp;

import gr.aueb.cf.ch12.bankapp.model.JointAccount;
import gr.aueb.cf.ch12.bankapp.model.OverdraftAccount;

public class Main {

    public static void main(String[] args) {
        JointAccount user1 = new JointAccount(2, "Nick", "Papadopoulos", "A203");
        JointAccount user2 = new JointAccount(2, "John", "Papadopoulos", "A203");
        OverdraftAccount account = new OverdraftAccount();

        account.setUsers(new JointAccount(2, "Nick", "Papadopoulos", "A203"));
        account.setUsers(new JointAccount(2, "kostas", "Kostas", "A203"));
        account.setSsn("A203");
        account.setBalance(2000);
        account.setIban("Gr5000");

        try {
            account.withdraw(3000, user1.getSsn());
            account.withdraw(3000, user2.getSsn());
            System.out.println(account.accountToString());

        }catch (Exception e){
            System.out.println("Wrong ssn input");
        }

    }
}
