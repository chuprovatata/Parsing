package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class Parser {
    private final Gson json = new Gson();
    // Метод для парсинга JSON-ответа в список карт
    public List<Map<String, Object>> parseJsonResponse(String jsonResponse) {
        Type listType = new TypeToken<List<Map<String, Object>>>() {}.getType();
        return json.fromJson(jsonResponse, listType);
    }
}
