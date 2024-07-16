package com.coin.trade.trade.Impl;

import org.springframework.stereotype.Service;

import com.coin.trade.Dto.TransactionDto;
import com.coin.trade.Util.WebClientService;
import com.coin.trade.trade.TradeService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProxyMarcket implements TradeService {

    private final WebClientService webClientService;

    String MARKET_URL = "127.0.0.1/proxyMarcket";

    @Override
    public boolean getOrdersChance(String symbol) {
        return true;
    }

    @Override
    public String getOrder(Long id, String key) {
        return webClientService.ApiGet(MARKET_URL + "/getOrder/" + id, String.class).block();
    }

    @Override
    public String getOrders(String key) {
        return webClientService.ApiGet(MARKET_URL + "/getOrders", String.class).block();
    }

    @Override
    public String deleteOrder(Long id, String key) {
        return webClientService.ApiDelete(MARKET_URL + "/deleteOrder/" + id, String.class).block();
    }

    @Override
    public String postOrders(TransactionDto dto, String key) {
        return webClientService.ApiPost(MARKET_URL + "/deleteOrder", dto, String.class).block();
    }

}
