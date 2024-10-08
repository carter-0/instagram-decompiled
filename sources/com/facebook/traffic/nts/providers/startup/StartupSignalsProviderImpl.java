package com.facebook.traffic.nts.providers.startup;

import X.0dV;
import X.0qQ;
import X.0sP;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class StartupSignalsProviderImpl implements StartupSignalsProviderAppLayer, StartupSignalsProviderXplat {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    public StartupSignalsProviderImpl(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0();

    public native void notifyStartupCompleted(int i);

    public final class Companion {
        private final HybridData initHybrid0() {
            return StartupSignalsProviderImpl.initHybrid0();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.traffic.nts.providers.startup.StartupSignalsProviderImpl$Companion, java.lang.Object] */
    static {
        0dV.A0C("startup_signals_provider");
    }

    public void addOnStartupCompletedCallback(0sP r3) {
        throw new RuntimeException("Native method not registered. Did you intend to add callback at the xplat layer?");
    }

    public void setUpcallImpl(StartupSignalsProviderAppLayerUpcalls startupSignalsProviderAppLayerUpcalls) {
        throw new RuntimeException("Native method not registered. Did you intend to setUpcallImpl at the xplat layer?");
    }

    public StartupSignalsProviderImpl() {
        this(initHybrid0());
    }
}
