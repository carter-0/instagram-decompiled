package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;

/* renamed from: X.AlV  reason: case insensitive filesystem */
public final class C40923AlV implements Runnable {
    public final /* synthetic */ C368618t1 A00;

    public C40923AlV(C368618t1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C368618t1 r1 = this.A00;
        EffectServiceHost effectServiceHost = r1.A0a;
        if (effectServiceHost != null) {
            effectServiceHost.stopEffect();
        }
        EffectServiceHost effectServiceHost2 = r1.A0a;
        if (effectServiceHost2 != null) {
            effectServiceHost2.cleanupServices();
        }
        AREngineController aREngineController = r1.A0C;
        if (aREngineController != null) {
            aREngineController.onEffectStopped();
        }
        r1.A0S.clear();
        r1.A0K = AnonymousClass05K.A01;
    }
}
