package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass00P;

public abstract class CowatchPlayerProxy {
    public abstract CowatchPlayerApi getApi();

    public abstract boolean isE2eeCowatchEnabled();

    public abstract void setApi(CowatchPlayerApi cowatchPlayerApi);

    public abstract boolean shouldSubscribeBeforeConnect();

    public CowatchPlayerProxy() {
        throw AnonymousClass00P.createAndThrow();
    }
}
