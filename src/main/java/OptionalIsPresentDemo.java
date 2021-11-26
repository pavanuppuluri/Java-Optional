import java.util.Optional;

public class OptionalIsPresentDemo {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent());
        System.out.println(emptyOptional.get());

        Optional<String> optionalWithValue = Optional.of("Hi!");
        System.out.println(optionalWithValue.isPresent());
        System.out.println(optionalWithValue.get());
    }
}
