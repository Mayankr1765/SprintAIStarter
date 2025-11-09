package com.genai.ollama.SpringAI.CarPucho.controller;

import com.genai.ollama.SpringAI.CarPucho.Entity.CarResponse;
import com.genai.ollama.SpringAI.CarPucho.Service.CarQueryService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;

@Controller
@RequestMapping("/ai")
public class CarController {


    private CarQueryService carQueryService;

    public CarController(CarQueryService carQueryService){
        this.carQueryService = carQueryService;
    }

    @GetMapping("/chat")
    public ResponseEntity<CarResponse> chat(
            @RequestParam(value = "query" ,required = true ) String query,
            @RequestParam(value = "segment" , required = false) String segment,
            @RequestParam(value = "budget" , required = false) Integer budget) {
        CarResponse response = carQueryService.getQuery(query,segment,budget);
        return ResponseEntity.ok(response);

    }


}
