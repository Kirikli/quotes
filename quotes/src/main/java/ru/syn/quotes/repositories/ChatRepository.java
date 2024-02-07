package ru.syn.quotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.syn.quotes.models.Chat;
import ru.syn.quotes.models.Quote;

import java.util.Optional;

public interface ChatRepository extends JpaRepository<Chat,Long> {
    Optional<Chat> findByChatIdEquals(Long chatId);




}
