package com.facebook.react.bridge;

import X.SBO;
import com.facebook.jni.HybridData;

public class CxxModuleWrapperBase implements NativeModule {
    public HybridData mHybridData;

    public boolean canOverrideExistingModule() {
        return false;
    }

    public native String getName();

    public void initialize() {
    }

    public /* synthetic */ void onCatalystInstanceDestroy() {
    }

    public void invalidate() {
        this.mHybridData.resetNative();
    }

    public void resetModule(HybridData hybridData) {
        HybridData hybridData2 = this.mHybridData;
        if (hybridData != hybridData2) {
            hybridData2.resetNative();
            this.mHybridData = hybridData;
        }
    }

    static {
        SBO.A00();
    }

    public CxxModuleWrapperBase(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
