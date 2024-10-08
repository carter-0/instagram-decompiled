package X;

import android.view.Choreographer;

/* renamed from: X.TyC  reason: case insensitive filesystem */
public final class C14547TyC implements Runnable {
    public final /* synthetic */ AnonymousClass6QX A00;

    public C14547TyC(AnonymousClass6QX r1) {
        this.A00 = r1;
    }

    public final void run() {
        Choreographer.getInstance().postFrameCallback(this.A00.A02);
    }
}
