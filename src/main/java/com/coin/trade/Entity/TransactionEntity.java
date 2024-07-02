package com.coin.trade.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;

import com.coin.trade.Enum.TransStatus;
import com.coin.trade.Enum.TransType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TransactionEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long accountId;
    private TransType transactionType;
    private LocalDateTime transactionDate;
    private TransStatus status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", nullable = false, referencedColumnName = "id")
    private AccountEntity account;

}
