package X;

/* renamed from: X.2z8  reason: invalid class name */
public final class AnonymousClass2z8 implements C250603lj {
    public final C230332pS A00;
    public final AnonymousClass2pP A01;

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        AnonymousClass2pP r7 = this.A01;
        C254213s7 A002 = r7.A00(r11.A05);
        int intValue = r12.CEk(r11).intValue();
        if (intValue == 0 || intValue == 1) {
            A002.A03(r11, r12);
            return;
        }
        long BlK = r12.BlK();
        long j = A002.A03;
        if (j > 0) {
            A002.A02 = BlK - j;
            A002.A03 = -1;
        }
        C254213s7.A00(A002, BlK);
        r7.A01(this.A00, A002, r11.A03, r11.A04);
    }

    public AnonymousClass2z8(C230332pS r1, AnonymousClass2pP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
