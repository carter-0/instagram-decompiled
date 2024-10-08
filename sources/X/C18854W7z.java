package X;

import android.view.Choreographer;

/* renamed from: X.W7z  reason: case insensitive filesystem */
public final class C18854W7z implements Choreographer.FrameCallback {
    public final /* synthetic */ C311166cF A00;

    public C18854W7z(C311166cF r1) {
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        C311166cF r3 = this.A00;
        try {
            Thread.sleep(r3.A02);
        } catch (Exception unused) {
            if (!r3.A01) {
                DbT.A1Q(0wj.A01, "OnScroll has been interrupted", 817895459);
                r3.A01 = true;
            }
        }
        if (r3.A00) {
            r3.A04.postFrameCallback(r3.A03);
        }
    }
}
