package com.coin.trade.upbit;

import com.coin.trade.tradeService;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class tradeServiceImpl implements tradeService {

    private final upbitApi upbitApi;

    private final String SERVER_URL = "https://api.upbit.com";

    @Override
    public String getOrdersChance(String market) {
        // https://api.upbit.com/v1/orders/chance
        // TODO Auto-generated method stub
        try {
            HashMap<String, String> params = new HashMap();
            params.put("market", market);
            HttpPost post = new HttpPost(SERVER_URL + "/v1/orders/chance?" + queryString);
            return upbitApi.requestUpbit(params, post);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public String getOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrder'");
    }

    @Override
    public String getOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrders'");
    }

    @Override
    public String deleteOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteOrder'");
    }

    @Override
    public String postOrders() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postOrders'");
    }

    @Override
    public void insertOrderLog() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertOrderLog'");
    }

}
