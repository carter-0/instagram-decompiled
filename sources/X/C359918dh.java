package X;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8dh  reason: invalid class name and case insensitive filesystem */
public final class C359918dh extends C359928di {
    public final C359908dg A00;
    public final C359898df A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Handler, X.8de] */
    public C359918dh(C359808dW r3, C359908dg r4, C359898df r5) {
        super(r3, r4, new Handler(C359788dU.A01));
        this.A01 = r5;
        this.A00 = r4;
    }

    public static void A00(C359918dh r3) {
        if (r3.A02.compareAndSet(false, true)) {
            C359898df r32 = r3.A01;
            C359888de r2 = r32.A02;
            if (!r2.CYP()) {
                r2.E3G(new C359948dk(r32), "Emitter_onAttach");
            }
        }
    }
}
