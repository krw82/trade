package com.coin.trade.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Ta")
public interface TaClient {
    @GetMapping("/")
    String selectNowCalc();

}
