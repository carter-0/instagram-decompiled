package X;

import android.os.RemoteException;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher;
import com.facebook.cameracore.common.exception.EffectsFrameworkException;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces.ComponentSyncListener;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ar3  reason: case insensitive filesystem */
public final class C41267Ar3 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C368618t1 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    public C41267Ar3(C368618t1 r1, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = str4;
        this.A08 = str5;
        this.A01 = i;
        this.A04 = str6;
        this.A0A = z;
        this.A09 = list;
        this.A00 = i2;
    }

    public final void run() {
        ArrayList arrayList;
        C368618t1 r2 = this.A02;
        Integer num = r2.A0K;
        Integer num2 = AnonymousClass05K.A01;
        if (num == num2) {
            try {
                AREngineController aREngineController = r2.A0C;
                if (aREngineController != null) {
                    String str = this.A05;
                    String str2 = this.A06;
                    String str3 = this.A07;
                    String str4 = this.A03;
                    String str5 = this.A08;
                    int i = this.A01;
                    String str6 = this.A04;
                    boolean z = this.A0A;
                    ArrayList arrayList2 = 0sn.A00;
                    C39768A8i a8i = r2.A0I;
                    if (a8i != null) {
                        arrayList = a8i.A00(this.A09);
                    } else {
                        arrayList = arrayList2;
                    }
                    aREngineController.setEffect(str, str2, str3, str4, str5, i, str6, z, arrayList2, arrayList, (ProductFeatureConfig) null, (AsyncAssetFetcher) null, (ComponentSyncListener) null, this.A00);
                }
                r2.A0K = AnonymousClass05K.A0C;
            } catch (EffectsFrameworkException e) {
                Class<C368618t1> cls = C368618t1.class;
                0KC.A05(cls, "setEffect() failed: ", e);
                EffectServiceHost effectServiceHost = r2.A0a;
                if (effectServiceHost != null) {
                    effectServiceHost.stopEffect();
                }
                EffectServiceHost effectServiceHost2 = r2.A0a;
                if (effectServiceHost2 != null) {
                    effectServiceHost2.cleanupServices();
                }
                AREngineController aREngineController2 = r2.A0C;
                if (aREngineController2 != null) {
                    aREngineController2.onEffectStopped();
                }
                r2.A0K = num2;
                try {
                    IAREngineServiceCallback iAREngineServiceCallback = r2.A0J;
                    if (iAREngineServiceCallback != null) {
                        iAREngineServiceCallback.Crr(e.getMessage());
                    }
                } catch (RemoteException e2) {
                    0KC.A05(cls, "Callback notifyException failed: ", e2);
                    r2.stopSelf();
                }
            }
        }
    }
}
