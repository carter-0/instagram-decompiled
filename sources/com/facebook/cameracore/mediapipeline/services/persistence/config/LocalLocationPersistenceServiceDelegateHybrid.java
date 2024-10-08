package com.facebook.cameracore.mediapipeline.services.persistence.config;

import X.0dV;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateHybrid;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;

public class LocalLocationPersistenceServiceDelegateHybrid extends PersistenceServiceDelegateHybrid {
    private native HybridData initHybrid(String str, ARDFileCache aRDFileCache, ARDFileCache aRDFileCache2, AndroidAsyncExecutorFactory androidAsyncExecutorFactory);

    static {
        0dV.A0C("arpersistenceserviceconfig");
    }

    public LocalLocationPersistenceServiceDelegateHybrid(String str, ARDFileCache aRDFileCache, ARDFileCache aRDFileCache2, AndroidAsyncExecutorFactory androidAsyncExecutorFactory) {
        this.mHybridData = initHybrid(str, aRDFileCache, aRDFileCache2, androidAsyncExecutorFactory);
    }
}
