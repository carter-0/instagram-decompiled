package com.instagram.pando.livetree;

import X.0dV;
import X.0qQ;
import X.C44962Cnw;
import com.facebook.jni.HybridData;
import java.util.Set;

public final class SupportedFieldsJNI {
    public static final C44962Cnw Companion = new Object();
    public final Set fields;
    public final HybridData mHybridData;

    public SupportedFieldsJNI(Set set) {
        0qQ.A0B(set, 1);
        this.fields = set;
        this.mHybridData = initHybridData(set);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybridData(Set set);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Cnw, java.lang.Object] */
    static {
        0dV.A0C("live-tree-jni");
    }

    public final Set getFields() {
        return this.fields;
    }
}
