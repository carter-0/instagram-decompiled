package X;

/* renamed from: X.9dB  reason: invalid class name and case insensitive filesystem */
public final class C382119dB extends C245013c9 {
    public 2Tn A00;
    public int[] A01;
    public boolean[] A02;

    public final void A09(C244143ai r4, float f) {
        0qQ.A0B(r4, 0);
        2Tn r0 = this.A00;
        if (r0 == null) {
            r0 = new 2Tn();
            this.A00 = r0;
        }
        r0.A03(r4, f);
        boolean[] zArr = this.A02;
        if (zArr == null) {
            zArr = new boolean[9];
            this.A02 = zArr;
        }
        zArr[r4.A00] = true;
    }

    public final void A0A(C244143ai r4, float f) {
        0qQ.A0B(r4, 0);
        int[] iArr = this.A01;
        if (iArr == null) {
            iArr = new int[4];
            this.A01 = iArr;
        }
        2Ts.A03.A02(r4, iArr, (int) f);
    }

    public final void E1a(C244143ai r4, int i) {
        0qQ.A0B(r4, 0);
        float f = (float) i;
        2Tn r0 = this.A00;
        if (r0 == null) {
            r0 = new 2Tn();
            this.A00 = r0;
        }
        r0.A03(r4, f);
        boolean[] zArr = this.A02;
        if (zArr != null) {
            zArr[r4.A00] = false;
        }
    }
}
