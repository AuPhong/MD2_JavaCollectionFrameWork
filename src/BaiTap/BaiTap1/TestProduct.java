package BaiTap.BaiTap1;

public class TestProduct {
    public static void main(String[] args) {
        ProductMange productMange = new ProductMange();
        productMange.add(new Product("q","asf", 100));
        productMange.modifyById("a","banana",300);
//productMange.deleteById("a");
        //System.out.println(productMange.searchByName("banana"));;
        productMange.ascendingOrder();
        productMange.display();;


    }


}
