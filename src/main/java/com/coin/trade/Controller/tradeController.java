package com.coin.trade.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coin.trade.tradeService;
import lombok.RequiredArgsConstructor;

@RestController

@RequiredArgsConstructor
public class tradeController {

    private final tradeService tradeService;

    @GetMapping("/")
    public String test() {
        System.out.println("2");
        return tradeService.getOrdersChance("KRW-BTC");
    }

}
