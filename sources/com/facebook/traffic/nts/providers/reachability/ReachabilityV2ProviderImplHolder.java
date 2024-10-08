package com.facebook.traffic.nts.providers.reachability;

import X.0dV;
import X.0qQ;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReachabilityV2ProviderImplHolder {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public ReachabilityV2ProviderImplHolder(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    public final native ReachabilityV2ProviderImpl getReachabilityV2ProviderImpl();

    public final native void setUpcallImpl(ReachabilityV2ProviderAppLayerUpcalls reachabilityV2ProviderAppLayerUpcalls);

    public final class Companion {
        private final HybridData initHybrid0() {
            return ReachabilityV2ProviderImplHolder.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderImplHolder$Companion, java.lang.Object] */
    static {
        0dV.A0C("reachability_provider");
    }

    public ReachabilityV2ProviderImplHolder() {
        this(initHybrid0());
    }
}
