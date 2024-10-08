package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.Asc  reason: case insensitive filesystem */
public final /* synthetic */ class C41355Asc implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C364348lH A01;
    public final /* synthetic */ C343187po A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C41355Asc(CaptureRequest.Builder builder, C364348lH r2, C343187po r3, boolean z) {
        this.A01 = r2;
        this.A00 = builder;
        this.A02 = r3;
        this.A03 = z;
    }

    public final Object call() {
        C364348lH r0 = this.A01;
        CaptureRequest.Builder builder = this.A00;
        C343187po r3 = this.A02;
        boolean z = this.A03;
        C340817ls r1 = r0.A02;
        r1.A00();
        C340827lt r02 = r1.A01;
        if (r02 != null) {
            r02.A01(builder, r3);
        }
        C340837lu r12 = r1.A02;
        if (r12 == null) {
            return null;
        }
        r12.A0B(z, true);
        return null;
    }
}
