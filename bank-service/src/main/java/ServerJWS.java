import jakarta.xml.ws.Endpoint;
import ws.BankAccountService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8686/";
        Endpoint.publish(url, new BankAccountService());
        System.out.println("Bank account service has been created at: " + url);
    }
}
