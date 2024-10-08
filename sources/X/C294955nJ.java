package X;

/* renamed from: X.5nJ  reason: invalid class name and case insensitive filesystem */
public final class C294955nJ extends 1aJ {
    public final int A00;
    public final C3032668b A01;
    public final Iterable A02;
    public final C65071aK[] A03;

    public final void A02(1aL r9) {
        int i;
        C65071aK[] r7 = this.A03;
        if (r7 == null) {
            r7 = new 1aJ[8];
            i = 0;
            for (Object next : this.A02) {
                if (i == r7.length) {
                    C65071aK[] r0 = new C65071aK[((i >> 2) + i)];
                    System.arraycopy(r7, 0, r0, 0, i);
                    r7 = r0;
                }
                r7[i] = next;
                i++;
                r7 = r7;
            }
        } else {
            i = r7.length;
        }
        if (i == 0) {
            r9.Do4(AnonymousClass6F8.INSTANCE);
            r9.onComplete();
            return;
        }
        Y5k y5k = new Y5k(r9, this.A01, i);
        int i2 = this.A00;
        1aL[] r4 = y5k.A02;
        int length = r4.length;
        for (int i3 = 0; i3 < length; i3++) {
            r4[i3] = new Y18(y5k, i2);
        }
        y5k.lazySet(0);
        y5k.A00.Do4(y5k);
        for (int i4 = 0; i4 < length && !y5k.A04; i4++) {
            r7[i4].Eyt(r4[i4]);
        }
    }

    public C294955nJ(C3032668b r1, Iterable iterable, C65071aK[] r3, int i) {
        this.A03 = r3;
        this.A02 = iterable;
        this.A01 = r1;
        this.A00 = i;
    }
}
