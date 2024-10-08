package X;

/* renamed from: X.2z6  reason: invalid class name and case insensitive filesystem */
public final class C235012z6 implements C250603lj {
    public final C230332pS A00;
    public final AnonymousClass2pP A01;

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        if (r7.CEk(r6) == AnonymousClass05K.A00) {
            AnonymousClass2pP r1 = this.A01;
            String id = ((1Xj) r6.A03).getId();
            if (id != null) {
                r1.A00(id);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (r7.CEk(r6) == AnonymousClass05K.A0C) {
            AnonymousClass2pP r4 = this.A01;
            Object obj = r6.A03;
            String id2 = ((1Xj) obj).getId();
            if (id2 != null) {
                C254213s7 A002 = r4.A00(id2);
                A002.A04(r7);
                r4.A01(this.A00, A002, obj, r6.A04);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C235012z6(C230332pS r1, AnonymousClass2pP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
