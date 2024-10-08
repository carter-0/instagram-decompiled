package X;

import android.view.Choreographer;

/* renamed from: X.8mF  reason: invalid class name and case insensitive filesystem */
public final class C364928mF {
    public static final C364928mF A01 = new C364928mF();
    public Choreographer A00 = Choreographer.getInstance();

    public final void A00(C364948mH r3) {
        Choreographer.FrameCallback frameCallback = r3.A00;
        if (frameCallback == null) {
            frameCallback = new ALk(r3);
            r3.A00 = frameCallback;
        }
        this.A00.postFrameCallback(frameCallback);
    }
}
