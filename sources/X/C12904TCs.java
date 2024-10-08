package X;

import com.facebook.smartcapture.view.IdCaptureActivity;

/* renamed from: X.TCs  reason: case insensitive filesystem */
public final class C12904TCs implements Runnable {
    public final /* synthetic */ IdCaptureActivity A00;

    public C12904TCs(IdCaptureActivity idCaptureActivity) {
        this.A00 = idCaptureActivity;
    }

    public final void run() {
        C12166SoH soH = this.A00.A03;
        if (soH == null) {
            0qQ.A0F("presenter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            soH.A03();
        }
    }
}
