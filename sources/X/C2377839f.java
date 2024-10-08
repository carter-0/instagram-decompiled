package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.39f  reason: invalid class name and case insensitive filesystem */
public final class C2377839f {
    public final long A00;
    public final AnonymousClass38L A01;
    public final AnonymousClass39Z A02;
    public final Object A03 = new Object();
    public final Map A04 = new LinkedHashMap();

    public C2377839f(AnonymousClass38L r4, AnonymousClass39Z r5) {
        0qQ.A0B(r4, 1);
        long millis = TimeUnit.MINUTES.toMillis(90);
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = millis;
    }

    public final void A00(C2805352f r4) {
        Runnable runnable;
        0qQ.A0B(r4, 0);
        synchronized (this.A03) {
            runnable = (Runnable) this.A04.remove(r4);
        }
        if (runnable != null) {
            ((AnonymousClass38K) this.A01).A00.removeCallbacks(runnable);
        }
    }

    public final void A01(C2805352f r5) {
        0qQ.A0B(r5, 0);
        AnonymousClass5FZ r3 = new AnonymousClass5FZ(r5, this);
        synchronized (this.A03) {
            this.A04.put(r5, r3);
        }
        AnonymousClass38L r0 = this.A01;
        ((AnonymousClass38K) r0).A00.postDelayed(r3, this.A00);
    }
}
