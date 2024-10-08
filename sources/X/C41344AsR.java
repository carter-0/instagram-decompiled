package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.AsR  reason: case insensitive filesystem */
public final class C41344AsR implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C340827lt A01;
    public final /* synthetic */ C343187po A02;

    public C41344AsR(CaptureRequest.Builder builder, C340827lt r2, C343187po r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = builder;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C340827lt r2 = this.A01;
        r2.A0A.A00("Cannot schedule reset focus task, not prepared");
        C343157pl r0 = r2.A03;
        r0.getClass();
        if (!r0.A00.isConnected() || r2.A0E) {
            return null;
        }
        this.A02.A05 = new C3724490w(this);
        return null;
    }
}
