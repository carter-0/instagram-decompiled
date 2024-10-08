package com.instagram.debug.network;

import X.0lg;
import X.0qQ;
import X.1QS;
import X.1QU;
import X.1Qe;
import X.AnonymousClass1Cy;
import X.AnonymousClass1T9;
import X.AnonymousClass7TG;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class NetworkThrottleDebugServiceLayer implements AnonymousClass1Cy {
    public static final Companion Companion = new Object();
    public static final String TAG = "IgNetworkDebugDevTools";
    public final AnonymousClass1Cy delegate;
    public final 0lg session;

    public NetworkThrottleDebugServiceLayer(0lg r1, AnonymousClass1Cy r2) {
        AnonymousClass7TG.A1O(r1, r2);
        this.session = r1;
        this.delegate = r2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.4Cr, com.instagram.debug.network.NetworkThrottleDebugServiceLayer$startRequest$1] */
    public AnonymousClass1T9 startRequest(1QS r6, 1QU r7, 1Qe r8) {
        AnonymousClass7TG.A1T(r6, r7, r8);
        long sleepTimePerChunk = new DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1(this.session).getSleepTimePerChunk();
        if (sleepTimePerChunk > 0) {
            r8.A01(new NetworkThrottleDebugServiceLayer$startRequest$1(sleepTimePerChunk));
        }
        AnonymousClass1T9 startRequest = this.delegate.startRequest(r6, r7, r8);
        0qQ.A07(startRequest);
        return startRequest;
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
