package com.olshkol.sweater.repository;

import com.olshkol.sweater.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
