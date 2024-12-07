package org.example;

import java.util.List;
import java.util.Map;

public class User {
    public void printUsers(List<Map<String, Object>> users) {
        int index = 1;
        for (Map<String, Object> user : users) {
            System.out.println("User  " + index + ":");
            printMap(user);
            System.out.println();
            index++;
        }
    }

    private void printMap(Map<String, Object> map) {
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}