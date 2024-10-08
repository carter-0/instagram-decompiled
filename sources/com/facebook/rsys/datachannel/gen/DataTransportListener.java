package com.facebook.rsys.datachannel.gen;

import X.AnonymousClass00P;

public abstract class DataTransportListener {
    public abstract void onMessage(byte[] bArr, String str, Long l);

    public abstract void onReady();

    public DataTransportListener() {
        throw AnonymousClass00P.createAndThrow();
    }
}
