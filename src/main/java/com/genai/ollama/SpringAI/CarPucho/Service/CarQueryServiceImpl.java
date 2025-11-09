package com.genai.ollama.SpringAI.CarPucho.Service;

import com.genai.ollama.SpringAI.CarPucho.Entity.CarResponse;
import com.genai.ollama.SpringAI.CarPucho.advisor.TokenAdvisor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CarQueryServiceImpl implements CarQueryService {

    private ChatClient chatClient;

    @Autowired
    TokenAdvisor tokenAdvisor;

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

    @Override
    public CarResponse getQuery(String query, String segment, Integer budget) {
        String finalQueryString = query + "In the {segment}" + "around budget {budget}" + "Please answer it as an Car expert";
        PromptTemplate promptTemplate = PromptTemplate.builder().template(finalQueryString).build();

        String rendererMessage = promptTemplate.render(Map.of(
                "segment" ,segment,
                "budget" , budget

        ));

        Prompt prompt = new Prompt(rendererMessage);

        return chatClient
                .prompt(prompt)
                .advisors(tokenAdvisor)
                .call()
                .entity(CarResponse.class);
    }
}
