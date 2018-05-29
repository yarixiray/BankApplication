public class BankApplication {
    private Bank bank;

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        bankApplication.modifyBank();
        bankApplication.printBalance();
    }

    public BankApplication() {
        Bank bank = new Bank();
        Client client1 = new Client("Serhii");
        client1.addAccount(new Account(1, 10000000.001));
        client1.addAccount(new Account(211, 8888.001));
        bank.addClient(client1);

        /********************************************/

        Client client2 = new Client("Giga");
        client2.addAccount(new Account(2, 500.020));
        bank.addClient(client2);

        /********************************************/

        this.bank = bank;
    }

    public void modifyBank() {
        getCommission();
        bank.getClients().get(1).getAccounts().get(0).withdraw(490);
    }

    private void getCommission() {
        for (Client client : bank.getClients()) {
            for (Account account : client.getAccounts()) {
                account.withdraw(10);
            }
        }
    }

    public void printBalance() {
        for (Client client : bank.getClients()) {
            System.out.println("\t" + client.getName());

            for (Account account : client.getAccounts()) {
                System.out.println("\t\t" + account.getBalance());
            }
        }
    }
}

