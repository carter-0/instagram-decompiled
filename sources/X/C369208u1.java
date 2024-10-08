package X;

import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.8u1  reason: invalid class name and case insensitive filesystem */
public final class C369208u1 implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C340787lp A01;
    public final /* synthetic */ C343187po A02;

    public C369208u1(CaptureRequest.Builder builder, C340787lp r2, C343187po r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = builder;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C343297pz r6;
        C340787lp r1 = this.A01;
        C340837lu r0 = r1.A02;
        if (r0 == null || !r0.A0S || (r6 = r1.A02.A09) == null) {
            return this.A02;
        }
        CaptureRequest.Builder builder = this.A00;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        builder.set(key, 0);
        CaptureRequest build = builder.build();
        C343187po r3 = this.A02;
        r6.AGa(build, (Handler) null, r3);
        builder.set(key, 1);
        r6.AGa(builder.build(), (Handler) null, r3);
        builder.set(key, 0);
        r6.Eia(builder.build(), (Handler) null, r3);
        return r3;
    }
}
