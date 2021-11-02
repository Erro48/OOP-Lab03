package oop.lab03.bank;

public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1 2) Creare
         * l' AccountHolder relativo a Luigi Bianchi con id 2 3) Creare i due
         * SimpleBankAccount corrispondenti 4) Effettuare una serie di depositi e
         * prelievi 5) Stampare a video l'ammontare dei due conti e verificare
         * la correttezza del risultato 6) Provare a prelevare fornendo un idUsr
         * sbagliato 7) Controllare nuovamente l'ammontare
         */
    	
    	AccountHolder ah1 = new AccountHolder("Mario", "Rossi", 1);
    	AccountHolder ah2 = new AccountHolder("Luigi", "Bianchi", 2);

    	SimpleBankAccount sba1 = new SimpleBankAccount(ah1.getUserID(), 100);
    	SimpleBankAccount sba2 = new SimpleBankAccount(ah2.getUserID(), 200);

    	sba1.deposit(ah1.getUserID(), 20);
    	sba1.withdraw(ah1.getUserID(), 40);
    	System.out.println(sba1);
    	
    	sba2.deposit(ah2.getUserID(), 10);
    	sba2.withdraw(ah2.getUserID(), 300);
    	System.out.println(sba2);
    	
    }
}
