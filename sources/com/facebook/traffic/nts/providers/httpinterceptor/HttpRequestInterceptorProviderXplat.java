package com.facebook.traffic.nts.providers.httpinterceptor;

public interface HttpRequestInterceptorProviderXplat {
    void addInterceptor(HttpRequestInterceptor httpRequestInterceptor);

    void onRequestXplat(HttpRequestInterface httpRequestInterface);
}
