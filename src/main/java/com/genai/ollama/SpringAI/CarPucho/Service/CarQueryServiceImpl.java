package com.genai.ollama.SpringAI.CarPucho.Service;

import com.genai.ollama.SpringAI.CarPucho.Entity.CarResponse;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
public class CarQueryServiceImpl implements CarQueryService {

    private ChatClient chatClient;

    public CarQueryServiceImpl(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @Override
    public CarResponse chat(String query) {


        // 1. pass empty prompt and call user and system after that
//        return chatClient.prompt().user(query).system("as an car expert").call().content();

        // 2. pass query string in propmpt and directly get content
//        return chatClient.prompt(query).call().content();

        // 3. pass propmpt itself and mapping in response classs
        Prompt prompt = new Prompt(query);
        CarResponse carResponse=   chatClient.prompt(prompt).call().entity(CarResponse.class);
        return carResponse;





    }
}
