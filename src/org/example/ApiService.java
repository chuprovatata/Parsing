package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiService {
    // Метод для отправки GET-запроса по указанному URL
    public String sendGetRequest(String urlString) {
        StringBuilder result = new StringBuilder();
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(urlString).openConnection();
            connection.setRequestMethod("GET");
            // Проверка кода ответа
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                // Если ответ успешный, читаем данные из входного потока построчно и добавляем к результату
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String string;
                    while ((string = reader.readLine()) != null) {
                        result.append(string);
                    }
                }
            } else {
                System.err.println("GET request failed: " + connection.getResponseCode());
            }
        } catch (IOException e) {
            System.err.println("Error during GET request: " + e.getMessage());
        }
        return result.toString();
    }
}