package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.VoI  reason: case insensitive filesystem */
public abstract class C18251VoI {
    public static final void A00(02m r3, Set set) {
        0qQ.A0B(set, 1);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int A0F = AnonymousClass7TG.A0F(it);
            r3.markerPoint(A0F, "USER_NAVIGATION_CANCELLATION");
            r3.markerEnd(A0F, 4);
        }
        if (!set.isEmpty()) {
            set.clear();
        }
    }

    public static final void A01(02m r2, Set set, int i) {
        0qQ.A0B(set, 1);
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            r2.markerPoint(i, "NETWORK_FAILED");
            r2.markerEnd(i, 3);
            set.remove(valueOf);
        }
    }
}
