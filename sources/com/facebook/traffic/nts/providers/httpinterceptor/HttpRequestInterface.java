package com.facebook.traffic.nts.providers.httpinterceptor;

public interface HttpRequestInterface {
    String getUrlOrThrow();

    void setHeader(String str, String str2);
}
