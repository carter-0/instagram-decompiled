package com.facebook.cameracore.ardelivery.effectasyncassetfetcher;

import X.AnonymousClass6i7;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;

public class CancelableLoadToken implements CancelableToken {
    public AnonymousClass6i7 mLoadToken;

    public boolean cancel() {
        AnonymousClass6i7 r0 = this.mLoadToken;
        if (r0 != null) {
            return r0.cancel();
        }
        return false;
    }

    public CancelableLoadToken(AnonymousClass6i7 r1) {
        this.mLoadToken = r1;
    }
}
