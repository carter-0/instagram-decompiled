package org.pytorch.executorch;

import X.0di;
import com.facebook.jni.HybridData;
import java.util.Map;

public class NativePeer {
    public final HybridData mHybridData;

    public NativePeer(String str, Map map, int i) {
        this.mHybridData = initHybrid(str, (Map) null, i);
    }

    public static native HybridData initHybrid(String str, Map map, int i);

    public native EValue[] execute(String str, EValue... eValueArr);

    public native EValue[] forward(EValue... eValueArr);

    public native int loadMethod(String str);

    static {
        0di.A01("executorch");
    }
}
