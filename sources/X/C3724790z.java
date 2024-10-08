package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.90z  reason: invalid class name and case insensitive filesystem */
public final class C3724790z implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C340827lt A01;
    public final /* synthetic */ C343187po A02;

    public C3724790z(CaptureRequest.Builder builder, C340827lt r2, C343187po r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = builder;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C340827lt r3 = this.A01;
        r3.A0A.A00("Cannot schedule reset focus task, not prepared");
        C343157pl r0 = r3.A03;
        r0.getClass();
        if (r0.A00.isConnected() && !r3.A0E && r3.A0D) {
            r3.A0C = false;
            r3.A00();
            r3.A05(AnonymousClass05K.A01, (float[]) null);
            C343187po r1 = this.A02;
            r1.A06 = null;
            r1.A05 = null;
            try {
                r3.A01(this.A00, r1);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
