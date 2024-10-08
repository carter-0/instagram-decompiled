package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.ADH;
import X.ASJ;
import X.AnonymousClass7TE;
import X.C312576ei;
import X.C344957sh;
import X.C371698yt;
import X.C390649rc;
import X.C41792B0w;
import X.TOO;
import android.content.Context;
import android.util.Pair;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public abstract class EffectServiceHost {
    public final C312576ei mArExperimentUtil;
    public EffectAttribution mAttribution;
    public final Context mContext;
    public boolean mDestroyed = false;
    public EffectManifest mEffectManifest = new EffectManifest();
    public final EffectServiceHostConfig mEffectServiceHostConfig;
    public HybridData mHybridData;
    public String mProductSessionId;
    public final C41792B0w mServiceConfigurationHybridBuilder;
    public List mServiceConfigurations = AnonymousClass7TE.A1C();
    public final List mServiceModules;
    public C371698yt mServicesHostConfiguration;

    public EffectServiceHost(Context context, EffectServiceHostConfig effectServiceHostConfig, C41792B0w b0w, Collection collection, String str, C312576ei r8) {
        this.mContext = context;
        this.mEffectServiceHostConfig = effectServiceHostConfig;
        this.mServiceConfigurationHybridBuilder = b0w;
        this.mServiceModules = AnonymousClass7TE.A1D(collection);
        this.mProductSessionId = null;
        this.mArExperimentUtil = r8;
    }

    private native void nativeSetCameraSensorRotation(int i);

    private native void nativeSetCurrentOptimizationMode(int i);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, byte[] bArr, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    public static ScheduledExecutorService newSingleBackgroundThreadScheduledExecutor(String str) {
        return Executors.newSingleThreadScheduledExecutor(new TOO(str, 0));
    }

    public native void cleanupServices();

    public synchronized void destroy() {
        if (!this.mDestroyed) {
            this.mHybridData.resetNative();
            for (ServiceConfiguration destroy : this.mServiceConfigurations) {
                destroy.destroy();
            }
            this.mServiceConfigurations.clear();
            for (ServiceModule serviceModule : this.mServiceModules) {
                serviceModule.mHybridData.resetNative();
            }
            this.mServiceModules.clear();
            this.mDestroyed = true;
        }
    }

    public abstract AnalyticsLogger getAnalyticsLogger();

    public abstract PluginConfigProvider getEnginePluginConfigProvider();

    public native void resetServices();

    public native void stopEffect();

    public void setCurrentOptimizationMode(C390649rc r2) {
        nativeSetCurrentOptimizationMode(r2.A00);
    }

    public void updateFrame(ASJ asj, int i, boolean z) {
        int length;
        int i2;
        int i3;
        int i4;
        int i5;
        ByteBuffer byteBuffer;
        ADH adh = (ADH) asj.get();
        int i6 = adh.A04;
        int i7 = adh.A02;
        C344957sh[] r3 = adh.A0C;
        Pair pair = adh.A08;
        ByteBuffer byteBuffer2 = null;
        float[] fArr = pair != null ? new float[]{AnonymousClass7TE.A04(pair.first), AnonymousClass7TE.A04(pair.second)} : null;
        byte[] bArr = adh.A0A;
        int i8 = i;
        boolean z2 = z;
        if (bArr != null) {
            nativeUpdateFrame(i6, i7, i6, 0, i6, 0, i6, 0, i8, z2, adh.A03, bArr, adh.A07, adh.A09, adh.A0B, fArr, adh.A00, (double) adh.A06, (double) adh.A05, asj.A00());
        } else if (r3 != null && (length = r3.length) > 0) {
            C344957sh r12 = r3[0];
            int i9 = r12.A01;
            int i10 = i6;
            if (i9 != 0) {
                i10 = i9;
            }
            int i11 = r12.A00;
            if (length > 1) {
                C344957sh r0 = r3[1];
                i2 = r0.A01;
                if (i2 == 0) {
                    i2 = i6;
                }
                i3 = r0.A00;
                if (length > 2) {
                    C344957sh r02 = r3[2];
                    i4 = r02.A01;
                    if (i4 == 0) {
                        i4 = i6;
                    }
                    i5 = r02.A00;
                }
                i4 = i6;
                i5 = 0;
            } else {
                i2 = i6;
                i3 = 0;
                i4 = i6;
                i5 = 0;
            }
            int i12 = adh.A03;
            ByteBuffer byteBuffer3 = r12.A02;
            if (length > 1) {
                byteBuffer = r3[1].A02;
                if (length > 2) {
                    byteBuffer2 = r3[2].A02;
                }
            } else {
                byteBuffer = null;
            }
            nativeUpdateFrame(i6, i7, i10, i11, i2, i3, i4, i5, i8, z2, i12, byteBuffer3, byteBuffer, byteBuffer2, adh.A07, adh.A09, adh.A0B, fArr, adh.A00, (double) adh.A06, (double) adh.A05, asj.A00());
        }
    }

    public void setAttribution(EffectAttribution effectAttribution) {
        this.mAttribution = effectAttribution;
    }

    public void setCameraSensorRotation(int i) {
        nativeSetCameraSensorRotation(i);
    }

    public void setManifest(EffectManifest effectManifest) {
        this.mEffectManifest = effectManifest;
    }
}
