package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6Rz  reason: invalid class name and case insensitive filesystem */
public final class C307916Rz implements AnonymousClass6S0 {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();

    public final void Cum(AnonymousClass6Tm r3, C277014uI r4, Object obj, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((AnonymousClass6S0) it.next()).Cum(r3, r4, obj, str);
            }
        }
    }

    public final void Cxv(AnonymousClass6Tm r3, C277014uI r4, String str) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((AnonymousClass6S0) it.next()).Cxv(r3, r4, str);
            }
        }
    }

    public final void DhD(AnonymousClass6QV r3, C277014uI r4) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((AnonymousClass6S0) it.next()).DhD(r3, r4);
            }
        }
    }
}
