import proxy.Account;
import proxy.BankAccountService;
import proxy.BankWS;

public class ClientWS {
    public static void main(String[] args) {
        BankAccountService proxyWS = new BankWS().getBankAccountServicePort();
        System.out.println(proxyWS.conversionEuroToDh(200));
        System.out.println("-------------------------------");
        Account account = proxyWS.getAccount(3);
        System.out.println(account.getCode());
        System.out.println(account.getBalance());
        System.out.println(account.getCreatedAt());
    }
}
