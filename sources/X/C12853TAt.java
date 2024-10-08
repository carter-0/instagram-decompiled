package X;

import java.util.Timer;

/* renamed from: X.TAt  reason: case insensitive filesystem */
public final class C12853TAt implements Runnable {
    public final /* synthetic */ C11039S6r A00;

    public C12853TAt(C11039S6r s6r) {
        this.A00 = s6r;
    }

    public final void run() {
        C11039S6r s6r = this.A00;
        Timer timer = s6r.A00;
        if (timer != null) {
            timer.cancel();
        }
        s6r.A00 = null;
    }
}
