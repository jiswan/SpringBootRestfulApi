package com.bankname.banknameweb.repository;

import com.bankname.banknameweb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
