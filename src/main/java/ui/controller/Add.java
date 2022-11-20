package ui.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.model.Animal;

import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Add extends RequestHandler {

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        Animal animal = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            animal = objectMapper.readValue(request.getInputStream(), Animal.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        getService().add(animal);
        return "OK";
    }
}
