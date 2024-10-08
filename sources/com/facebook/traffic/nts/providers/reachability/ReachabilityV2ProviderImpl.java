package com.facebook.traffic.nts.providers.reachability;

import X.0dV;
import X.0qQ;
import X.0sP;
import X.Pxd;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReachabilityV2ProviderImpl implements ReachabilityV2ProviderAppLayer, ReachabilityV2ProviderXplat {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public ReachabilityV2ProviderImpl(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    public native void updateConnectionType(int i);

    public final class Companion {
        private final HybridData initHybrid0() {
            return ReachabilityV2ProviderImpl.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderImpl$Companion] */
    static {
        0dV.A0C("reachability_provider");
    }

    public void addOnConnectionTypeChangedCallback(0sP r3) {
        throw new RuntimeException("Native method not registered. Did you intend to add callback at the xplat layer?");
    }

    public int getConnectionType() {
        throw new RuntimeException("Native method not registered. Did you intend to check connection type at the xplat layer?");
    }

    public void setUpcallImpl(ReachabilityV2ProviderAppLayerUpcalls reachabilityV2ProviderAppLayerUpcalls) {
        throw new RuntimeException(Pxd.A00(535));
    }

    public ReachabilityV2ProviderImpl() {
        this(initHybrid0());
    }
}
