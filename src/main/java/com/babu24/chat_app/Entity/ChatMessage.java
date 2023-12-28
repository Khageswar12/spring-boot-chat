package com.babu24.chat_app.Entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String  content;
    private String  sender ;
    private MessageType type;
}
