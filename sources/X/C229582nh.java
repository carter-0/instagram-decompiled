package X;

import android.view.Choreographer;

/* renamed from: X.2nh  reason: invalid class name and case insensitive filesystem */
public final class C229582nh implements Choreographer.FrameCallback {
    public final /* synthetic */ C229552ne A00;

    public C229582nh(C229552ne r1) {
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        C229552ne r2 = this.A00;
        C229552ne.A00(r2, r2.A00, j);
        if (r2.A01) {
            C229542nd r0 = r2.A05;
            r0.A00.postFrameCallback(r2.A04);
        }
    }
}
