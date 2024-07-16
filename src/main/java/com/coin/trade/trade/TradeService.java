package com.coin.trade.trade;

import com.coin.trade.Dto.TransactionDto;

public interface TradeService {
    public boolean getOrdersChance(String symbol); // 주문 가능한지여부

    public String getOrder(Long id, String key); // 개별 주문 조회

    public String getOrders(String key); // 주문리스트 조회

    public String deleteOrder(Long id, String key); // 주문 취소

    public String postOrders(TransactionDto dto, String key); // 주문하기

}
