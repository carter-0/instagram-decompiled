package X;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;

public final class AS3 implements TouchGesturesListener$HitTestCallback {
    public final /* synthetic */ C372038zZ A00;

    public AS3(C372038zZ r1) {
        this.A00 = r1;
    }

    public final void hitTestResult(long j, boolean z) {
        this.A00.A0F.post(new C41110AoW(this, j, z));
    }
}
