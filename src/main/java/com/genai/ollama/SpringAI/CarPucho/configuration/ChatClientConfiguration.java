package com.genai.ollama.SpringAI.CarPucho.configuration;

import com.genai.ollama.SpringAI.CarPucho.Tools.CarDetailsFetcher;
import com.genai.ollama.SpringAI.CarPucho.advisor.TokenAdvisor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfiguration {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {
        return builder
                .defaultAdvisors(new SimpleLoggerAdvisor(), new TokenAdvisor())
                .defaultTools(new CarDetailsFetcher())
                .build();
    }
}
