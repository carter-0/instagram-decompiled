package X;

import java.util.List;

/* renamed from: X.7xg  reason: invalid class name and case insensitive filesystem */
public final class C347977xg extends 1VS {
    public final C347947xd A00;
    public final List A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C347977xg(X.C347967xf r8, java.util.List r9) {
        /*
            r7 = this;
            X.7xe[] r1 = X.C347967xf.A01
            r6 = 1
            r0 = 0
            r0 = r1[r0]
            int r5 = r6 * 31
            java.lang.String r0 = r0.A01
            int r0 = r0.hashCode()
            int r5 = r5 + r0
            java.util.Iterator r4 = r9.iterator()
        L_0x0013:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r4.next()
            X.7xd r0 = (X.C347947xd) r0
            X.7xe[] r3 = r0.BT1()
            int r2 = r3.length
            r1 = 0
        L_0x0025:
            if (r1 >= r2) goto L_0x0013
            r0 = r3[r1]
            int r5 = r5 * 31
            java.lang.String r0 = r0.A01
            int r0 = r0.hashCode()
            int r5 = r5 + r0
            int r1 = r1 + 1
            goto L_0x0025
        L_0x0035:
            if (r5 == 0) goto L_0x003b
            int r6 = java.lang.Math.abs(r5)
        L_0x003b:
            r7.<init>(r6)
            r7.A00 = r8
            r7.A01 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347977xg.<init>(X.7xf, java.util.List):void");
    }

    private void A00(1W6 r5) {
        r5.ADK();
        try {
            new C39886ADi(r5, this.A00, true).A01();
            for (C347947xd aDi : this.A01) {
                new C39886ADi(r5, aDi, false).A01();
            }
            ((1W5) r5).A00.setTransactionSuccessful();
        } finally {
            r5.ASV();
        }
    }

    public final void A04(1W6 r1) {
        A00(r1);
    }

    public final void A05(1W6 r1, int i, int i2) {
        A00(r1);
    }

    public final void A06(1W6 r1, int i, int i2) {
        A00(r1);
    }
}
