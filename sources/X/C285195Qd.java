package X;

/* renamed from: X.5Qd  reason: invalid class name and case insensitive filesystem */
public final class C285195Qd {
    public boolean A00;
    public final 0vr A01 = new 0vr(6);
    public final C285045Pl A02 = new C285045Pl(new C62320sa[16]);

    public static final void A00(C285195Qd r5) {
        r5.A01.A08();
        int i = 0;
        r5.A00 = false;
        C285045Pl r3 = r5.A02;
        int i2 = r3.A00;
        if (i2 > 0) {
            Object[] objArr = r3.A02;
            do {
                ((C62320sa) objArr[i]).invoke();
                i++;
            } while (i < i2);
        }
        r3.A01();
    }

    public static final void A01(C285195Qd r17) {
        C285195Qd r11 = r17;
        0vr r10 = r11.A01;
        Object[] objArr = r10.A03;
        long[] jArr = r10.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ -1) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            C268794e0 r1 = (C268794e0) objArr[(i << 3) + i3];
                            C288905cg r0 = (C288905cg) C286375Wc.A00(r1).A01.A03(r1);
                            if (r0 != null) {
                                r1.A00 = r0;
                            } else {
                                I2E.A02("committing a node that was not updated in the current transaction");
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        r10.A08();
        r11.A00 = false;
        r11.A02.A01();
    }

    public C285195Qd() {
        long[] jArr = 01o.A00;
    }
}
