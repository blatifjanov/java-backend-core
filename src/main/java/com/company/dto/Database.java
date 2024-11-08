package com.company.dto;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Database {
    private List<User> users;

    public Database() {
        this.users = generateRandomUsers();
    }

    private List<User> generateRandomUsers() {
        var firstNames = Arrays.asList("John", "Jane", "Michael", "Sarah", "Robert", "Emma", "William", "Olivia", "James", "Isabella");
        var surnames = Arrays.asList("Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez");
        var random = new Random();
        var count =20;

        return IntStream.range(0, count).mapToObj(i -> {
            String name = firstNames.get(random.nextInt(firstNames.size()));
            String surname = surnames.get(random.nextInt(surnames.size()));
            int year = 1950 + random.nextInt(50);
            int month = 1 + random.nextInt(12);
            int dayOfMonth = 1 + random.nextInt(28);
            LocalDate birthday = LocalDate.of(year, month, dayOfMonth);
            return new User(name, surname, birthday);
        }).collect(Collectors.toList());
    }

    public List<User> getUsers() {
        return users;
    }
}
