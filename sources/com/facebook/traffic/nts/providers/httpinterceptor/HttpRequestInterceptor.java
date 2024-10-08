package com.facebook.traffic.nts.providers.httpinterceptor;

public interface HttpRequestInterceptor {
    String getName();

    void onRequest(HttpRequestInterface httpRequestInterface);
}
