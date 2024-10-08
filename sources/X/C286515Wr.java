package X;

/* renamed from: X.5Wr  reason: invalid class name and case insensitive filesystem */
public final class C286515Wr {
    public final 0vr A00 = new 0vr(6);

    public final void A00(Object obj) {
        0vr r9 = this.A00;
        long[] jArr = r9.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - (((i - length) ^ -1) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = r9.A04[i4];
                            if (obj2 instanceof 0vq) {
                                0qQ.A0C(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                                0vq r1 = (0vq) obj2;
                                r1.A0A(obj);
                                if (r1.A01 != 0) {
                                }
                            } else if (obj2 != obj) {
                            }
                            r9.A06(i4);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void A01(Object obj, Object obj2) {
        0vr r4 = this.A00;
        int A05 = r4.A05(obj);
        if (A05 < 0) {
            A05 ^= -1;
            r4.A03[A05] = obj;
        } else {
            Object obj3 = r4.A04[A05];
            if (obj3 != null) {
                if (obj3 instanceof 0vq) {
                    ((0vq) obj3).A09(obj2);
                } else if (obj3 != obj2) {
                    0vq r0 = new 0vq(6);
                    r0.A09(obj3);
                    r0.A09(obj2);
                    obj2 = r0;
                }
                obj2 = obj3;
            }
        }
        r4.A04[A05] = obj2;
    }

    public final boolean A02(Object obj, Object obj2) {
        0vr r3 = this.A00;
        Object A03 = r3.A03(obj);
        boolean z = false;
        if (A03 != null) {
            if (A03 instanceof 0vq) {
                0vq r2 = (0vq) A03;
                z = r2.A0A(obj2);
                if (z && r2.A01 == 0) {
                    r3.A07(obj);
                }
            } else if (A03.equals(obj2)) {
                r3.A07(obj);
                return true;
            }
        }
        return z;
    }

    public C286515Wr() {
        long[] jArr = 01o.A00;
    }
}
