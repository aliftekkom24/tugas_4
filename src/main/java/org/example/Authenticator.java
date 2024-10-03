package org.example;

import java.util.ArrayList;

public class Authenticator {
    ArrayList<String[]> users =   new ArrayList<String[]>();
    private String username, password, fullname, roles;
    public void register(String username, String password, String fullname, String roles) {
        String[]reg = {username, password, fullname, roles};
        boolean uppercase = false, lowercase = false, digits = false;
        char[] Password = password.toCharArray();
        for (int i = 0; i < password.length(); i++)
        {
            if (Character.isUpperCase(Password[i]))
            {
                uppercase = true;
            }
            if (Character.isLowerCase(Password[i]))
            {
                lowercase = true;
            }
            if (Character.isDigit(Password[i]))
            {
                digits = true;
            }
        }
        if(password.length() < 8 || !uppercase || !lowercase || !digits) {
            System.out.println("Password must contain at least 8 characters, one uppercase letter, one lowercase letter, and one digit.");
        }else {
            this.users.add(reg);
        }
    }

    private boolean check_password(){
        for(int i = 0; i < users.size(); i++){
            if (users.get(i)[0].equals(username) && users.get(i)[1].equals(password)){
                fullname = users.get(i)[2];
                roles = users.get(i)[3];
                return true;
            }
        }
        return false;
    }
    public void login(String username, String password){
        this.username = username;
        this.password = password;
        boolean status = check_password();
        if(status){
            System.out.println("\nWelcome "+fullname);
            System.out.println("Loged in as "+roles);
        } else {
            System.out.println("\nInvalid Login");
        }
    }
}
