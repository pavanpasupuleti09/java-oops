//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product(); // Product -> class name,  product -> reference variable
        product.id = 1;
        product.name = "realme TechLife 80 cm (32 inch) QLED HD Ready Smart Google TV (32HDGQRDDAQ)";
        product.rating = 4.3F;
        product.maxRetailPrice = 23999;
        product.discountPercentage = 55;
        product.isAvailable = true;
        product.reviewsCount = 26847;
        product.company = "realme ";
        product.category =  "Tv";
        product.displaySize = 55;
        product.manufacturedYear = 2026;
        System.out.println("id :" +product.id);
        System.out.println("name :" +product.name);
        System.out.println("Max Retail Price :" +product.maxRetailPrice);
        System.out.println("Rating :" +product.rating);
        System.out.println("Discount Percentage :" +product.discountPercentage);
        System.out.println("Is available :" +product.isAvailable);
        System.out.println("Reviews count :" +product.reviewsCount);
        System.out.println("company :" +product.company);
        System.out.println("category :" +product.category);
        System.out.println("Display size :" +product.displaySize);
        System.out.println("manufactured Year :" +product.manufacturedYear);
        System.out.println("--------------------------------------");




    }
    }
