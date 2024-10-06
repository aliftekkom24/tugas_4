package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username, password, fullname, roles;
        Scanner sc = new Scanner(System.in);
        Authenticator auth = new Authenticator();

        while (true){
            System.out.println("REGISTER");
            System.out.print("Username: ");
            username = sc.nextLine();
            System.out.print("Password: ");
            password = sc.nextLine();
            System.out.print("Full Name: ");
            fullname = sc.nextLine();
            System.out.print("Roles: ");
            roles = sc.nextLine();

            auth.register(username, password, fullname, roles);
            System.out.print("Again? (y/n):");
            if (!(sc.nextLine().equalsIgnoreCase("y"))){
                break;
            }
        }
        while(true){
            System.out.println("LOGIN");
            System.out.print("Username: ");
            username = sc.nextLine();
            System.out.print("Password: ");
            password = sc.nextLine();

            auth.login(username, password);
            System.out.print("Again? (y/n):");
            if (!(sc.nextLine().equalsIgnoreCase("y"))){
                break;
                //tugas ini milllik kelompok 20
            }
        }
    }
}
