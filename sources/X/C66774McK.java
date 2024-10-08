package X;

import android.content.IntentFilter;

/* renamed from: X.McK  reason: case insensitive filesystem */
public final class C66774McK implements Runnable {
    public final /* synthetic */ 1Ou A00;

    public C66774McK(1Ou r1) {
        this.A00 = r1;
    }

    public final void run() {
        1Ou r3 = this.A00;
        IntentFilter intentFilter = 1Ou.A0W;
        r3.A0G.decrementAndGet();
        1Ou.A07(r3, "onMutationSent", 0);
    }
}
