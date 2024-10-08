package X;

import java.lang.ref.Reference;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.V6i  reason: case insensitive filesystem */
public abstract class C16801V6i {
    public static final void A00() {
        while (true) {
            Reference poll = C20570Wun.A03.poll();
            if (poll != null) {
                C20570Wun wun = (C20570Wun) poll;
                while (true) {
                    AtomicLong atomicLong = wun.A01;
                    long j = atomicLong.get();
                    if (j == 0) {
                        break;
                    } else if (atomicLong.compareAndSet(j, 0)) {
                        wun.A02.invoke(Long.valueOf(j));
                    }
                }
                C20570Wun.A04.remove(poll);
            } else {
                return;
            }
        }
    }
}
