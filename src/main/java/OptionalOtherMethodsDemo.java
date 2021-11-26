import java.util.Optional;

public class OptionalOtherMethodsDemo {
    public static void main(String[] args) {

        // Creates an empty Optional
        Optional<String> emptyString= Optional.empty();
        System.out.println(emptyString.isPresent());

        // Optional.of()
        Optional<String> result=Optional.of("Hi");
        System.out.println(emptyString.isPresent());


         Optional<Integer> number = Optional.of(9);
         Optional<Integer> gTZero = number.filter(i->i>0);

         if(gTZero.isPresent())
         {
             System.out.println("Number > 0");
         }
         else
         {
             System.out.println("Number not > 0");
         }

        number = Optional.of(9);
        Optional<Integer> square = number.map(i->i*i);

        square.ifPresent(i-> {
                    System.out.println("Square of number is "+i);
                }
        );
    }
}
