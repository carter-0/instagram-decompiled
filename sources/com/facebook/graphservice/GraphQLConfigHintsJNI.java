package com.facebook.graphservice;

import X.0di;
import com.facebook.jni.HybridData;
import java.util.List;
import java.util.Map;

public abstract class GraphQLConfigHintsJNI {
    public static final GraphQLConfigHintsJNI $redex_init_class = null;
    public HybridData mHybridData;

    public static native HybridData initHybridData(int i, int i2, Map map, int i3, int i4, boolean z, String str, String str2, String str3, boolean z2, String[] strArr, int i5, boolean z3, boolean z4, boolean z5, boolean z6, Map map2, String str4, String str5, boolean z7, String str6, List list);

    static {
        0di.A01("graphservice-jni");
    }
}
