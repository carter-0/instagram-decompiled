package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces.ComponentSyncListener;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.hybridlogsink.HybridLogSink;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.8t5  reason: invalid class name and case insensitive filesystem */
public final class C368658t5 implements C368638t3 {
    public int A00 = -1;
    public GPUTimerImpl A01 = null;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C368598sv A06;
    public AREngineController A07;
    public final Context A08;
    public final AssetManager A09;
    public final AndroidAsyncExecutorFactory A0A;
    public final AndroidAsyncExecutorFactory A0B;
    public final C368578ss A0C;
    public volatile EffectServiceHost A0D;

    public static synchronized AREngineController A00(C368658t5 r5) {
        AREngineController aREngineController;
        synchronized (r5) {
            aREngineController = r5.A07;
            if (aREngineController == null) {
                aREngineController = new AREngineController(r5.A09, r5.A0A, r5.A0B, r5.B0D().getEnginePluginConfigProvider());
                r5.A07 = aREngineController;
            }
        }
        return aREngineController;
    }

    public static synchronized void A01(C368658t5 r1) {
        synchronized (r1) {
            if (r1.A0D != null) {
                r1.A0D.destroy();
                r1.A0D = null;
            }
        }
    }

    public final synchronized void AHJ() {
        if (this.A0D != null) {
            this.A0D.cleanupServices();
        }
    }

    public final synchronized void EF9() {
        synchronized (this) {
            A00(this).setupServiceHost(B0D());
            AREngineController A002 = A00(this);
            C368578ss r3 = this.A0C;
            if (A002.renderSessionInit(r3.A04, r3.A01, 0, this.A01, (HybridLogSink) null, false)) {
                A002.updatePerSessionDebugConfiguration(r3.A00, false, r3.A02, r3.A03);
            }
        }
    }

    public final synchronized void EFB() {
        A00(this).releaseGl();
        A01(this);
    }

    public final void EUo(AsyncAssetFetcher asyncAssetFetcher, ProductFeatureConfig productFeatureConfig, C312596el r19, ComponentSyncListener componentSyncListener, C368798tL r21, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z) {
        AsyncAssetFetcher asyncAssetFetcher2 = asyncAssetFetcher;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        List list2 = list;
        A00(this).setEffect(str7, str8, str9, str10, str11, r19.A00, str12, true, asyncAssetFetcher2.getAsyncAssets(), list2, productFeatureConfig, asyncAssetFetcher2, (ComponentSyncListener) null, r21.A00.A00);
        A00(this).updatePerEffectDebugConfiguration(false, false, false, false);
    }

    public final synchronized void EyA() {
        if (this.A0D != null) {
            this.A0D.stopEffect();
            this.A0D.cleanupServices();
        }
        AREngineController aREngineController = this.A07;
        if (aREngineController != null) {
            aREngineController.onEffectStopped();
        }
    }

    public final synchronized boolean APt(C368798tL r20, Integer num, float[] fArr, float[] fArr2, float[] fArr3, long j, long j2, boolean z) {
        int i;
        boolean doFrame;
        synchronized (this) {
            GPUTimerImpl gPUTimerImpl = this.A01;
            if (gPUTimerImpl != null) {
                gPUTimerImpl.beginMarker(this.A00);
            }
            AREngineController A002 = A00(this);
            int i2 = this.A02;
            int i3 = this.A04;
            int i4 = this.A05;
            int i5 = this.A03;
            long j3 = j * 1000;
            C368798tL r1 = r20;
            int i6 = r1.A00.A00;
            int A003 = AAJ.A00(r1.A01);
            if (num.intValue() != 0) {
                i = 1;
            } else {
                i = 0;
            }
            doFrame = A002.doFrame(i2, i3, i4, i5, fArr, fArr2, fArr3, j3, j2, i6, A003, z, i);
            GPUTimerImpl gPUTimerImpl2 = this.A01;
            if (gPUTimerImpl2 != null) {
                gPUTimerImpl2.endMarker();
            }
        }
        return doFrame;
    }

    public final EffectServiceHost B0D() {
        if (this.A0D == null) {
            synchronized (this) {
                if (this.A0D == null) {
                    this.A0D = this.A06.AME(this.A08.getApplicationContext());
                }
            }
        }
        return this.A0D;
    }

    public final boolean CJk() {
        if (this.A0D != null) {
            return true;
        }
        return false;
    }

    public final void EQV(int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A03 = i4;
    }

    public C368658t5(Context context, C368598sv r3, C368578ss r4, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        this.A0C = r4;
        this.A08 = context;
        this.A09 = context.getResources().getAssets();
        this.A0A = new AndroidAsyncExecutorFactory(scheduledExecutorService);
        this.A0B = new AndroidAsyncExecutorFactory(scheduledExecutorService2);
        this.A06 = r3;
    }

    public final List AN1(C371698yt r5) {
        EffectServiceHost B0D = B0D();
        for (ServiceConfiguration destroy : B0D.mServiceConfigurations) {
            destroy.destroy();
        }
        B0D.mServiceConfigurations.clear();
        B0D.mServicesHostConfiguration = r5;
        B0D.mServiceConfigurations = B0D.mServiceConfigurationHybridBuilder.AEY(r5);
        for (ServiceModule createConfiguration : B0D.mServiceModules) {
            ServiceConfiguration createConfiguration2 = createConfiguration.createConfiguration(r5);
            if (createConfiguration2 != null) {
                B0D.mServiceConfigurations.add(createConfiguration2);
            }
        }
        return B0D.mServiceConfigurations;
    }

    public final AnalyticsLogger AbS() {
        return B0D().getAnalyticsLogger();
    }

    public final int B3h() {
        return A00(this).getFacesCount();
    }

    public final EffectManifest BOt() {
        return B0D().mEffectManifest;
    }

    public final void EFC(int i, int i2) {
        A00(this).resize(i, i2);
    }

    public final void EIk() {
        A00(this).resetCurrentEffect();
    }

    public final void EQO(int i) {
        A00(this).setCameraFacing(i);
    }

    public final void ErR(int i, int i2, int i3, int i4, boolean z) {
        A00(this).setupImageSourceFacet(i, i2, i3, i4, z);
    }

    public final void FKR(ASJ asj, int i, boolean z) {
        B0D().updateFrame(asj, i, z);
    }

    public final void finalize() {
        A01(this);
    }
}
