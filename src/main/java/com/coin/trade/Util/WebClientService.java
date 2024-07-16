package com.coin.trade.Util;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class WebClientService {

    private final WebClient.Builder webClientBuilder;

    public <T> Mono<T> ApiGet(String url, Class<T> clazz) {
        return webClientBuilder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(clazz);

    }

    public <T, R> Mono<R> ApiPost(String url, T requestBody, Class<R> clazz) {
        return webClientBuilder.build()
                .post()
                .uri(url)
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(clazz);
    }

    public <T> Mono<T> ApiDelete(String url, Class<T> clazz) {
        return webClientBuilder.build()
                .delete()
                .uri(url)
                .retrieve()
                .bodyToMono(clazz);
    }
}
