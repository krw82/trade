package com.coin.trade.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaDto {

    private String symbol;
    private int rsiBet;
    private int mfiCg;
    private int maCross30;
    private int maCross180;
    private int candleDoji;
    private int checkDivergenceRsi14;
    private int checkDivergenceMfi14;
    private int candleHammer;
    private int candleInverseHammer;
    private int macdSignal;
    private boolean volumeAvg;
    private int calc;
    private String interval;
    private int coinAnalyze;

}
