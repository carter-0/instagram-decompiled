package X;

import com.facebook.cameracore.mediapipeline.engine.AREngineController;

/* renamed from: X.AoJ  reason: case insensitive filesystem */
public final class C41097AoJ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C368618t1 A01;

    public C41097AoJ(C368618t1 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        AREngineController aREngineController = this.A01.A0C;
        if (aREngineController != null) {
            aREngineController.setCameraFacing(this.A00);
        }
    }
}
