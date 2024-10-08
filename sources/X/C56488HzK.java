package X;

import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.HzK  reason: case insensitive filesystem */
public abstract class C56488HzK {
    public static final Map A00 = AnonymousClass7TE.A1E();
    public static final Map A01 = AnonymousClass7TE.A1E();
    public static final ReentrantReadWriteLock A02 = new ReentrantReadWriteLock();

    public static final void A00(String str) {
        ReentrantReadWriteLock.ReadLock A0q = C51975G9x.A0q(str);
        try {
            C56523Hzu hzu = (C56523Hzu) A00.get(str);
            if (hzu != null) {
                C277014uI r2 = hzu.A04;
                C299275ur.A00(hzu.A00, AnonymousClass6Tm.A01, r2);
            }
        } finally {
            A0q.unlock();
        }
    }
}
