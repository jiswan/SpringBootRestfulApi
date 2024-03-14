package com.bankname.banknameweb.service;

import com.bankname.banknameweb.entity.Account;
import com.bankname.banknameweb.entity.User;

public interface AccountService {


    Account createAccount(User savedUser);
}
