package com.facebook.cameracore.ardelivery.modelcache.singlemodelcache;

import X.0dV;
import X.AnonymousClass7TG;
import X.C392419um;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.jni.HybridData;

public final class SingleModelCache {
    public static final C392419um Companion = new Object();
    public final HybridData mHybridData;
    public final ModelPathsHolder modelPathsHolderForLastSavedVersion;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid(int i, ARDFileCache aRDFileCache);

    public final native boolean addModelForVersionIfInCache(int i, String str, String str2);

    public final native ModelPathsHolder getModelPathsHolder(int i);

    public final native ModelPathsHolder getModelPathsHolderForLastSavedVersion();

    public final native void trimExceptLatestSavedVersion();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9um, java.lang.Object] */
    static {
        0dV.A0C("single-model-cache-native-android");
    }

    public SingleModelCache(VersionedCapability versionedCapability, ARDFileCache aRDFileCache) {
        AnonymousClass7TG.A1O(versionedCapability, aRDFileCache);
        this.mHybridData = initHybrid(versionedCapability.getXplatValue(), aRDFileCache);
    }

    public boolean addModelForVersionIfInCache(int i, String str, String str2, VersionedCapability versionedCapability) {
        AnonymousClass7TG.A1O(str, str2);
        return addModelForVersionIfInCache(i, str, str2);
    }

    public ModelPathsHolder getModelPathsHolder(VersionedCapability versionedCapability, int i) {
        return getModelPathsHolder(i);
    }

    public ModelPathsHolder getModelPathsHolderForLastSavedVersion(VersionedCapability versionedCapability) {
        return getModelPathsHolderForLastSavedVersion();
    }

    public void trimExceptLatestSavedVersion(VersionedCapability versionedCapability) {
        trimExceptLatestSavedVersion();
    }
}
