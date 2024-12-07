package org.example;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String userUrl = "https://fake-json-api.mock.beeceptor.com/users";
        String companyUrl = "https://fake-json-api.mock.beeceptor.com/companies";

        ApiService apiService = new ApiService();
        Parser parser = new Parser();
        User user = new User();
        Company company = new Company();

        System.out.println("Users:");
        // Отправляем GET-запрос для получения данных пользователей
        String usersResponse = apiService.sendGetRequest(userUrl);
        // Парсим JSON-ответ в список пользователей
        List<Map<String, Object>> users = parser.parseJsonResponse(usersResponse);
        user.printUsers(users);

        System.out.println("**************************************************");
        System.out.println("\nCompanies:");
        // Отправляем GET-запрос для получения данных компаний
        String companiesResponse = apiService.sendGetRequest(companyUrl);
        // Парсим JSON-ответ в список компаний
        List<Map<String, Object>> companies = parser.parseJsonResponse(companiesResponse);
        company.printCompanies(companies);
    }
}