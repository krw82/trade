package com.coin.trade.Transaction;

import java.util.List;

import com.coin.trade.Entity.TransactionEntity;

public interface TransactionService {
    TransactionEntity createTransaction(TransactionEntity transactionEntity);

    TransactionEntity getTransactionById(Long id);

    List<TransactionEntity> getAllTransactions();

    List<TransactionEntity> getTransactionsByAccountId(Long accountId);

    TransactionEntity updateTransaction(Long id, TransactionEntity transactionEntity);

    void deleteTransaction(Long id);
}