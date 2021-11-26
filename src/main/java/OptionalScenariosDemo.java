import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalScenariosDemo {
    public static void main(String[] args) {
        ProductInfo p1=new ProductInfo(1,"Dell Laptop","Laptop", 100, Arrays.asList("A","B","C"));
        ProductInfo p2=new ProductInfo(2,"HP Laptop","Laptop", 90, Arrays.asList("A","B","C"));
        ProductInfo p3=new ProductInfo(3,"iPhone","Mobile", 99, Arrays.asList());

        List<ProductInfo> productList= Arrays.asList(p1,p2,p3);

        /* Check if a given product is available or not */

        Optional<ProductInfo> product = productList.stream()
                .filter(p->p.getProductName().equals("iPhone"))
                .findFirst();

        if(product.isPresent())
        {
            System.out.println("Product details ... ");
            // Use product.get() to get product details
        }
        else
            System.out.println("Sorry! product not available");


        /* If a product is available get the price of it */

       productList.stream().filter(p->p.getProductName().equals("iPhone")).findFirst().ifPresent(p->{
           System.out.println("Price ="+p.getPrice());
       });

       double price = productList.stream()
                .filter(p->p.getProductName().equals("iPhone"))
                .findFirst()
                .map(p->p.getPrice())
                .orElse(new Double(-1));

       /* Get the list of alternate products if any */

        List<String> alternateProducts= productList.stream().filter(p->p.getProductName().equals("Dell Laptop")).findFirst().map(p->p.getAlterNateProducts()).orElse(Arrays.asList("No alternate products available"));
        alternateProducts.forEach(System.out::println);

        // orElseGet - Use REST API call to get alternate products
        List<String> alternateProducts1= productList.stream().filter(p->p.getProductId()==9).findFirst().map(p->p.getAlterNateProducts()).orElseGet(()-> Arrays.asList("No alternate products available"));
        alternateProducts1.forEach(System.out::println);

        // orElseThrow - Use REST API call to get alternate products
        List<String> alternateProducts2= productList.stream().filter(p->p.getProductId()==9).findFirst().map(p->p.getAlterNateProducts()).orElseThrow(()->new RuntimeException("PRODUCT_NOT_FOUND"));
        alternateProducts1.forEach(System.out::println);






        /* Send mail to all the Customers who opted to notify for a given Product
           availability
         */


        ProductInventory pi1=new ProductInventory("Dell Laptop",15);
        ProductInventory pi2=new ProductInventory("HP Laptop",9);
        ProductInventory pi3=new ProductInventory("iPhone",0);

        List<ProductInventory> productInventory= Arrays.asList(pi1,pi2,pi3);
        productInventory.stream()
                .filter(p->p.getProductName().equals("Dell Laptop") && p.getInStockQuantity()>0)
                .findFirst().ifPresent(p->{
                    System.out.println("Dell Laptop Available!!!");
                    System.out.println("Send email to all registered customers!!!");
                    // Logic to send mails to all customers who registered alert
                    // on this product availability
        });



    }


}
class ProductInfo
{
    int productId;

    public List<String> getAlterNateProducts() {
        return alterNateProducts;
    }

    public void setAlterNateProducts(List<String> alternateProducts) {
        this.alterNateProducts = alternateProducts;
    }

    double price;



    String productName;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    String productCategory;

    public ProductInfo(int productId, String productName, String productCategory, double price, List<String> alterNateProducts) {
        this.productId = productId;
        this.price = price;
        this.productName = productName;
        this.productCategory = productCategory;
        this.alterNateProducts = alterNateProducts;
    }

    List<String> alterNateProducts;
}

class ProductInventory
{
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getInStockQuantity() {
        return inStockQuantity;
    }

    public void setInStockQuantity(int inStockQuantity) {
        this.inStockQuantity = inStockQuantity;
    }

    String productName;

    public ProductInventory(String productName, int inStockQuantity) {
        this.productName = productName;
        this.inStockQuantity = inStockQuantity;
    }

    int inStockQuantity;
}
