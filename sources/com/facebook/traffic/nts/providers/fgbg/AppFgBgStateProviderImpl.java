package com.facebook.traffic.nts.providers.fgbg;

import X.0dV;
import X.0qQ;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AppFgBgStateProviderImpl {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public AppFgBgStateProviderImpl(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    public final class Companion {
        private final HybridData initHybrid0() {
            return AppFgBgStateProviderImpl.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.traffic.nts.providers.fgbg.AppFgBgStateProviderImpl$Companion] */
    static {
        0dV.A0C("fgbg_provider");
    }

    public AppFgBgStateProviderImpl() {
        this(initHybrid0());
    }
}
