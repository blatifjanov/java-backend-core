package com.company;

import com.company.dto.Database;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Database db = new Database();
        System.out.println(db.getUsers());
    }
}
