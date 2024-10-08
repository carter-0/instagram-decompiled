package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.basic;

import X.0dV;
import android.content.res.AssetManager;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;

public class NativeConfigFactory {
    public static native IgluConfigHolder create(AssetManager assetManager, boolean z);

    public static native IgluConfigHolder createFbAssetConfig(AssetManager assetManager, boolean z);

    public static native IgluConfigHolder createIgAssetConfig(AssetManager assetManager, boolean z);

    static {
        0dV.A0C("mediapipeline-iglufilter-impl-basic");
    }
}
