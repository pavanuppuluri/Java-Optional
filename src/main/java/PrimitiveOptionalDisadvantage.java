import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class PrimitiveOptionalDisadvantage {
    public static void main(String[] args) {

        Optional<String> stringOptional=Optional.of("123456");
        stringOptional.flatMap(PrimitiveOptionalDisadvantage::stringToInt).ifPresent(System.out::println);

        //stringOptional.flatMap(PrimitiveOptionalDisadvantage::stringToIntPrimitve).ifPresent(System.out::println);


    }

    public static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static OptionalInt stringToIntPrimitve(String s) {
        try {
            return OptionalInt.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return OptionalInt.empty();
        }
    }
}
