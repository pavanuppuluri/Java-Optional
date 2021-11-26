import java.util.Optional;

public class OptionalFlatMapExample {
    public static void main(String[] args) {
        Optional<Optional<String>> nestedOptional=Optional.of(Optional.of("Test FlatMap"));

        //String mapResult = nestedOptional.map(s->s).get();
        String mapResult = nestedOptional.map(s->s).get().get(); // Any easy method than this
        String flatMapResult = nestedOptional.flatMap(s->s).get();

        System.out.println(nestedOptional.map(s->s).get().get().toUpperCase());
        System.out.println(nestedOptional.flatMap(s->s).get().toUpperCase());

        Optional<String> emptyString=Optional.of(null);

        System.out.println(emptyString.isPresent());




    }
}



