package com.coin.trade;

public interface tradeService {
    public String getOrdersChance(String market);

    public String getOrder();

    public String getOrders();

    public String deleteOrder();

    public String postOrders();

    public void insertOrderLog();
}
