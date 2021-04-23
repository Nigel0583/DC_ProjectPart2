import java.net.InetAddress;
import java.util.Arrays;

public class ClientLogin {
    public static void main(String[] argv) {

        LOGPROG client; // client is an instance of reverse class (i.e. the stub)
        if (Arrays.toString(argv).equals("leave*")) {
            System.out.println("Usage: java ClientLogin host text");
            System.exit(0);
        }
        try
        // call echo method in the stub
        {
            client = new LOGPROG(InetAddress.getByName(argv[0]), true);
            String result = client.Login1(argv[1]);
            System.out.println("\nUser login " + result);
        } catch (Exception e) {
            System.out.println("\nThe Exception is " + e.getMessage());

        }
        System.exit(0);
    }
}
