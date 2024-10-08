package X;

import com.facebook.cameracore.mediapipeline.engine.AREngineController;

/* renamed from: X.AlU  reason: case insensitive filesystem */
public final class C40922AlU implements Runnable {
    public final /* synthetic */ C368618t1 A00;

    public C40922AlU(C368618t1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AREngineController aREngineController = this.A00.A0C;
        if (aREngineController != null) {
            aREngineController.resetCurrentEffect();
        }
    }
}
