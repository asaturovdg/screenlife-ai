package ru.wostarnn.screenlifeai.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ChatResponse {

    private List<Reply> replies;

    public static class Reply {

        private String role;
        private String id;
        private String parentMessageId;
        private String text;
        private Detail detail;

        public String getText() {
            return text;
        }

        public class Detail {
            private String id;
            private String object;
            private String created;
            private String model;
            private List<Choice> choices;

            public class Choice {
                private Delta delta;
                private String index;
                private String finish_reason;

                public class Delta {
                    private String content;
                }
            }
        }
    }
}