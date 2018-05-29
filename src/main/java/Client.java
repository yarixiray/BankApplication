import java.util.ArrayList;
import java.util.List;

public class Client {

    private final String name;
    private final List<Account> accounts = new ArrayList<Account>();

    public String getName() {
        return name;
    }

    public Client(String name) {
        this.name = name;

    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
