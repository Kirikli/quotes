package ru.syn.quotes.models;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Chats\"")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "\"chatId", nullable = false)
    private Long chatId;

    @Column(name = "\"lastId\"", nullable = false)
    private Integer lastId;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(final Long chatId) {
        this.chatId = chatId;
    }

    public Integer getLastId() {
        return lastId;
    }

    public void setLastId(final Integer lastId) {
        this.lastId = lastId;
    }
}
