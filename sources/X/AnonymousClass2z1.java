package X;

/* renamed from: X.2z1  reason: invalid class name */
public final class AnonymousClass2z1 implements C250603lj {
    public final AnonymousClass2pP A00;

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        AnonymousClass2pP r1 = this.A00;
        String id = ((1Xj) r5.A03).getId();
        if (id != null) {
            C254213s7 A002 = r1.A00(id);
            int intValue = r6.CEk(r5).intValue();
            if (intValue == 0 || intValue == 1) {
                A002.A03(r5, r6);
            } else {
                A002.A04(r6);
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public AnonymousClass2z1(AnonymousClass2pP r1) {
        this.A00 = r1;
    }
}
