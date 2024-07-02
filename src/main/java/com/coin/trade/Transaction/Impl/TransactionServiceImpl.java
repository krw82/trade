package com.coin.trade.Transaction.Impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.coin.trade.Entity.AccountEntity;
import com.coin.trade.Entity.TransactionEntity;
import com.coin.trade.Transaction.TransactionRepository;
import com.coin.trade.Transaction.TransactionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Primary
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Override
    public TransactionEntity createTransaction(TransactionEntity transactionEntity) {
        return transactionRepository.save(transactionEntity);

    }

    @Override
    public TransactionEntity getTransactionById(Long id) {
        return transactionRepository.findById(id).orElseThrow();
    }

    @Override
    public List<TransactionEntity> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public List<TransactionEntity> getTransactionsByAccountId(Long accountId) {
        return transactionRepository.findByAccountId(accountId);
    }

    @Override
    public TransactionEntity updateTransaction(Long id, TransactionEntity transactionEntity) {
        TransactionEntity updateTransaction = transactionRepository.findById(id).orElseThrow();
        updateTransaction.setTransactionType(transactionEntity.getTransactionType());
        updateTransaction.setTransactionDate(transactionEntity.getTransactionDate());
        updateTransaction.setStatus(transactionEntity.getStatus());
        updateTransaction.setAccount(transactionEntity.getAccount());
        return transactionRepository.save(updateTransaction);

    }

    @Override
    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }

}
