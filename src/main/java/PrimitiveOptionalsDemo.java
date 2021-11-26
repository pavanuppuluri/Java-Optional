import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.Stream;

public class PrimitiveOptionalsDemo {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(9);
        System.out.println(optionalInt.getAsInt());

        OptionalDouble optionalDouble=OptionalDouble.of(10.0);
        System.out.println(optionalDouble.getAsDouble());

        OptionalLong optionalLong=OptionalLong.of(20);
        System.out.println(optionalLong.getAsLong());

//        String[] s={"999","123","666"};
//
//        Stream.of(s).map(PrimitiveOptionalsDemo::stringToInt).forEach(i->{
//            System.out.println(i.get());
//        });
//
//        Stream.of(s).map(PrimitiveOptionalsDemo::stringToIntPrimitve).forEach(i->{
//            System.out.println(i.getAsInt());
//        });



    }


}
