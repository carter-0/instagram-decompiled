package X;

import com.facebook.cameracore.mediapipeline.engine.AREngineController;

/* renamed from: X.AoK  reason: case insensitive filesystem */
public final class C41098AoK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C368618t1 A01;

    public C41098AoK(C368618t1 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        AREngineController aREngineController = this.A01.A0C;
        if (aREngineController != null) {
            aREngineController.setCameraSensorRotation(this.A00);
        }
    }
}
