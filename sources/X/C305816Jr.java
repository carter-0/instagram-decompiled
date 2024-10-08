package X;

import android.view.Choreographer;

/* renamed from: X.6Jr  reason: invalid class name and case insensitive filesystem */
public final class C305816Jr implements Runnable {
    public final /* synthetic */ AnonymousClass6g5 A00;

    public C305816Jr(AnonymousClass6g5 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass6g5 r2 = this.A00;
        C313206g3 r1 = r2.A09;
        Object obj = r2.A05;
        if (obj != null) {
            r1.DaO(obj);
            if (r2.A07) {
                C313236g7 r3 = r2.A0A;
                r3.A00.A02 = System.currentTimeMillis();
                Choreographer.getInstance().postFrameCallback(r3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
