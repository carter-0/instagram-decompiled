package X;

import java.util.Map;

/* renamed from: X.2zW  reason: invalid class name and case insensitive filesystem */
public final class C235212zW extends C230502pj {
    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        if (r8.CEk(r7) != AnonymousClass05K.A0C) {
            1Xj r4 = (1Xj) r7.A03;
            0qQ.A0A(r4);
            if (this.A00.get(r4) != null) {
                String id = r4.getId();
                if (id != null) {
                    Map map = AnonymousClass59A.A02;
                    AnonymousClass59B r0 = (AnonymousClass59B) map.get(id);
                    if (r0 == null) {
                        r0 = new AnonymousClass59B();
                    }
                    r0.A02 = true;
                    map.put(id, r0);
                    String id2 = r4.getId();
                    if (id2 != null) {
                        A02(r7, r8, id2, r4.A5D());
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }
}
