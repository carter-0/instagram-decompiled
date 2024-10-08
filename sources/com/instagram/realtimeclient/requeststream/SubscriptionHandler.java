package com.instagram.realtimeclient.requeststream;

import X.1Ef;
import X.C64041Cr;
import X.Y8P;

public class SubscriptionHandler {
    public final 1Ef mRequest;
    public final C64041Cr mStream;
    public final SubscribeExecutor mSubscribeExecutor;
    public final String mSubscriptionID;

    public SubscriptionHandler addStatusUpdateListener(Y8P y8p) {
        return this;
    }

    public void cancel() {
        this.mSubscribeExecutor.unsubscribe(this);
    }

    public 1Ef getRequest() {
        return this.mRequest;
    }

    public C64041Cr getStream() {
        return this.mStream;
    }

    public String getSubscriptionID() {
        return this.mSubscriptionID;
    }

    public SubscriptionHandler(1Ef r1, String str, C64041Cr r3, SubscribeExecutor subscribeExecutor) {
        this.mRequest = r1;
        this.mSubscriptionID = str;
        this.mStream = r3;
        this.mSubscribeExecutor = subscribeExecutor;
    }
}
