package ru.syn.quotes.models;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "\"Quotes\"")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "text", nullable = false)
    private String text;

    @Column(name = "\"quoteId\"", nullable = false)
    private Integer quoteId;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(final Integer quoteId) {
        this.quoteId = quoteId;
    }
}
