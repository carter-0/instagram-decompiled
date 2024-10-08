package X;

import android.content.IntentFilter;

/* renamed from: X.PZ6  reason: case insensitive filesystem */
public final class C73227PZ6 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 1Ou A01;

    public C73227PZ6(1Ou r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        1Ou r3 = this.A01;
        long j = this.A00;
        IntentFilter intentFilter = 1Ou.A0W;
        r3.A0G.decrementAndGet();
        1Ou.A07(r3, "onMutationSent", j);
    }
}
