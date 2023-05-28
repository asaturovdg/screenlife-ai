package ru.wostarnn.screenlifeai.manager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.wostarnn.screenlifeai.dto.ChatRequest;
import ru.wostarnn.screenlifeai.dto.ChatResponse;

@Component
public class PromptManager {

    private static final double TEMPERATURE = 0.8;
    private final RestTemplate restTemplate;

    @Value("${gpt.api.url}")
    private String apiUrl;

    public PromptManager(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String generateMessage(String prompt, String sysMes) {
        // create a request
        ChatRequest request = new ChatRequest(prompt, sysMes, TEMPERATURE, 1);

        // call the API
        ChatResponse response = restTemplate.postForObject(apiUrl, request, ChatResponse.class);

        if (response == null || response.getReplies() == null || response.getReplies().isEmpty()) {
            return "No response";
        }

        // return the first response
        return response.getReplies().get(response.getReplies().size() - 1).getText();
    }
}
