import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    List<Account> accounts = new ArrayList<Account>();

    public Client(String name) {
        this.name = name;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
