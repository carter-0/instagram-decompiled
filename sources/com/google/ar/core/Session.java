package com.google.ar.core;

import X.002;
import X.AnonymousClass000;
import X.C10274RpY;
import X.C21254XQz;
import X.C8920RFn;
import android.content.Context;
import com.google.ar.core.VpsAvailabilityFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Session {
    public final C10274RpY faceCache;
    public final long nativeSymbolTableHandle;
    public long nativeWrapperHandle;
    public SharedCamera sharedCamera;

    private native long[] nativeAcquireAllAnchors(long j);

    private native long nativeAcquireEarth(long j);

    private native int nativeCheckModuleAvailability(long j, int i);

    private native void nativeCloseSession(long j);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, Pose pose);

    public static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    public static native long nativeCreateSessionWrapperFromHandle(long j, long j2);

    private native int nativeEstimateFeatureMapQualityForHosting(long j, Pose pose);

    private native long nativeGetCameraConfig(long j);

    private native void nativeGetConfig(long j, long j2);

    private native int nativeGetPlaybackStatus(long j);

    private native void nativeGetRandomAccessStats(long j, long j2);

    private native int nativeGetRecordingStatus(long j);

    private native long[] nativeGetSupportedCameraConfigs(long j);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j, long j2);

    private native long nativeGetSymbolTable(long j);

    private native long nativeHostCloudAnchor(long j, long j2);

    private native long nativeHostCloudAnchorWithTtl(long j, long j2, int i);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native void nativeRequestModuleInstallDeferred(long j, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j, int[] iArr);

    private native long nativeResolveCloudAnchor(long j, String str);

    private native void nativeResume(long j);

    private native int nativeSetCameraConfig(long j, long j2);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetCameraTextureNames(long j, int[] iArr);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeSetPlaybackDataset(long j, String str);

    private native void nativeSetPlaybackDatasetUri(long j, String str);

    private native void nativeStartRecording(long j, long j2);

    private native void nativeStopRecording(long j);

    private native void nativeUpdate(long j, long j2);

    public native long[] nativeAcquireAllTrackables(long j, int i);

    public native long[] nativeCheckVpsAvailabilityAsync(long j, double d, double d2, VpsAvailabilityFuture.CallbackWrapper callbackWrapper);

    public native void nativeDestroySessionWrapper(long j);

    public native long nativeGetSessionNativeHandle(long j);

    public native boolean nativeIsDepthModeSupported(long j, int i);

    public native boolean nativeIsDepthModeSupportedPrivate(long j, int i);

    public native boolean nativeIsGeospatialModeSupported(long j, int i);

    public native long nativeReleaseSessionOwnership(long j);

    public void setDisplayGeometry(int i, int i2, int i3) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i, i2, i3);
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.A00);
    }

    public void finalize() {
        long j = this.nativeWrapperHandle;
        if (j != 0) {
            nativeDestroySessionWrapper(j);
            this.nativeWrapperHandle = 0;
        }
    }

    public Config getConfig() {
        Config config = new Config(this);
        nativeGetConfig(this.nativeWrapperHandle, config.A00);
        return config;
    }

    public List getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        ArrayList arrayList = new ArrayList(r5);
        for (long cameraConfig : nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.A00)) {
            arrayList.add(new CameraConfig(this, cameraConfig));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void resume() {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.A00);
    }

    public void setCameraTextureName(int i) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i);
    }

    public Frame update() {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.A00);
        return frame;
    }

    public Session(Context context, Set set) {
        this.faceCache = new C10274RpY();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[(set.size() + 1)];
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((C21254XQz) it.next()).A00;
            i++;
        }
        iArr[i] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(C21254XQz.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        ArImage.nativeLoadSymbols();
        ImageMetadata.nativeLoadSymbols();
    }

    public static void throwExceptionFromArStatus(String str, int i, String[] strArr, int[] iArr) {
        int i2;
        for (C8920RFn rFn : C8920RFn.values()) {
            if (rFn.A00 == i) {
                Class cls = rFn.A01;
                if (cls != null) {
                    if (strArr == null || iArr == null || (i2 = strArr.length) != iArr.length) {
                        i2 = 0;
                    }
                    String str2 = rFn.A02;
                    if (str2 == null) {
                        if (str == null) {
                            throw ((Throwable) cls.getConstructor(new Class[0]).newInstance(new Object[0]));
                        }
                    } else if (str == null) {
                        str = str2;
                    } else {
                        str = String.valueOf(str2).concat(String.valueOf(str));
                    }
                    Throwable th = (Throwable) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[(r8 + i2)];
                    int i3 = 0;
                    while (i3 < i2) {
                        stackTraceElementArr[i3] = new StackTraceElement("ARCore", AnonymousClass000.A00(1610), strArr[i3], iArr[i3]);
                        i3++;
                    }
                    for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                        stackTraceElementArr[i3] = stackTraceElement;
                        i3++;
                    }
                    th.setStackTrace(stackTraceElementArr);
                    throw th;
                }
                return;
            }
        }
        throw new RuntimeException(002.A0O("Unexpected error code: ", i));
    }

    public Session() {
        this.faceCache = new C10274RpY();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }
}
