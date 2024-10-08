package X;

import android.view.Choreographer;

/* renamed from: X.M5k  reason: case insensitive filesystem */
public final class C65947M5k implements Runnable {
    public final /* synthetic */ 1IX A00;

    public C65947M5k(1IX r1) {
        this.A00 = r1;
    }

    public final void run() {
        1IX r2 = this.A00;
        Choreographer choreographer = AnonymousClass131.choreographer;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            0qQ.A0A(choreographer);
            AnonymousClass131.choreographer = choreographer;
        }
        choreographer.postFrameCallback(new LWU(r2));
    }
}
