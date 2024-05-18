package com.reviewtest.repository;

import com.reviewtest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReponsitory extends JpaRepository<User,String> {
}
