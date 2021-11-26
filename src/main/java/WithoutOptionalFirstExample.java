import java.util.HashMap;

public class WithoutOptionalFirstExample {
    public static void main(String[] args){
        String email=getCustomerEmail(9);
        System.out.println(email.toLowerCase());
    }

    static String getCustomerEmail(int customerId)
    {
        HashMap<Integer,String> emailMap=new HashMap();
        emailMap.put(1,"ABC@test.com");
        emailMap.put(2,"DEF@test.com");
        emailMap.put(3,"GHI@test.com");

        return emailMap.get(customerId);


    }
}
