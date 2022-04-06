package BaiTap.BaiTap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductMange {
    public static ArrayList<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("a", "apple", 100));
        productList.add(new Product("b", "banana", 200));
    }

    public void add(Product product) {
        productList.add(product);
    }

    public void modifyById(String id, String name, double price) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).id == id) {
                productList.get(i).name = name;
                productList.get(i).price = price;
            }
        }
    }

    public void deleteById(String id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).id == id) {
                productList.remove(i);
            }
        }
    }

    public Product searchByName(String name) {

        Product sold = productList.get(0);
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).name.equals(name)) {
                sold = productList.get(i);
                break;
            } else {
                sold = null;
            }
        }
        return sold;
    }

    public void ascendingOrder() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o1.getPrice()-o2.getPrice());
            }
        });
    }

    public void descendingOrder() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o2.getPrice()-o1.getPrice());
            }
        });
    }

    public void display() {
        System.out.println(productList);
    }
}
