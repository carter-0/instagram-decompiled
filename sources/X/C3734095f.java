package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.95f  reason: invalid class name and case insensitive filesystem */
public final class C3734095f implements AnonymousClass69D {
    public static AtomicReference A00 = new AtomicReference();

    public final void Cxi(boolean z) {
        synchronized (C3734195g.A09) {
            Iterator it = new ArrayList(C3734195g.A0A.values()).iterator();
            while (it.hasNext()) {
                C3734195g r1 = (C3734195g) it.next();
                if (r1.A06.get()) {
                    Iterator it2 = r1.A05.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw new NullPointerException("onBackgroundStateChanged");
                    }
                }
            }
        }
    }
}
