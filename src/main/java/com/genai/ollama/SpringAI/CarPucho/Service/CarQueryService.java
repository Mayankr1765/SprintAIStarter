package com.genai.ollama.SpringAI.CarPucho.Service;

import com.genai.ollama.SpringAI.CarPucho.Entity.CarResponse;
import org.springframework.stereotype.Service;

@Service
public interface CarQueryService {

    CarResponse chat(String query);

    CarResponse getQuery(String query , String segment , Integer budget);
}
