package com.facebook.cvat.ctaudioeligibilitychecker;

import X.0dV;
import X.0qQ;
import X.C62979KpV;
import X.SKM;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.HashMap;

public final class CTAudioEligibilityChecker {
    public static final C62979KpV Companion = new Object();
    public final HybridData mHybridData;

    private final native HybridData initHybrid(HashMap hashMap, float f);

    private final native boolean nativeAnalyzeAudioEligibility(ByteBuffer byteBuffer, float f, int i, int i2);

    public final boolean analyzeAudioEligibility(String str) {
        0qQ.A0B(str, 0);
        ByteBuffer A02 = SKM.A02(str, 0, 0);
        if (A02.capacity() == 0) {
            return false;
        }
        int A01 = SKM.A01(str);
        return nativeAnalyzeAudioEligibility(A02, (float) SKM.A00(str), A01, (A02.capacity() / 2) / A01);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.KpV, java.lang.Object] */
    static {
        0dV.A0C("ctaudioeligibilitychecker-native");
    }

    public CTAudioEligibilityChecker(HashMap hashMap, float f) {
        this.mHybridData = initHybrid(hashMap, 0.3f);
    }
}
