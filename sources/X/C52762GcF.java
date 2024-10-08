package X;

/* renamed from: X.GcF  reason: case insensitive filesystem */
public final class C52762GcF extends C228442lg {
    public final /* synthetic */ C55889HpA A00;

    public C52762GcF(C55889HpA hpA) {
        this.A00 = hpA;
    }

    public final boolean A01(int i, int i2) {
        C55889HpA hpA = this.A00;
        boolean z = false;
        boolean z2 = false;
        hpA.A01 = false;
        if (i2 > 0) {
            z = true;
        }
        float abs = (float) Math.abs(i2);
        if (abs <= hpA.A03 || !z) {
            if (abs > hpA.A02) {
                C52761GcE gcE = hpA.A0A;
                if (z) {
                    z2 = C52761GcE.A02(gcE, false);
                } else {
                    z2 = gcE.A08();
                }
            }
            return z2;
        }
        C52761GcE gcE2 = hpA.A0A;
        C55889HpA hpA2 = gcE2.A03;
        if (hpA2 != null) {
            hpA2.A01 = true;
        }
        z2 = C52761GcE.A02(gcE2, true);
        hpA.A01 = z2;
        return z2;
    }
}
