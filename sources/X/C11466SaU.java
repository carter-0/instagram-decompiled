package X;

import android.view.Choreographer;

/* renamed from: X.SaU  reason: case insensitive filesystem */
public final /* synthetic */ class C11466SaU implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable A00;

    public /* synthetic */ C11466SaU(Runnable runnable) {
        this.A00 = runnable;
    }

    public final void doFrame(long j) {
        this.A00.run();
    }
}
