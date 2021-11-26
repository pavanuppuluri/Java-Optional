import java.util.Optional;

public class OptionalOrElseVsOrElseGet {
    public static void main(String[] args) {



        /* With an empty Optional both behaves same */
//        Optional<String> s = Optional.ofNullable(null);
//
//        String orElseResult=s.orElse(getValue("orElse"));
//        System.out.println(orElseResult);
//
//        String orElseGetResult=s.orElseGet(()->getValue("orElseGet"));
//        System.out.println(orElseGetResult);

        Optional<String> s = Optional.ofNullable("Hi");

        String orElseResult=s.orElse(getValue("orElse"));
        System.out.println(orElseResult);

        String orElseGetResult=s.orElseGet(()->getValue("orElseGet"));
        System.out.println(orElseGetResult);



    }

    static String getValue(String from)
    {
        System.out.println("Calling getValue from "+from);
        return "Default value";
    }
}
