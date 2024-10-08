package com.facebook.traffic.nts.providers.fgbg;

import X.0dV;
import X.0qQ;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AppFgBgStateProviderImplHolder {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public AppFgBgStateProviderImplHolder(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    public final native AppFgBgStateProviderImpl getImpl();

    public final native void setUpcallImpl(AppFgBgStateProviderAppLayerUpcalls appFgBgStateProviderAppLayerUpcalls);

    public final class Companion {
        private final HybridData initHybrid0() {
            return AppFgBgStateProviderImplHolder.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.traffic.nts.providers.fgbg.AppFgBgStateProviderImplHolder$Companion, java.lang.Object] */
    static {
        0dV.A0C("fgbg_provider");
    }

    public AppFgBgStateProviderImplHolder() {
        this(initHybrid0());
    }
}
