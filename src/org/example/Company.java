package org.example;

import java.util.List;
import java.util.Map;

public class Company {
    public void printCompanies(List<Map<String, Object>> companies) {
        int index = 1;
        for (Map<String, Object> company : companies) {
            System.out.println("Company " + index + ":");
            printMap(company);
            System.out.println();
            index++;
        }
    }

    private void printMap(Map<String, Object> map) {
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
