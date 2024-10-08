package com.facebook.cameracore.ardelivery.modelcache.versionedmodelcache;

import X.0dV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VersionedModelCache {
    public final HybridData mHybridData;

    private native boolean addModelForVersionIfInCache(int i, int i2, String str, String str2);

    private native ModelPathsHolder getModelPathsHolder(int i, int i2);

    public static native HybridData initHybrid(ARDFileCache aRDFileCache, List list);

    public native ModelPathsHolder getModelPathsHolderForLastSavedVersion(int i);

    public native void trimExceptLatestSavedVersion(int i);

    static {
        0dV.A0C("versioned-model-cache-native-android");
    }

    public VersionedModelCache(ARDFileCache aRDFileCache, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass7TF.A1M(A1C, ((VersionedCapability) it.next()).getXplatValue());
        }
        this.mHybridData = initHybrid(aRDFileCache, A1C);
    }

    public boolean addModelForVersionIfInCache(int i, String str, String str2, VersionedCapability versionedCapability) {
        versionedCapability.getClass();
        int xplatValue = versionedCapability.getXplatValue();
        Integer.valueOf(xplatValue).getClass();
        return addModelForVersionIfInCache(xplatValue, i, str, str2);
    }

    public ModelPathsHolder getModelPathsHolder(VersionedCapability versionedCapability, int i) {
        versionedCapability.getClass();
        return getModelPathsHolder(versionedCapability.getXplatValue(), i);
    }

    public ModelPathsHolder getModelPathsHolderForLastSavedVersion(VersionedCapability versionedCapability) {
        return getModelPathsHolderForLastSavedVersion(versionedCapability.getXplatValue());
    }

    public void trimExceptLatestSavedVersion(VersionedCapability versionedCapability) {
        versionedCapability.getClass();
        trimExceptLatestSavedVersion(versionedCapability.getXplatValue());
    }
}
