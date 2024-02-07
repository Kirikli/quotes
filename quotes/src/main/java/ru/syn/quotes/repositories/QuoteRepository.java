package ru.syn.quotes.repositories;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.syn.quotes.models.Quote;

import java.util.Optional;

public interface QuoteRepository extends JpaRepository<Quote,Integer> {
    Optional<Quote> findByQuoteIdEquals(Integer quoteId);

}
