package com.doku;

import com.google.gson.Gson;

public class Main {


    public static void main(String[] args) {
        System.out.println("hello world");

        JsonObject jsonObject = new JsonObject();
        jsonObject.setTitle("Sample Konfabulator Widget");
        jsonObject.setName("main_window");
        jsonObject.setWidth(500);
        jsonObject.setHeight(500);

        jsonObject.getTitle();

        System.out.println("JSONObject: " + jsonObject);

        Gson gson = new Gson();
        String jsonResult = gson.toJson(jsonObject);

        System.out.println("JSON RESULT: " + jsonResult);

        String jsonTest = "        {\n" +
                "                \"title\": \"Sample Konfabulator Widget\",\n" +
                "                \"name\": \"main_window\",\n" +
                "                \"width\": 500,\n" +
                "                \"height\": 500\n" +
                "        },";

        JsonObject jsonObject1 = gson.fromJson(jsonTest, JsonObject.class);
        jsonObject1.getTitle();
    }
}
