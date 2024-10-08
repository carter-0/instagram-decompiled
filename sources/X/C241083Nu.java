package X;

/* renamed from: X.3Nu  reason: invalid class name and case insensitive filesystem */
public final class C241083Nu implements C250603lj {
    public static final AnonymousClass2lM A04 = new Object();
    public long A00 = -1;
    public long A01;
    public AnonymousClass2lM A02 = A04;
    public final C228322lL A03;

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 1);
        int intValue = r9.CEk(r8).intValue();
        if (intValue == 0) {
            C228322lL r3 = this.A03;
            if (r3.A0L) {
                long j = r3.A0B;
                if (this.A02 != r3) {
                    this.A02 = r3;
                    this.A01 = j;
                }
            }
            this.A00 = r9.BlK();
        } else if (intValue != 1) {
            this.A02 = A04;
            this.A01 = 0;
            this.A00 = -1;
            return;
        }
        long BlK = r9.BlK() - this.A00;
        AnonymousClass2lM r4 = this.A02;
        AnonymousClass2lM r32 = A04;
        if (r4 != r32 && BlK >= this.A01) {
            r4.DhA();
            this.A02 = r32;
        }
    }

    public C241083Nu(C228322lL r3) {
        this.A03 = r3;
    }
}
