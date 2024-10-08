package X;

import java.util.Map;

/* renamed from: X.2zQ  reason: invalid class name and case insensitive filesystem */
public final class C235192zQ extends C230502pj {
    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        if (r6.CEk(r5) != AnonymousClass05K.A0C) {
            String id = ((1Xj) r5.A03).getId();
            if (id != null) {
                Map map = AnonymousClass59A.A02;
                AnonymousClass59B r0 = (AnonymousClass59B) map.get(id);
                if (r0 == null) {
                    r0 = new AnonymousClass59B();
                }
                r0.A03 = true;
                map.put(id, r0);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
