package com.example.userdefinedexception.data;

import com.example.userdefinedexception.exception.PlayerNotFoundException;

import java.util.Scanner;


public class Players {
    private int playerAge;
    public void getPlayer(int age) throws PlayerNotFoundException {
        // condition to generate exception
        if(playerAge < age){
            /*// generate and throw the exception
            PlayerNotFoundException p = new PlayerNotFoundException("player age is not valid");
            // throw it
            throw p;*/

            throw new PlayerNotFoundException("invalid age");
        }
    }

    public static void main(String[] args) {
        Players p1 = new Players();
        Scanner sc = new Scanner(System.in);
        //sc.close();
        System.out.println("verfication age");
        try {
            p1.getPlayer(Integer.parseInt(sc.nextLine()));
        }catch (PlayerNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
