package com.bankname.banknameweb.repository;

import com.bankname.banknameweb.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
