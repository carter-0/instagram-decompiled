package X;

import java.util.List;

/* renamed from: X.AiV  reason: case insensitive filesystem */
public final class C40741AiV implements Runnable {
    public final /* synthetic */ C345827u9 A00;

    public C40741AiV(C345827u9 r1) {
        this.A00 = r1;
    }

    public final void run() {
        C345827u9 r5 = this.A00;
        C18849W5t w5t = r5.A0K;
        C345827u9.A03(w5t, r5.A0M);
        List list = r5.A0E.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C345827u9.A03(w5t, (C346027uT) list.get(i));
        }
        C18849W5t w5t2 = r5.A0K;
        if (w5t2 != null) {
            if (r5.A0G) {
                r5.A0K = null;
                w5t2.A01();
            } else {
                w5t2.A00();
            }
        }
        C346027uT r0 = r5.A0L;
        r5.A0L = null;
        if (r0 != null) {
            r0.A01();
        }
        C346027uT r02 = r5.A0M;
        r5.A0M = null;
        if (r02 != null) {
            r02.A01();
        }
    }
}
