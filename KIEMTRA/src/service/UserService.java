package service;

import model.User;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserService {
    private ArrayList<User> users;

    public UserService()
    {
        init();
    }
    public void init()
    {
        users = new ArrayList<User>();
        users.add(new User("Diep","b@gmail.com","123"));
        users.add(new User("Nhung","a@gmail.com","456"));
    }

    public ArrayList<User> getUsers() {
        return users;
    }
    public void print(ArrayList<User> books) {
        for (User user: users) {
            System.out.println(user);
        }
    }

    public User kiemtraDangNhap(String mail, String pass)
    {
        for (User user: users)
        {
            if(user.getEmail().equals(mail) && user.getPassword().equals(pass))
            {
                return user;
            }
        }
        return null;
    }

    public User findEmail(String email)
    {
        for (User u: users)
        {
            if (u.getEmail().equals(email))
            {
                return u;
            }
        }
        return null;
    }
    public void ChangePass(String email, String pass)
    {
        for (User user: users)
        {
            if (user.getEmail().equals(email))
            {
                user.setPassword(pass);
            }

        }
    }

    public void ChangeUserName(String email, String pass , String newname)
    {
        for (User user: users)
        {
            if (user.getEmail().equals(email) &&  user.getPassword().equals(pass)  )
            {
                user.setUsername(newname);
            }

        }
    }

    public void ChangeEmail(String email, String pass , String newEmail)
    {
        for (User user: users)
        {
            if (user.getEmail().equals(email) &&  user.getPassword().equals(pass)  )
            {
                user.setUsername(newEmail);
            }

        }
    }

    public static boolean patternMatches(String emailAddress) {
        String regexPattern = "^(.+)@(\\S+)$";
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }


}