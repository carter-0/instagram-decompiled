package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.2na  reason: invalid class name and case insensitive filesystem */
public final class C229512na implements Runnable {
    public final /* synthetic */ C229442nP A00;

    public C229512na(C229442nP r1) {
        this.A00 = r1;
    }

    public final void run() {
        C229442nP r0 = this.A00;
        r0.A0G.A06 += System.nanoTime() - r0.A01;
        if (C229442nP.A01() && !C59470Vi.A00()) {
            if (Systrace.A0E(1)) {
                0fS.A01("ScrollPerf.FrameEnded", 1990132090);
            }
            if (Systrace.A0E(1)) {
                0fS.A00(1653128677);
            }
        }
    }
}
