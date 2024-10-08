package X;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public final class SOB {
    public final int A00;
    public final SK6 A01;
    public final HashMap A02;
    public final C8218QkR[] A03;

    public static SOB A01(C269674fV r8, SK6 sk6, C8218QkR[] qkRArr, boolean z) {
        int length = qkRArr.length;
        C8218QkR[] qkRArr2 = new C8218QkR[length];
        int i = 0;
        while (true) {
            C269674fV r4 = r8;
            if (i >= length) {
                return new SOB(r4, sk6, qkRArr2, z, false);
            }
            C8218QkR qkR = qkRArr[i];
            if (!qkR.A0N()) {
                qkR = qkR.A04(r8.A0B(qkR, qkR.A04));
            }
            qkRArr2[i] = qkR;
            i++;
        }
    }

    public static C8218QkR A00(SOB sob, Object obj) {
        return (C8218QkR) sob.A02.get(obj);
    }

    public final Object A02(C269674fV r8, S7L s7l) {
        SK6 sk6 = this.A01;
        C8218QkR[] qkRArr = this.A03;
        if (s7l.A00 > 0) {
            BitSet bitSet = s7l.A07;
            if (bitSet != null) {
                Object[] objArr = s7l.A08;
                int length = objArr.length;
                int i = 0;
                while (true) {
                    int nextClearBit = bitSet.nextClearBit(i);
                    if (nextClearBit >= length) {
                        break;
                    }
                    objArr[nextClearBit] = s7l.A00(qkRArr[nextClearBit]);
                    i = nextClearBit + 1;
                }
            } else {
                int i2 = s7l.A01;
                Object[] objArr2 = s7l.A08;
                int length2 = objArr2.length;
                int i3 = 0;
                while (i3 < length2) {
                    if ((i2 & 1) == 0) {
                        objArr2[i3] = s7l.A00(qkRArr[i3]);
                    }
                    i3++;
                    i2 >>= 1;
                }
            }
        }
        C269674fV r3 = s7l.A05;
        if (r3.A0j(C269464fA.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            int i4 = 0;
            while (true) {
                if (i4 >= qkRArr.length) {
                    break;
                } else if (s7l.A08[i4] == null) {
                    C8218QkR qkR = qkRArr[i4];
                    r3.A0W(qkR, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", C51968G9o.A1Z(qkR.A06.A02, qkR.A02()));
                    break;
                } else {
                    i4++;
                }
            }
            throw AnonymousClass00P.createAndThrow();
        }
        Object A0E = sk6.A0E(r8, s7l.A08);
        if (A0E != null) {
            T9I t9i = s7l.A06;
            if (t9i != null) {
                Object obj = s7l.A03;
                if (obj != null) {
                    r8.A0I(t9i.A00, t9i.A01, obj).A01(A0E);
                    C8218QkR qkR2 = t9i.A05;
                    if (qkR2 != null) {
                        A0E = qkR2.A0F(A0E, s7l.A03);
                    }
                } else {
                    r8.A0W(t9i.A05, String.format("No Object Id found for an instance of %s, to assign to property '%s'", new Object[]{C269574fL.A07(A0E), t9i.A04}), new Object[0]);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            for (C10436RsD rsD = s7l.A02; rsD != null; rsD = rsD.A00) {
                if (rsD instanceof C8183Qio) {
                    C8183Qio qio = (C8183Qio) rsD;
                    qio.A00.A0L(A0E, qio.A01);
                } else if (rsD instanceof C8182Qin) {
                    C8182Qin qin = (C8182Qin) rsD;
                    ((Map) A0E).put(qin.A00, qin.A01);
                } else {
                    C8184Qip qip = (C8184Qip) rsD;
                    qip.A00.A02(A0E, qip.A01, qip.A01);
                }
            }
        }
        return A0E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r1 = r1.A0k((r0 = r5.BRS()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SOB(X.C269674fV r9, X.SK6 r10, X.C8218QkR[] r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            r8.<init>()
            r8.A01 = r10
            if (r12 == 0) goto L_0x006d
            X.4f9 r0 = r9.A02
            X.4eS r0 = r0.A01
            java.util.Locale r1 = r0.A09
            X.TST r0 = new X.TST
            r0.<init>(r1)
        L_0x0012:
            r8.A02 = r0
            int r4 = r11.length
            r8.A00 = r4
            X.QkR[] r0 = new X.C8218QkR[r4]
            r8.A03 = r0
            r3 = 0
            if (r13 == 0) goto L_0x0072
            X.4f9 r7 = r9.A02
            r6 = 0
        L_0x0021:
            if (r6 >= r4) goto L_0x0072
            r5 = r11[r6]
            boolean r0 = r5 instanceof X.C8174Qif
            if (r0 == 0) goto L_0x0030
            r0 = r5
            X.Qif r0 = (X.C8174Qif) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x006a
        L_0x0030:
            java.util.List r1 = r5.A01
            if (r1 != 0) goto L_0x004c
            X.4eA r1 = r7.A01()
            if (r1 == 0) goto L_0x0046
            X.QkH r0 = r5.BRS()
            if (r0 == 0) goto L_0x0046
            java.util.List r1 = r1.A0k(r0)
            if (r1 != 0) goto L_0x004a
        L_0x0046:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x004a:
            r5.A01 = r1
        L_0x004c:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x006a
            java.util.Iterator r2 = r1.iterator()
        L_0x0056:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r2.next()
            X.4f7 r0 = (X.C269434f7) r0
            java.util.HashMap r1 = r8.A02
            java.lang.String r0 = r0.A02
            r1.put(r0, r5)
            goto L_0x0056
        L_0x006a:
            int r6 = r6 + 1
            goto L_0x0021
        L_0x006d:
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            goto L_0x0012
        L_0x0072:
            if (r3 >= r4) goto L_0x0091
            r2 = r11[r3]
            X.QkR[] r0 = r8.A03
            r0[r3] = r2
            boolean r0 = r2 instanceof X.C8174Qif
            if (r0 == 0) goto L_0x0085
            r0 = r2
            X.Qif r0 = (X.C8174Qif) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x008e
        L_0x0085:
            java.util.HashMap r1 = r8.A02
            X.4f7 r0 = r2.A06
            java.lang.String r0 = r0.A02
            r1.put(r0, r2)
        L_0x008e:
            int r3 = r3 + 1
            goto L_0x0072
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SOB.<init>(X.4fV, X.SK6, X.QkR[], boolean, boolean):void");
    }
}
