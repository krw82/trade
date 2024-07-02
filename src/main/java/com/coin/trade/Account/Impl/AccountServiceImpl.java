package com.coin.trade.Account.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coin.trade.Account.AccountRepository;
import com.coin.trade.Account.AccountService;
import com.coin.trade.Entity.AccountEntity;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountEntity createAccount(AccountEntity accountEntity) {
        return accountRepository.save(accountEntity);
    }

    @Override
    public AccountEntity getAccountById(Long id) {
        return accountRepository.findById(id).orElseThrow();
    }

    @Override
    public List<AccountEntity> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public AccountEntity updateAccount(Long id, AccountEntity accountEntity) {
        AccountEntity updateAccount = accountRepository.findById(id).orElseThrow();
        updateAccount.setAccountName(accountEntity.getAccountName());
        updateAccount.setAccountNumber(accountEntity.getAccountNumber());
        return accountRepository.save(updateAccount);
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

}
