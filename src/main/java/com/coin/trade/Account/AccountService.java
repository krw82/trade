package com.coin.trade.Account;

import java.util.List;

import com.coin.trade.Entity.AccountEntity;

public interface AccountService {
    AccountEntity createAccount(AccountEntity accountEntity);

    AccountEntity getAccountById(Long id);

    List<AccountEntity> getAllAccounts();

    AccountEntity updateAccount(Long id, AccountEntity accountEntity);

    void deleteAccount(Long id);

}
