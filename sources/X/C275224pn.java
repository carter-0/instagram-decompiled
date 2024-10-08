package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.4pn  reason: invalid class name and case insensitive filesystem */
public final class C275224pn implements Runnable {
    public final /* synthetic */ C275184pj A00;

    public C275224pn(C275184pj r1) {
        this.A00 = r1;
    }

    public final void run() {
        C275184pj r3 = this.A00;
        ConcurrentLinkedQueue concurrentLinkedQueue = r3.A03;
        int size = concurrentLinkedQueue.size();
        if (size != 0) {
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                C274844pB r0 = (C274844pB) concurrentLinkedQueue.poll();
                if (r0 != null) {
                    r3.A00(r0);
                }
                size = i;
            }
        }
        r3.A04.set(false);
    }
}
