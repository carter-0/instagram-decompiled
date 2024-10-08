package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3dQ  reason: invalid class name and case insensitive filesystem */
public final class C245753dQ {
    public final C245743dP A00;
    public final C251323mv A01;
    public final Object A02;
    public final Set A03 = new HashSet();

    public final void A00() {
        Set<Number> set = this.A03;
        for (Number longValue : set) {
            C245743dP.A00(this.A00, longValue.longValue());
        }
        set.clear();
    }

    public final void A01(long j, boolean z) {
        if (!(!this.A03.add(Long.valueOf(j)))) {
            C245743dP r0 = this.A00;
            if (z) {
                C245743dP.A01(r0, j);
                2UL r3 = r0.A06;
                if (r3.A06.A05(j) == null) {
                    C245663dH r02 = r3.A02;
                    if (r02 != null) {
                        int intValue = ((Number) r02.A02.A06(j, -1)).intValue();
                        C245663dH r03 = r3.A02;
                        if (r03 != null) {
                            r3.A0F(r03.A05[intValue]);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            C245743dP.A01(r0, j);
            return;
        }
        throw new IllegalStateException("Cannot acquire the same reference more than once.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r1 <= 0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(long r4, boolean r6) {
        /*
            r3 = this;
            java.util.Set r1 = r3.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            boolean r0 = r1.remove(r0)
            if (r0 == 0) goto L_0x004c
            X.3dP r2 = r3.A00
            if (r6 == 0) goto L_0x0048
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x002f
            r0 = 1
        L_0x0015:
            X.C245743dP.A00(r2, r4)
            if (r0 == 0) goto L_0x002e
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x002e
            X.01c r0 = r2.A05
            java.lang.Object r0 = r0.A05(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0042
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0042
        L_0x002e:
            return
        L_0x002f:
            X.01c r0 = r2.A05
            java.lang.Object r0 = r0.A05(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0040
            int r1 = r0.intValue()
            r0 = 1
            if (r1 > 0) goto L_0x0015
        L_0x0040:
            r0 = 0
            goto L_0x0015
        L_0x0042:
            X.2UL r0 = r2.A06
            X.2UL.A05(r0, r4)
            return
        L_0x0048:
            X.C245743dP.A00(r2, r4)
            return
        L_0x004c:
            java.lang.String r1 = "Trying to release a reference that wasn't acquired."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245753dQ.A02(long, boolean):void");
    }

    public C245753dQ(C245743dP r2, C251323mv r3, Object obj) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = obj;
    }
}
