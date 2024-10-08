package X;

import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces.ComponentSyncListener;
import java.util.List;

/* renamed from: X.8t3  reason: invalid class name and case insensitive filesystem */
public interface C368638t3 {
    void AHJ();

    List AN1(C371698yt r1);

    boolean APt(C368798tL r1, Integer num, float[] fArr, float[] fArr2, float[] fArr3, long j, long j2, boolean z);

    AnalyticsLogger AbS();

    EffectServiceHost B0D();

    int B3h();

    EffectManifest BOt();

    boolean CJk();

    void EF9();

    void EFB();

    void EFC(int i, int i2);

    void EIk();

    void EQO(int i);

    void EQV(int i, int i2, int i3, int i4);

    void EUo(AsyncAssetFetcher asyncAssetFetcher, ProductFeatureConfig productFeatureConfig, C312596el r3, ComponentSyncListener componentSyncListener, C368798tL r5, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z);

    void ErR(int i, int i2, int i3, int i4, boolean z);

    void EyA();

    void FKR(ASJ asj, int i, boolean z);
}
