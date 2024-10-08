package com.facebook.tigon.observers;

import X.AnonymousClass00P;
import com.facebook.jni.HybridData;

public abstract class TigonObserver {
    public boolean disabled;
    public HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public abstract boolean getDisabled();

    public abstract HybridData getMHybridData();

    public abstract void setDisabled(boolean z);

    public abstract void setMHybridData(HybridData hybridData);

    public TigonObserver() {
        throw AnonymousClass00P.createAndThrow();
    }
}
