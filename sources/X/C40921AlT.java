package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;

/* renamed from: X.AlT  reason: case insensitive filesystem */
public final class C40921AlT implements Runnable {
    public final /* synthetic */ C368618t1 A00;

    public C40921AlT(C368618t1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C368618t1 r2 = this.A00;
        AREngineController aREngineController = r2.A0C;
        if (aREngineController != null) {
            aREngineController.releaseGl();
        }
        C368618t1.A00(r2);
        r2.A0C = null;
        EffectServiceHost effectServiceHost = r2.A0a;
        if (effectServiceHost != null) {
            effectServiceHost.destroy();
        }
        r2.A0a = null;
        C40101ARn aRn = r2.A0D;
        if (aRn != null) {
            aRn.A00();
        }
        C40101ARn aRn2 = r2.A0D;
        if (aRn2 != null) {
            aRn2.A00 = null;
        }
        C40106ARt aRt = r2.A0E;
        if (aRt != null) {
            aRt.A00 = null;
            aRt.A01.clear();
        }
        Slx slx = r2.A0F;
        if (slx != null) {
            slx.A00 = null;
        }
        r2.A0I = null;
        r2.A0B = null;
        r2.A0F = null;
        r2.A0D = null;
        r2.A0E = null;
        r2.A0K = AnonymousClass05K.A00;
    }
}
