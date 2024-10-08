package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;

/* renamed from: X.AlR  reason: case insensitive filesystem */
public final class C40919AlR implements Runnable {
    public final /* synthetic */ C368618t1 A00;

    public C40919AlR(C368618t1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        EffectServiceHost effectServiceHost;
        C368618t1 r1 = this.A00;
        if (r1.A0a != null && (effectServiceHost = r1.A0a) != null) {
            effectServiceHost.cleanupServices();
        }
    }
}
