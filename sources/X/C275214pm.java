package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.4pm  reason: invalid class name and case insensitive filesystem */
public final class C275214pm implements Runnable {
    public final /* synthetic */ C275184pj A00;

    public C275214pm(C275184pj r1) {
        this.A00 = r1;
    }

    public final void run() {
        C275184pj r4 = this.A00;
        ConcurrentLinkedQueue concurrentLinkedQueue = r4.A03;
        int size = concurrentLinkedQueue.size();
        if (size != 0) {
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                C274844pB r0 = (C274844pB) concurrentLinkedQueue.poll();
                if (r0 != null) {
                    r4.A00(r0);
                }
                size = i;
            }
        }
        r4.A01.postDelayed(r4.A02, r4.A00);
    }
}
