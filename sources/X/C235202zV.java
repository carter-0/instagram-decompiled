package X;

import java.util.Map;

/* renamed from: X.2zV  reason: invalid class name and case insensitive filesystem */
public final class C235202zV extends C230502pj {
    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        1Xj r0;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        if (r7.CEk(r6) != AnonymousClass05K.A0C) {
            1Xj r3 = (1Xj) r6.A03;
            if (r3.A5D()) {
                r0 = r3.A1c(((AnonymousClass3W1) r6.A04).A03);
            } else {
                r0 = r3;
            }
            boolean z = true;
            if (r0 == null || !r0.A4k()) {
                z = false;
            }
            String id = r3.getId();
            if (id != null) {
                A02(r6, r7, id, z);
                String id2 = r3.getId();
                if (id2 != null) {
                    Map map = AnonymousClass59A.A02;
                    AnonymousClass59B r02 = (AnonymousClass59B) map.get(id2);
                    if (r02 == null) {
                        r02 = new AnonymousClass59B();
                    }
                    r02.A03 = true;
                    map.put(id2, r02);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
