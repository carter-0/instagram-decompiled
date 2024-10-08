package X;

import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.Asb  reason: case insensitive filesystem */
public final class C41354Asb implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C340827lt A01;
    public final /* synthetic */ C343187po A02;
    public final /* synthetic */ C343297pz A03;

    public C41354Asb(CaptureRequest.Builder builder, C340827lt r2, C343187po r3, C343297pz r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = builder;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        CaptureRequest.Builder builder;
        C343297pz r3 = this.A03;
        if (r3 == null || (builder = this.A00) == null) {
            return this.A02;
        }
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        CaptureRequest build = builder.build();
        C343187po r2 = this.A02;
        r3.AGa(build, (Handler) null, r2);
        return r2;
    }
}
