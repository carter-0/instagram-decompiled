package X;

import android.view.Choreographer;

/* renamed from: X.ToA  reason: case insensitive filesystem */
public final class C14008ToA implements Choreographer.FrameCallback {
    public final /* synthetic */ C277344ux A00;
    public final /* synthetic */ Runnable A01;

    public C14008ToA(C277344ux r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void doFrame(long j) {
        C277344ux r0 = this.A00;
        r0.A04.postAtFrontOfQueue(this.A01);
    }
}
