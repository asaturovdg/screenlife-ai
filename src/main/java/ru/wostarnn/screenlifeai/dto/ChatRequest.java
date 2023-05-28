package ru.wostarnn.screenlifeai.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class ChatRequest {

    private String prompt;
    private String systemMessage;
    private double temperature;
    private int top_p;

    // getters and setters
}