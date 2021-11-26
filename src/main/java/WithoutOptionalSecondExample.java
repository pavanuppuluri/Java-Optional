//public class WithoutOptionalSecondExample {
//    public static void main(String[] args){
//
//
//        Insurance i=new Insurance("XYZ Corp",1000);
//        Bike b=new Bike("Activa", "AB 1234", i);
//        Person personWithBikeInsurance=new Person("Pavan",b);
//
//        String name= getBikeInsuranceDetails(personWithBikeInsurance);
//        System.out.println(name);
//
//        Person personWithoutBike = new Person("Kavya", null);
//        name = getBikeInsuranceDetails(personWithoutBike);
//        System.out.println(name);
//
//    }
//
////    static String getBikeInsuranceDetails(Person p)
////    {
////        return p.getBike().getInsurance().getName();
////    }
//
//    static String getBikeInsuranceDetails(Person p)
//    {
//        if (p != null) {
//        Bike b = p.getBike();
//        if (b != null) {
//            Insurance i = b.getInsurance();
//            if (i != null) {
//                return i.getName();
//            }
//        }
//    }
//        return "Unknown";
//    }
//
//
//}
//
//class Person
//{
//    String name;
//    Bike bike;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Bike getBike() {
//        return bike;
//    }
//
//    public void setBike(Bike bike) {
//        this.bike = bike;
//    }
//
//    public Person(String name, Bike bike) {
//        this.name = name;
//        this.bike = bike;
//    }
//}
//
//class Bike
//{
//    String model;
//    String registrationNumber;
//
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        this.registrationNumber = registrationNumber;
//    }
//
//    public Insurance getInsurance() {
//        return insurance;
//    }
//
//    public void setInsurance(Insurance insurance) {
//        this.insurance = insurance;
//    }
//
//    Insurance insurance;
//
//    public Bike(String model, String registrationNumber, Insurance insuranceDetails) {
//        this.model = model;
//        this.registrationNumber = registrationNumber;
//        this.insurance = insuranceDetails;
//    }
//}
//
//class Insurance
//{
//    String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getInsuredAmount() {
//        return insuredAmount;
//    }
//
//    public void setInsuredAmount(double insuredAmount) {
//        this.insuredAmount = insuredAmount;
//    }
//
//    public Insurance(String name, double insuredAmount) {
//        this.name = name;
//        this.insuredAmount = insuredAmount;
//    }
//
//    double insuredAmount;
//}
//
//
