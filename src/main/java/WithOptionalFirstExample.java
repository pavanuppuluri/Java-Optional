import java.util.HashMap;
import java.util.Optional;

public class WithOptionalFirstExample {
    public static void main(String[] args){
        Optional<String> email=getCustomerEmail(9);

        if(email.isPresent())
        {
            System.out.println(email.get().toLowerCase());
        }
        else
        {
            System.out.println("Email not found");
        }

    }

    static Optional<String> getCustomerEmail(int customerId)
    {
        HashMap<Integer,String> emailMap=new HashMap();
        emailMap.put(1,"ABC@test.com");
        emailMap.put(2,"DEF@test.com");
        emailMap.put(3,"GHI@test.com");

        return Optional.ofNullable(emailMap.get(customerId));


    }
}
