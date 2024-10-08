package com.facebook.cameracore.litecamera.mediapipeline.iglu.insights;

import X.0Aj;
import X.0dV;
import X.0qQ;
import X.27x;
import X.AnonymousClass283;
import X.AnonymousClass2AO;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C392529ux;
import com.facebook.jni.HybridData;

public final class GPUInsights {
    public static final C392529ux Companion = new Object();
    public AnonymousClass2AO gpuEventLogger;
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public final native void clearGPUError();

    public final native int getAllocatedTextureBytes();

    public final native int getAllocatedTextureCount();

    public final native String getGPUError();

    public final void logExistingEvents(String str) {
        0qQ.A0B(str, 0);
        String gPUError = getGPUError();
        27x r8 = this.gpuEventLogger;
        if (r8 != null) {
            27x r82 = r8;
            0qQ.A0B(gPUError, 0);
            0Aj A0e = AnonymousClass7TE.A0e(r82.A01, "ig_camera_iglu_gpu");
            if (A0e.isSampled()) {
                AnonymousClass283 r2 = r82.A04;
                String str2 = r2.A0L;
                if (str2 == null) {
                    str2 = "";
                }
                A0e.AAJ("camera_session_id", str2);
                AnonymousClass7TE.A1V(A0e, r2);
                AnonymousClass7TE.A1W(A0e, "event_type", 2);
                AnonymousClass7TH.A0U(A0e);
                AnonymousClass7TH.A0W(A0e, r82);
                A0e.A8M(r2.A0C, "surface");
                A0e.AAJ("gpu_error", gPUError);
                A0e.AAJ("gpu_style", "GLES");
                A0e.AAJ("gpu_usage", str);
                A0e.A9F("count", 1L);
                A0e.Cgf();
            }
        }
    }

    public final native String makeAndHoldATexture(int i, boolean z);

    public final native void triggerGPUError(int i);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9ux] */
    static {
        0dV.A0C("mediapipeline-iglufilter-insights");
    }

    public final void setGpuLogger(AnonymousClass2AO r1) {
        this.gpuEventLogger = r1;
    }
}
