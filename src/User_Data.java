import java.util.ArrayList;
import java.util.List;

public class User_Data {

    public static final List<Customer> customers = new ArrayList<Customer>();
    public static  final List<Admin> admins = new ArrayList<>();

    static {

        if(admins.isEmpty())
            admins.add(new Admin("root","root"));
    }

}
