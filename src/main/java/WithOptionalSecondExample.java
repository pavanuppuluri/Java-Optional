import java.util.Optional;

public class WithOptionalSecondExample {
    public static void main(String[] args){
        Optional<Insurance> i=Optional.of(new Insurance("XYZ Corp",1000));
        Optional<Bike> b=Optional.of(new Bike("Activa", "AB 1234", i));
        Person personWithBikeInsurance=new Person("Pavan",b);
        System.out.println(getBikeInsuranceDetails(Optional.of(personWithBikeInsurance)));
        //System.out.println(getBikeInsuranceDetails(Optional.empty()));
    }
    static String getBikeInsuranceDetails(Optional<Person> p)
    {
//        String name = p.map(Person::getBike)     // Returns Optional<Optional<Bike>>
//                        .map(Bike::getInsurance)
//                         .map(Insurance::getName)
//                          .orElse("Unknown");

        String name = p.flatMap(Person::getBike)
                .flatMap(Bike::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
        return name;
    }

}



class Person
{
    String name;
    Optional<Bike> bike;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    public Person(String name, Optional<Bike> bike) {
        this.name = name;
        this.bike = bike;
    }
}

class Bike
{
    String model;
    String registrationNumber;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

    public void setInsurance(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }

    Optional<Insurance> insurance;

    public Bike(String model, String registrationNumber, Optional<Insurance> insuranceDetails) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.insurance = insuranceDetails;
    }
}

class Insurance
{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(double insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public Insurance(String name, double insuredAmount) {
        this.name = name;
        this.insuredAmount = insuredAmount;
    }

    double insuredAmount;
}
