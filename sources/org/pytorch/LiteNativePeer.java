package org.pytorch;

import X.0di;
import X.AnonymousClass8EJ;
import X.C348007xj;
import com.facebook.jni.HybridData;
import java.util.Map;

public class LiteNativePeer implements AnonymousClass8EJ {
    public final HybridData mHybridData;

    public LiteNativePeer(String str, Map map, C348007xj r5) {
        this.mHybridData = initHybrid(str, (Map) null, 1);
    }

    public static native HybridData initHybrid(String str, Map map, int i);

    public static native HybridData initHybridAndroidAsset(String str, Object obj, int i);

    public native IValue forward(IValue... iValueArr);

    public native IValue runMethod(String str, IValue... iValueArr);

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.0dj] */
    static {
        if (!0di.A02()) {
            0di.A00(new Object());
        }
        0di.A01("pytorch_jni_lite");
        try {
            0di.A01("torch-code-gen");
        } catch (Throwable unused) {
        }
    }
}
