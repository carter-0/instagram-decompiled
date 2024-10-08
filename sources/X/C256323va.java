package X;

import java.util.Map;

/* renamed from: X.3va  reason: invalid class name and case insensitive filesystem */
public final class C256323va implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1wH A01;

    public C256323va(1wH r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        1wH r4 = this.A01;
        Map map = r4.A04;
        int i = this.A00;
        if (map.get(Integer.valueOf(i)) != null) {
            1wH.A00(r4, i, r4.A01.currentMonotonicTimestampNanos(), 113);
        }
    }
}
