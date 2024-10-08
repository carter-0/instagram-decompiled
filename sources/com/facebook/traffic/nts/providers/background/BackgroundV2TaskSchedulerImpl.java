package com.facebook.traffic.nts.providers.background;

import X.0dV;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C62320sa;
import com.facebook.jni.HybridData;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BackgroundV2TaskSchedulerImpl implements BackgroundV2TaskSchedulerAppLayer, BackgroundV2TaskSchedulerXplat {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BackgroundV2TaskSchedulerImpl(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
        this(initHybrid0(backgroundV2TaskSchedulerConfig));
        0qQ.A0B(backgroundV2TaskSchedulerConfig, 1);
    }

    public static final native HybridData initHybrid0(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig);

    public native void executeReadyTasksAndReschedule();

    public final class Companion {
        private final HybridData initHybrid0(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
            return BackgroundV2TaskSchedulerImpl.initHybrid0(backgroundV2TaskSchedulerConfig);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerImpl$Companion, java.lang.Object] */
    static {
        0dV.A0C(AppStateModule.APP_STATE_BACKGROUND);
    }

    public void addBackgroundFunction(C62320sa r2, long j) {
        throw AnonymousClass7TE.A15("Native method not registered. Did you intend to addBackgroundFunction at the xplat layer?");
    }

    public void setUpcallImpl(BackgroundV2TaskSchedulerAppLayerUpcalls backgroundV2TaskSchedulerAppLayerUpcalls) {
        throw AnonymousClass7TE.A15("Native method not registered. Did you intend to set upcall impl through provider's holder?");
    }

    public BackgroundV2TaskSchedulerImpl(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }
}
