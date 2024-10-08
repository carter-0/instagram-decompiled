package org.pytorch;

import X.0di;
import X.AnonymousClass8EJ;
import com.facebook.jni.HybridData;
import java.util.Map;

public abstract class NativePeer implements AnonymousClass8EJ {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(String str, Map map, int i);

    public static native HybridData initHybridAndroidAsset(String str, Object obj, int i);

    public native IValue forward(IValue... iValueArr);

    public native IValue runMethod(String str, IValue... iValueArr);

    static {
        0di.A01("pytorch_jni");
        try {
            0di.A01("torch-code-gen");
        } catch (Throwable unused) {
        }
    }
}
