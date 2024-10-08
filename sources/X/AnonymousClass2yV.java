package X;

/* renamed from: X.2yV  reason: invalid class name */
public final class AnonymousClass2yV implements C250603lj {
    public final AnonymousClass2yT A00;

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        if (r8.CEk(r7) != AnonymousClass05K.A0C) {
            AnonymousClass2yT r5 = this.A00;
            String id = ((1Xj) r7.A03).getId();
            if (id != null) {
                float CFe = r8.CFe(r7);
                r5.A01.A01(id, CFe, r8.BlK());
                01r r1 = r5.A00;
                if (r1.get(id) == null) {
                    r1.put(id, new Object());
                }
                C254223s8 r2 = (C254223s8) r1.get(id);
                if (r2 != null) {
                    r2.A00((double) CFe);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public AnonymousClass2yV(AnonymousClass2yT r1) {
        this.A00 = r1;
    }
}
