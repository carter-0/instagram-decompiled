package X;

import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.8kt  reason: invalid class name and case insensitive filesystem */
public final class C364118kt implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C340787lp A01;
    public final /* synthetic */ C364088kq A02;

    public C364118kt(CaptureRequest.Builder builder, C340787lp r2, C364088kq r3) {
        this.A01 = r2;
        this.A00 = builder;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C340837lu r0 = this.A01.A02;
        if (r0 != null) {
            C343297pz r3 = r0.A09;
            if (r3 != null) {
                CaptureRequest build = this.A00.build();
                C364088kq r1 = this.A02;
                r3.AGa(build, (Handler) null, r1);
                return r1;
            }
            throw new RuntimeException("Session closed while capturing photo.");
        }
        throw new RuntimeException("Preview closed while capturing photo.");
    }
}
