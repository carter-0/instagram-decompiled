package com.facebook.ale.p003native;

import X.0qQ;
import X.X0J;

/* renamed from: com.facebook.ale.native.AvatarLiveEditingNetworkInterface  reason: invalid package */
public final class AvatarLiveEditingNetworkInterface {
    public final X0J avatarLiveEditingNetworkInterface;

    public AvatarLiveEditingNetworkInterface(X0J x0j) {
        0qQ.A0B(x0j, 1);
        this.avatarLiveEditingNetworkInterface = x0j;
    }

    public final boolean makeCDNRequest(String str, ResponseCallback responseCallback) {
        0qQ.A0B(responseCallback, 1);
        throw new NullPointerException("makeCDNRequest");
    }

    public final CancellationToken makeCancellableCDNRequest(String str, ResponseCallback responseCallback) {
        0qQ.A0B(responseCallback, 1);
        throw new NullPointerException("makeCancellableCDNRequest");
    }

    public final boolean makeGraphQLRequest(String str, String str2, ResponseCallback responseCallback) {
        0qQ.A0B(responseCallback, 2);
        throw new NullPointerException("makeGraphQLRequest");
    }
}
