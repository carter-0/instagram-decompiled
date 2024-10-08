package X;

public final class IPB implements C250603lj {
    public final C230332pS A00;
    public final AnonymousClass2pP A01;

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        boolean A1U = AnonymousClass7TF.A1U(0, r7, r8);
        AnonymousClass2pP r4 = this.A01;
        Object obj = r7.A03;
        String id = ((1Nv) obj).getId();
        if (id != null) {
            C254213s7 A002 = r4.A00(id);
            int A0A = C51968G9o.A0A(r7, r8);
            if (A0A == 0 || A0A == A1U) {
                A002.A03(r7, r8);
                return;
            }
            A002.A04(r8);
            r4.A01(this.A00, A002, obj, r7.A04);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public IPB(C230332pS r1, AnonymousClass2pP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
