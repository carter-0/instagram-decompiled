package com.facebook.rsys.rooms.gen;

import X.AnonymousClass00P;

public abstract class RoomsProxy {
    public abstract RoomsApi getApi();

    public abstract String getFunnelSessionId();

    public abstract void setApi(RoomsApi roomsApi);

    public abstract void startRoomCall(String str, Boolean bool, Boolean bool2);

    public RoomsProxy() {
        throw AnonymousClass00P.createAndThrow();
    }
}
