package X;

/* renamed from: X.XEf  reason: case insensitive filesystem */
public final class C21092XEf extends 1aJ {
    public final int A00;
    public final C3032668b A01;
    public final Iterable A02;
    public final C65071aK[] A03;

    public final void A02(1aL r8) {
        int i;
        C65071aK[] r6 = this.A03;
        if (r6 == null) {
            r6 = new 1aJ[8];
            i = 0;
            for (Object next : this.A02) {
                if (i == r6.length) {
                    C65071aK[] r0 = new C65071aK[((i >> 2) + i)];
                    System.arraycopy(r6, 0, r0, 0, i);
                    r6 = r0;
                }
                r6[i] = next;
                i++;
                r6 = r6;
            }
        } else {
            i = r6.length;
        }
        if (i == 0) {
            r8.Do4(AnonymousClass6F8.INSTANCE);
            r8.onComplete();
            return;
        }
        XDC xdc = new XDC(r8, this.A01, i, this.A00);
        1aL[] r4 = xdc.A07;
        int length = r4.length;
        xdc.A03.Do4(xdc);
        for (int i2 = 0; i2 < length && !xdc.A09 && !xdc.A08; i2++) {
            r6[i2].Eyt(r4[i2]);
        }
    }

    public C21092XEf(C3032668b r1, Iterable iterable, C65071aK[] r3, int i) {
        this.A03 = r3;
        this.A02 = iterable;
        this.A01 = r1;
        this.A00 = i;
    }
}
