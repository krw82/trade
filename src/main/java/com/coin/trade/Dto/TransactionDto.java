package com.coin.trade.Dto;

import java.time.LocalDateTime;
import com.coin.trade.Enum.TransStatus;
import com.coin.trade.Enum.TransType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDto {

    private Long id;
    private Long accountId;
    private TransType transactionType;
    private LocalDateTime transactionDate;
    private TransStatus status;

}
