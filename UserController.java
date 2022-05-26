package controller;

import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.Scanner;
public class UserController {
    private UserService userService = new UserService();
    public  static  String email, pass,username;

    public void printMenu()
    {
        System.out.println("********** MENU **********");
        System.out.println("1.Login");
        System.out.println("2.Registration");
        System.out.println("3.Forget password");

    }
    public void printMenuItem()
    {
        System.out.println("********** MENU **********");
        System.out.println("1.Change username");
        System.out.println("2.Change Email");
        System.out.println("3.Change password");
        System.out.println("4.Logout");
        System.out.println("5.Exit!");

    }
    public int selection() {
        printMenu();
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());

    }
//    public  int runitem()
//    {
//        printMenuItem();
//        System.out.println("Enter your choice");
//        Scanner sc = new Scanner(System.in);
//        return Integer.parseInt(sc.nextLine());
//    }


    public  void run()
    {
        Scanner sc= new Scanner(System.in);

        ArrayList<User> users = new ArrayList<User>();
        boolean isContinue = true;
        int option = 0;
        while (isContinue) {
            printMenu();
            System.out.println("Nhap lua chon : ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1 : {
                    do {
                        System.out.println("Nhap email : ");
                         email = sc.nextLine();
                        System.out.println("Nhap password : ");
                         pass = sc.nextLine();

                        if (userService.kiemtraDangNhap(email, pass) == null) {
                            System.out.println("Incorrect account or password");
                        } else {
                            System.out.println("Logged in successfully");
                            System.out.println("Chao mung " + userService.kiemtraDangNhap(email, pass).getUsername() + ",ban co the thuc hien cac cong viec sau :");
                            runitem();
                        }
                    } while (userService.kiemtraDangNhap(email, pass) == null);
                    break;

                }
                case 2 : {
                 try {
                     System.out.println("Nhap username : ");
                     String username = sc.nextLine();
                     System.out.println("Nhap email : ");
                      email = sc.nextLine();
                     if(userService.patternMatches(email) == true)
                     {
                         System.out.println("Dinh dang email khong dung");
                     }
                     if(userService.findEmail(email) != null)
                     {
                         System.out.println("Email da ton tai trong he thong");
                     }
                     System.out.println("Nhap password : ");
                      pass = sc.nextLine();
                     if (pass.length() > 7 && pass.length() < 15 )
                     {
                         users.add(new User(username,email,pass));
                         System.out.println("Dang ky thanh cong");
                     }
                     else
                     {
                         System.out.println("Do dai password khong hop le");
                     }
                     break;

                 }catch (Exception exception)
                 {
                     System.out.printf(exception.toString());
                 }

                }
                case  3 : {
                    System.out.println("Nhap email : ");
                     email = sc.nextLine();
                    if(userService.findEmail(email) == null)
                    {
                        System.out.println("Chua ton tai tai khoan");
                    }
                    else
                    {
                        System.out.println("Nhap mat khau moi : ");
                        String newpass = sc.nextLine();
                        userService.ChangePass(email,newpass);
                        System.out.println("Thay doi mat khau thanh cong.");
                        runitem();
                    }
                    break;
                }
                default:{
                    System.out.println("lua chon khong phu hop");
                    break;
                }

            }
        }

    }
    public void runitem() {

        Scanner sc = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<User>();
        boolean isContinue = true;
        int option = 0;
        while (isContinue) {
            printMenuItem();
            System.out.println("Nhap lua chon : ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                        System.out.println("Nhap new name : ");
                       String newname = sc.nextLine();
                        userService.ChangeUserName(email,pass,newname);
                        System.out.println("thay doi username thanh cong");
                    break;
                }
                case 2: {
                    System.out.println("Nhap new email : ");
                    String newmail = sc.nextLine();
                    if (userService.findEmail(newmail) != null)
                    {
                        System.out.println("Email da ton tai trong he thong");
                    }
                    userService.ChangeEmail(email,pass,newmail);
                    System.out.println("thay doi email thanh cong");
                    break;
                }
                case 3:
                {
                    System.out.println("Nhap new password : ");
                    String newpass = sc.nextLine();

                    userService.ChangePass(email,newpass);
                    System.out.println("thay doi email thanh cong");
                    break;
                }
                case 4:
                {
                    run();
                    break;
                }
                case 5:{
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
