package com.facebook.realtime.requeststream.api;

public interface StreamOptions {
    String getRequestLogContext();

    long getRetryBackoffInterval();

    boolean shouldGenNewStreamIdPerRetry();
}
