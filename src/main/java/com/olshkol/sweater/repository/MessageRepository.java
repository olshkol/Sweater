package com.olshkol.sweater.repository;

import com.olshkol.sweater.domain.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
    Page<Message> findAll(Pageable pageable);
    Page<Message> findByTag(String tag, Pageable pageable);
}
