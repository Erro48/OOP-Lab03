package oop.lab03.bank;

public class SimpleBankAccount {
    /*
     * Aggiungere i seguenti campi:
     * - double balance: ammontare del conto
     * - int userID: id del possessore del conto (già dichiarato: si veda al riguardo il metodo checkUser dichiarato in fondo alla classe)
     * - int nTransactions: numero delle operazioni effettuate
     * - static double ATM_TRANSACTION_FEE = 1: costo delle operazioni via ATM
     */
	
	static double ATM_TRANSACTION_FEE = 1;
	
	private int userID;
	private double balance;
	private int nTransactions;

    /*
     * Creare un costruttore pubblico che prenda in ingresso un intero (ossia l'id
     * dell'utente) ed un double (ossia, l'ammontare iniziale del conto corrente).
     */

	public SimpleBankAccount(int usrID, double initialBalance) {
		this.userID = usrID;
		this.balance = initialBalance;
	}
	
    /*
     * Si aggiungano selettori per: 
     * - ottenere l'id utente del possessore del conto
     * - ottenere il numero di transazioni effettuate
     * - ottenere l'ammontare corrente del conto.
     */
	
    public int getUserID() {
		return this.userID;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getnTransactions() {
		return this.nTransactions;
	}

    public void deposit(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto Nota: il deposito va a buon fine solo se l'id utente
         * corrisponde
         */
    	if(checkUser(usrID)) {
    		this.balance += amount;
    		this.nTransactions++;
    	}
    }

	public void withdraw(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount al totale del
         * conto. Note: - Il conto puo' andare in rosso (ammontare negativo) -
         * Il prelievo va a buon fine solo se l'id utente corrisponde
         */
		if(checkUser(usrID)) {
			this.balance -= amount;
			this.nTransactions++;
		}
    }

    public void depositFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto detraendo le spese (costante ATM_TRANSACTION_FEE) relative
         * all'uso dell'ATM (bancomat) Nota: il deposito va a buon fine solo se
         * l'id utente corrisponde
         */
    	if(checkUser(usrID)) {
    		this.balance += amount - ATM_TRANSACTION_FEE;
    		this.nTransactions++;
    	}
    }

    public void withdrawFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount + le spese
         * (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
         * al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
         * negativo) - Il prelievo va a buon fine solo se l'id utente
         * corrisponde
         */
    	if(checkUser(usrID)) {
    		this.balance -= amount + ATM_TRANSACTION_FEE;
    		this.nTransactions++;
    	}
    }

    /* Utility method per controllare lo user */
    private boolean checkUser(final int id) {
        return this.userID == id;
    }

	@Override
	public String toString() {
		return "SimpleBankAccount [userID=" + userID + ", balance=" + balance + ", nTransactions="
				+ nTransactions + "]";
	}
    
    
}
