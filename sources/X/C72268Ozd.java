package X;

/* renamed from: X.Ozd  reason: case insensitive filesystem */
public final class C72268Ozd implements C250603lj {
    public boolean A00;
    public final C70526O9z A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C73703PiQ.A00);
    public final Runnable A03 = new C73047PUe(this);

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        AnonymousClass7TF.A1H(r5, r6);
        int A0A = C51968G9o.A0A(r5, r6);
        if (A0A == 0) {
            JTO.A0E(this.A02).removeCallbacks(this.A03);
        } else if (A0A == 2) {
            JTO.A0E(this.A02).postDelayed(this.A03, 1000);
        }
    }

    public C72268Ozd(C70526O9z o9z) {
        this.A01 = o9z;
    }
}
