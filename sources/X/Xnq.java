package X;

public final class Xnq {
    public final 1uo A00;
    public final 1v4 A01;

    public final void A01(AnonymousClass0Jz[] r8, int i) {
        int i2 = 0;
        while (i > 0) {
            1uo r5 = this.A00;
            int i3 = i;
            1yQ r0 = r5.A02;
            if (r0 == null) {
                i3 = Math.min(i, r5.A04);
            } else {
                int i4 = r0.A00;
                int i5 = i4 + i;
                int i6 = r5.A04;
                if (i5 > i6) {
                    if (i4 < i6) {
                        i3 = i6 - i4;
                    } else {
                        int i7 = r5.A03;
                        if (i7 <= i5) {
                            i3 = Math.max(1, i7 - i4);
                        }
                    }
                }
            }
            r5.A05(r8, i2, i3);
            A00(this);
            i2 += i3;
            i -= i3;
        }
    }

    public static void A00(Xnq xnq) {
        1v4 r3 = xnq.A01;
        1uo r2 = xnq.A00;
        r3.Ean(r2.A07());
        r3.Cro();
        1yQ r0 = r2.A02;
        if (r0 != null && r0.A00 >= r2.A04) {
            r3.Crk();
        }
        1yQ r02 = r2.A02;
        if (r02 != null && r02.A00 >= r2.A03) {
            r2.A02();
        }
    }

    public Xnq(1uo r1, 1v4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
