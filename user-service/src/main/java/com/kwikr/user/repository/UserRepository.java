package com.kwikr.user.repository;

import com.kwikr.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
