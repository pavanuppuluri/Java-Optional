import java.util.Optional;

public class OptionalRetrieveDemo {
    public static void main(String[] args) {


         Optional<String> emptyString=Optional.empty();
         System.out.println(emptyString.isPresent());

         Optional<String> result =Optional.of("Hi");
         if(result.isPresent())
         {
             System.out.println(result.get());
         }
         else
         {
             System.out.println("Empty optional");
         }

//        result =Optional.ofNullable("Hi");
//        result.ifPresent(System.out::println);
//
//        result =Optional.ofNullable(null);
//        result.ifPresent(System.out::println);

        // Optional<String> hiNull =Optional.of(null);
        // if(hiNull.isPresent())
        // {
        //     System.out.println(hiNull.get());
        // }
        // else
        // {
        //     System.out.println("Empty optional");
        // }

        // Optional<String> hiNullable =Optional.ofNullable(null);
        // if(hiNullable.isPresent())
        // {
        //     System.out.println(hiNullable.get());
        // }
        // else
        // {
        //     System.out.println("Empty optional");
        // }



         Optional<String> s =Optional.ofNullable("Hi");
         String orElseResult = s.orElse("No value");
         System.out.println(orElseResult);

         s =Optional.ofNullable(null);
         orElseResult = s.orElse("No value");
         System.out.println(orElseResult);

         s =Optional.ofNullable(null);
         String orElseGetResult = s.orElseGet(()->{return "No value";});
         System.out.println(orElseGetResult);

         try
         {
          s =Optional.ofNullable(null);
          String orElseThrowResult = s.orElseThrow(()->{
             return new Exception("NO_VALUE_EXCEPTION");
         });
         System.out.println(orElseThrowResult);
         }
         catch(Exception e)
         {
             System.out.println(e.getMessage());
         }






    }
}
