package com.instagram.service.http;

import X.0dV;
import X.0lg;
import X.0qQ;
import X.C13998To0;
import X.VGI;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;

public final class IGTigonAsyncHttpServiceHolder extends TigonServiceHolder {
    public static final VGI Companion = new Object();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IGTigonAsyncHttpServiceHolder(com.instagram.service.http.IGTigonAsyncHttpService r2) {
        /*
            r1 = this;
            r0 = 1
            X.0qQ.A0B(r2, r0)
            com.facebook.jni.HybridData r0 = initHybrid(r2)
            X.0qQ.A0A(r0)
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.http.IGTigonAsyncHttpServiceHolder.<init>(com.instagram.service.http.IGTigonAsyncHttpService):void");
    }

    public static final IGTigonAsyncHttpServiceHolder getInstance(0lg r3) {
        0qQ.A0B(r3, 0);
        return (IGTigonAsyncHttpServiceHolder) r3.A01(IGTigonAsyncHttpServiceHolder.class, new C13998To0(r3, 25));
    }

    public static final native HybridData initHybrid(IGTigonAsyncHttpService iGTigonAsyncHttpService);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.VGI] */
    static {
        0dV.A0C("igtigonasynchttpservice-jni");
    }
}
