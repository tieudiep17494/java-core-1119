package service;


import model.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductService {
    private ArrayList<Product> products;

    public ProductService() {
        init();
    }

    private void init()
    {
        products = new ArrayList<>();
        products.add(new Product(1,"vo","vo viet",100,50_000));
        products.add(new Product(2,"but","but viet",100,100_000));
        products.add(new Product(3,"sach","sach",100,150_000));

    }

    public ArrayList<Product> getProducts()
    {
        return products;
    }
    //Xem danh sách sản phẩm
    public void printInfo(ArrayList<Product> list)
    {
        for(Product product: list)
        {
            System.out.println(product);
        }
    }

    //2.Tìm sản phẩm theo tên
    public ArrayList<Product> findByName(String name){
        ArrayList<Product> list = new ArrayList<>();
        for (Product p: products)
        {
            if(p.getName().toLowerCase().contains(name.toLowerCase()))
            {
                list.add(p);
            }
        }
        return list;
    }
//3.Tìm sản phẩm theo id:
    public Product findById(int id)
    {
        for (Product p: products)
        {
            if(p.getId() == id)
            {
               return p;
            }
        }
        return null;
    }

    //xoa theo id
    public void deleteEmployee(int id){
//        ArrayList<Product> list = new ArrayList<>();
//        for (Product p: products)
//        {
//            if(p.getId() == id)
//            {
//                list.remove(p);
//            }
//        }

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            if(product.getId() == id)
            {
                products.remove(product);
                break;
            }

        }

    }

//4.Tìm các sản phẩn có số lượng dưới 5
    public ArrayList<Product>findByQuantity(int minQuantity, int maxQuantity)
    {
        ArrayList<Product> list = new ArrayList<>();
        for (Product p: products)
        {
            if(p.getQuantity() > minQuantity && p.getQuantity()< maxQuantity)
            {
                list.add(p);
            }
        }
        return list;
    }

    //5.Tìm sản phẩm theo mức giá:
    public ArrayList<Product>findByPrice(int minPrice, int maxPrice)
    {
        ArrayList<Product> list = new ArrayList<>();
        for (Product p: products)
        {
            if(p.getPrice() > minPrice && p.getPrice()< maxPrice)
            {
                list.add(p);
            }
        }
        return list;
    }
}
