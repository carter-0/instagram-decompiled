package com.facebook.models;

import X.0dV;
import com.facebook.jni.HybridData;
import java.util.List;

public class ModelMetadata {
    public final HybridData mHybridData;

    private native List getAllAssetMetadatasNative();

    private native ModelAssetMetadata getAssetMetadataNative(String str);

    private native String getAssetNative(String str);

    private native String getPropertyNative(String str);

    public native long getVersion();

    static {
        0dV.A0C("models-common");
    }

    public ModelMetadata(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public ModelAssetMetadata getAssetMetadata(String str) {
        return getAssetMetadataNative(str);
    }
}
