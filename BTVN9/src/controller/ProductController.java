package controller;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {

    private final ProductService productService = new ProductService();
    public void printMenu()
    {
        System.out.println("********** MENU **********");
        System.out.println("1.Xem danh sach san pham");
        System.out.println("2.Tìm sản phẩm theo tên");
        System.out.println("3.Tìm sản phẩm theo id");
        System.out.println("4.Tìm các sản phẩn có số lượng");
        System.out.println("5.Tìm sản phẩm theo mức gia");
        System.out.println("6.Thoat\n");
    }
    public void run()
    {
        Scanner sc= new Scanner(System.in);
        boolean isContinue = true;
        int option = 0;

        while (isContinue)
        {
            printMenu();
            System.out.println("Nhap lua chon : ");
            option =Integer.parseInt(sc.nextLine());
            switch (option)
            {
                case 1 : {
                    ArrayList<Product> products = productService.getProducts();
                    if(products.isEmpty())
                    {
                        System.out.println("khong co san pham nao");
                    }
                    else
                    {
                        System.out.println("danh sach san pham :");
                        productService.printInfo(products);
                    }
                    break;

                }
                case 2 : {
                    System.out.print("Nhap ten san pham : ");
                    String name = sc.nextLine();

                    ArrayList<Product> products = productService.findByName(name);
                    if(products.isEmpty())
                    {
                        System.out.println("khong co san pham ten " + name);
                    }
                    else
                    {
                        System.out.println("san pham co ten " + name + " bao gom :");
                        productService.printInfo(products);
                    }
                    break;
                }
                case 3 : {
                    System.out.print("Nhap ten ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    Product product = productService.findById(id);


                    if(product == null)
                    {
                        System.out.println("khong co san pham co ID " + id);
                    }
                    else
                    {
//                        System.out.println("san pham co ID " + id + " la:");
//                        System.out.println(product);
                        productService.deleteEmployee(id);
                        System.out.println("Xoa thanh cong san pham co id : " + id);

                    }
                    break;
                }

                case 4 : {
                    ArrayList<Product> products = productService.findByQuantity(0,5);
                    if (products.isEmpty())
                    {
                        System.out.println("Khong co san pham co so luong duoi 5");
                    }
                    else
                    {
                        System.out.println("các sản phẩn có số lượng dưới 5 la : ");
                        productService.printInfo(products);
                    }
                    break;
                }
                case 5 : {
                    System.out.print("Nhap muc gia muon tim kiem ");
                    System.out.println("Muc gia nho nhat :");
                    int minPrice = Integer.parseInt(sc.nextLine());
                    System.out.println("Muc gia lon nhat :");
                    int maxPrice = Integer.parseInt(sc.nextLine());
                    ArrayList<Product> products = productService.findByPrice(minPrice,minPrice);
                    if (products.isEmpty())
                    {
                        System.out.println("Khong co san pham co muc gia tu :" + minPrice + " den " + maxPrice);
                    }
                    else
                    {
                        System.out.println("cac san pham co muc gia tu :" + minPrice + " den " + maxPrice);
                        productService.printInfo(products);
                    }
                    break;
                }

                case  6 : {
                    isContinue = false;
                    break;
                }
                default:{
                    System.out.println("lua chon khong phu hop");
                    break;
                }


            }
        }
    }
}
