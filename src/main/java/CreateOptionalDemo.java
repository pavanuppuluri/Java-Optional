import java.util.Optional;

public class CreateOptionalDemo {
    public static void main(String[] args) {
        // Creates an empty Optional
        Optional<String> emptyString= Optional.empty();
        System.out.println(emptyString.isPresent());

        // Optional.of()
        Optional<String> result=Optional.of("Hi");
        System.out.println(emptyString.isPresent());

        result=Optional.of(null);
        System.out.println(result.isPresent());

        // Optional.ofNullable()
        result=Optional.ofNullable("Hi");
        System.out.println(emptyString.isPresent());

        result=Optional.ofNullable(null);
        System.out.println(result.isPresent());




    }
}
