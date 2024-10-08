package X;

import android.view.Choreographer;

/* renamed from: X.Tpc  reason: case insensitive filesystem */
public final class C14086Tpc {
    public static final C14086Tpc A01 = new C14086Tpc();
    public Choreographer A00 = Choreographer.getInstance();

    public final void A00(C330607Nm r3) {
        Choreographer.FrameCallback frameCallback = r3.A00;
        if (frameCallback == null) {
            frameCallback = new W81(r3, 2);
            r3.A00 = frameCallback;
        }
        this.A00.postFrameCallback(frameCallback);
    }

    public final void A01(C330607Nm r3) {
        Choreographer.FrameCallback frameCallback = r3.A00;
        if (frameCallback == null) {
            frameCallback = new W81(r3, 2);
            r3.A00 = frameCallback;
        }
        this.A00.removeFrameCallback(frameCallback);
    }
}
