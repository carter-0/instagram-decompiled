package com.facebook.cameracore.ardelivery.xplat.effectmanager;

import X.0dV;
import X.0qQ;
import X.C313146fx;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.listener.xplatimpl.CancelableTokenJNI;
import com.facebook.cameracore.ardelivery.xplat.assetmanager.XplatAssetManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.cacheprovider.XplatFileCacheCreator;
import com.facebook.cameracore.ardelivery.xplat.connectioninfo.XplatDataConnectionManager;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.XplatModelMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetcher;
import com.facebook.cameracore.ardelivery.xplat.models.XplatAssetIdentifier;
import com.facebook.cameracore.ardelivery.xplat.models.XplatCapabilitySupportCheckCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatEffectLoggingInfo;
import com.facebook.cameracore.ardelivery.xplat.models.XplatEffectManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatEffectModel;
import com.facebook.cameracore.ardelivery.xplat.models.XplatModelManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import com.facebook.cameracore.ardelivery.xplat.models.XplatScriptingManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.scripting.XplatScriptingMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.sparkvision.SparkVisionMetadataDownloader;
import com.facebook.cameracore.logging.crashmetadatalogger.implementation.CameraARCrashMetadataLogger;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.tigon.TigonXplatService;
import java.util.List;
import java.util.Map;

public final class XplatEffectManager {
    public static final C313146fx Companion = new Object();
    public HybridData mHybridData;
    public CameraARCrashMetadataLogger modelCrashMetadataLogger;

    public XplatEffectManager(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str, XplatModelMetadataFetcher xplatModelMetadataFetcher, XplatRemoteModelVersionFetcher xplatRemoteModelVersionFetcher, XplatAsyncMetadataFetcher xplatAsyncMetadataFetcher, XplatScriptingMetadataFetcher xplatScriptingMetadataFetcher, SparkVisionMetadataDownloader sparkVisionMetadataDownloader, XplatDataConnectionManager xplatDataConnectionManager, int i, XplatFeaturesConfig xplatFeaturesConfig, TigonXplatService tigonXplatService, List list, XplatFileCacheCreator xplatFileCacheCreator, long j, Map map, boolean z, boolean z2) {
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = androidAsyncExecutorFactory;
        0qQ.A0B(androidAsyncExecutorFactory2, 1);
        String str2 = str;
        0qQ.A0B(str2, 2);
        XplatModelMetadataFetcher xplatModelMetadataFetcher2 = xplatModelMetadataFetcher;
        0qQ.A0B(xplatModelMetadataFetcher2, 3);
        XplatRemoteModelVersionFetcher xplatRemoteModelVersionFetcher2 = xplatRemoteModelVersionFetcher;
        0qQ.A0B(xplatRemoteModelVersionFetcher2, 4);
        XplatAsyncMetadataFetcher xplatAsyncMetadataFetcher2 = xplatAsyncMetadataFetcher;
        0qQ.A0B(xplatAsyncMetadataFetcher2, 5);
        XplatScriptingMetadataFetcher xplatScriptingMetadataFetcher2 = xplatScriptingMetadataFetcher;
        0qQ.A0B(xplatScriptingMetadataFetcher2, 6);
        SparkVisionMetadataDownloader sparkVisionMetadataDownloader2 = sparkVisionMetadataDownloader;
        0qQ.A0B(sparkVisionMetadataDownloader2, 7);
        XplatDataConnectionManager xplatDataConnectionManager2 = xplatDataConnectionManager;
        0qQ.A0B(xplatDataConnectionManager2, 8);
        XplatFeaturesConfig xplatFeaturesConfig2 = xplatFeaturesConfig;
        0qQ.A0B(xplatFeaturesConfig2, 10);
        TigonXplatService tigonXplatService2 = tigonXplatService;
        0qQ.A0B(tigonXplatService2, 11);
        List list2 = list;
        0qQ.A0B(list2, 12);
        Map map2 = map;
        0qQ.A0B(map2, 15);
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = new CameraARCrashMetadataLogger();
        this.modelCrashMetadataLogger = cameraARCrashMetadataLogger;
        long j2 = j;
        XplatFileCacheCreator xplatFileCacheCreator2 = xplatFileCacheCreator;
        Map map3 = map2;
        this.mHybridData = initHybrid(androidAsyncExecutorFactory2, str2, xplatModelMetadataFetcher2, xplatRemoteModelVersionFetcher2, xplatAsyncMetadataFetcher2, xplatScriptingMetadataFetcher2, sparkVisionMetadataDownloader2, xplatDataConnectionManager2, i, xplatFeaturesConfig2, tigonXplatService2, list2, xplatFileCacheCreator2, j2, map3, z, z2, cameraARCrashMetadataLogger);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str, XplatModelMetadataFetcher xplatModelMetadataFetcher, XplatRemoteModelVersionFetcher xplatRemoteModelVersionFetcher, XplatAsyncMetadataFetcher xplatAsyncMetadataFetcher, XplatScriptingMetadataFetcher xplatScriptingMetadataFetcher, SparkVisionMetadataDownloader sparkVisionMetadataDownloader, XplatDataConnectionManager xplatDataConnectionManager, int i, XplatFeaturesConfig xplatFeaturesConfig, TigonXplatService tigonXplatService, List list, XplatFileCacheCreator xplatFileCacheCreator, long j, Map map, boolean z, boolean z2, CameraARCrashMetadataLogger cameraARCrashMetadataLogger);

    public final native void clearAllCaches();

    public final native CancelableTokenJNI fetchAsyncAsset(XplatRemoteAsset xplatRemoteAsset, XplatAssetManagerCompletionCallback xplatAssetManagerCompletionCallback);

    public final native CancelableTokenJNI fetchAsyncAssetByFBID(String str, String str2, XplatAssetManagerCompletionCallback xplatAssetManagerCompletionCallback);

    public final native CancelableTokenJNI fetchAsyncAssetMetadata(String str, String str2, OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener);

    public final native CancelableTokenJNI fetchLatestModels(List list, XplatEffectLoggingInfo xplatEffectLoggingInfo, boolean z, XplatModelManagerCompletionCallback xplatModelManagerCompletionCallback);

    public final native CancelableTokenJNI fetchScriptingPackage(XplatEffectLoggingInfo xplatEffectLoggingInfo, XplatScriptingManagerCompletionCallback xplatScriptingManagerCompletionCallback);

    public final native long getCurrentSizeBytes(List list);

    public final native String getLocalAssetIfCached(XplatAssetIdentifier xplatAssetIdentifier, int i);

    public final native long getMaxSizeBytes(List list, long j);

    public final native long getUnusedSizeBytes(List list, long j);

    public final native void isCapabilitySupported(int i, XplatCapabilitySupportCheckCompletionCallback xplatCapabilitySupportCheckCompletionCallback);

    public final native boolean isEffectCached(XplatRemoteAsset xplatRemoteAsset, boolean z);

    public final native boolean isEffectModelCached(int i, int i2);

    public final CancelableTokenJNI loadEffect(XplatEffectModel xplatEffectModel, XplatEffectLoggingInfo xplatEffectLoggingInfo, XplatEffectManagerCompletionCallback xplatEffectManagerCompletionCallback) {
        0qQ.A0B(xplatEffectModel, 0);
        0qQ.A0B(xplatEffectLoggingInfo, 1);
        0qQ.A0B(xplatEffectManagerCompletionCallback, 2);
        this.modelCrashMetadataLogger.cleanupBreakpadData();
        return loadEffectXplat(xplatEffectModel, xplatEffectLoggingInfo, xplatEffectManagerCompletionCallback);
    }

    public final native CancelableTokenJNI loadEffectXplat(XplatEffectModel xplatEffectModel, XplatEffectLoggingInfo xplatEffectLoggingInfo, XplatEffectManagerCompletionCallback xplatEffectManagerCompletionCallback);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.6fx] */
    static {
        0dV.A0C("ard-android-effect-manager");
    }
}
