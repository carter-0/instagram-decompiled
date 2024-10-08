package X;

/* renamed from: X.GAm  reason: case insensitive filesystem */
public final class C51989GAm implements C250603lj {
    public final C230332pS A00;
    public final AnonymousClass2pP A01;

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        C267324bN r5 = (C267324bN) r9.A03;
        AnonymousClass3OA r4 = r5.A02;
        AnonymousClass3W1 r3 = ((C52058GDe) r9.A04).A0E;
        if (r4 != null && r3 != null) {
            AnonymousClass2pP r2 = this.A01;
            C254213s7 A002 = r2.A00(r5.getId());
            A002.A06 = r5.A06;
            int intValue = r10.CEk(r9).intValue();
            if (intValue == 0 || intValue == 1) {
                A002.A03(r9, r10);
                return;
            }
            A002.A04(r10);
            if (r5.CcK()) {
                r4 = r5.A06();
            }
            r2.A01(this.A00, A002, r4, r3);
        }
    }

    public C51989GAm(C230332pS r1, AnonymousClass2pP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
