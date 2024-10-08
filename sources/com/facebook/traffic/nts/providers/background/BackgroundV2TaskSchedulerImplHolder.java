package com.facebook.traffic.nts.providers.background;

import X.0dV;
import X.0qQ;
import com.facebook.jni.HybridData;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BackgroundV2TaskSchedulerImplHolder {
    public static final Companion Companion = new Object();
    public final HybridData mHybridData;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BackgroundV2TaskSchedulerImplHolder(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
        this(initHybrid0(backgroundV2TaskSchedulerConfig));
        0qQ.A0B(backgroundV2TaskSchedulerConfig, 1);
    }

    public static final native HybridData initHybrid0(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig);

    public final native BackgroundV2TaskSchedulerImpl getImpl();

    public final native void setUpcallImpl(BackgroundV2TaskSchedulerAppLayerUpcalls backgroundV2TaskSchedulerAppLayerUpcalls);

    public final class Companion {
        private final HybridData initHybrid0(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
            return BackgroundV2TaskSchedulerImplHolder.initHybrid0(backgroundV2TaskSchedulerConfig);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerImplHolder$Companion, java.lang.Object] */
    static {
        0dV.A0C(AppStateModule.APP_STATE_BACKGROUND);
    }

    public BackgroundV2TaskSchedulerImplHolder(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }
}
