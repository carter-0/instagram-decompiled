package X;

import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8mC  reason: invalid class name and case insensitive filesystem */
public final class C364898mC {
    public static final long A05 = (TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS) / 30);
    public long A00;
    public C364948mH A01;
    public final C364928mF A02 = C364928mF.A01;
    public volatile boolean A03 = false;
    public volatile boolean A04 = false;

    public final void A00() {
        this.A04 = true;
        C364928mF r2 = this.A02;
        C364948mH r0 = this.A01;
        Choreographer.FrameCallback frameCallback = r0.A00;
        if (frameCallback == null) {
            frameCallback = new ALk(r0);
            r0.A00 = frameCallback;
        }
        r2.A00.removeFrameCallback(frameCallback);
    }

    public C364898mC(C364918mE r2) {
        this.A01 = new C364938mG(r2, this);
    }
}
