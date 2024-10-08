package X;

public final class IG4 implements AnonymousClass5S2 {
    public final float A00;
    public final HMB A01;
    public final IH8 A02;

    public IG4(HMB hmb, IH8 ih8, float f) {
        0qQ.A0B(ih8, 2);
        this.A01 = hmb;
        this.A02 = ih8;
        this.A00 = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006e, code lost:
        r7 = r2.A03;
        r7.moveTo(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0090, code lost:
        r7 = r2.A03;
        r7.moveTo(r1, X.C288025bF.A00(r16) - r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009a, code lost:
        r3 = r3 / 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a1, code lost:
        if (X.HXS.A00(r5) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a3, code lost:
        r7.rLineTo(r3, -r4);
        r7.rLineTo(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        return new X.C289335dQ(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b0, code lost:
        r7.rLineTo(r3, r4);
        r7.rLineTo(r3, -r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C289315dO AMX(X.C268024cd r14, X.AnonymousClass5Q8 r15, long r16) {
        /*
            r13 = this;
            r0 = 2
            X.0qQ.A0B(r14, r0)
            float r3 = X.IH8.A03
            float r0 = r14.AwL()
            float r3 = r3 * r0
            float r4 = X.IH8.A02
            float r0 = r14.AwL()
            float r4 = r4 * r0
            X.HMB r5 = r13.A01
            boolean r0 = X.HXS.A00(r5)
            r7 = 0
            r8 = 0
            if (r0 == 0) goto L_0x001d
            r8 = r4
        L_0x001d:
            boolean r0 = X.HXS.A00(r5)
            float r10 = X.C288025bF.A00(r16)
            if (r0 != 0) goto L_0x0028
            float r10 = r10 - r4
        L_0x0028:
            r6 = 1094713344(0x41400000, float:12.0)
            float r0 = r14.AwL()
            float r6 = r6 * r0
            X.60e r2 = X.C3026864w.A00()
            float r9 = X.C288025bF.A02(r16)
            float r1 = r13.A00
            float r0 = r14.AwL()
            float r1 = r1 * r0
            long r11 = X.AnonymousClass6GR.A00(r1, r1)
            X.6GT r1 = X.AnonymousClass6GU.A00(r7, r8, r9, r10, r11)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.AAA(r1, r0)
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x0064;
                case 1: goto L_0x005d;
                case 2: goto L_0x0057;
                case 3: goto L_0x0074;
                case 4: goto L_0x007f;
                case 5: goto L_0x008a;
                default: goto L_0x0052;
            }
        L_0x0052:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0057:
            android.graphics.Path r7 = r2.A03
            r7.moveTo(r6, r4)
            goto L_0x009a
        L_0x005d:
            float r1 = X.C288025bF.A02(r16)
            float r1 = r1 - r6
            float r1 = r1 - r3
            goto L_0x006e
        L_0x0064:
            float r1 = X.C288025bF.A02(r16)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r0 = r3 / r0
            float r1 = r1 - r0
        L_0x006e:
            android.graphics.Path r7 = r2.A03
            r7.moveTo(r1, r4)
            goto L_0x009a
        L_0x0074:
            float r1 = X.C288025bF.A02(r16)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r0 = r3 / r0
            float r1 = r1 - r0
            goto L_0x0090
        L_0x007f:
            float r0 = X.C288025bF.A00(r16)
            float r0 = r0 - r4
            android.graphics.Path r7 = r2.A03
            r7.moveTo(r6, r0)
            goto L_0x009a
        L_0x008a:
            float r1 = X.C288025bF.A02(r16)
            float r1 = r1 - r6
            float r1 = r1 - r3
        L_0x0090:
            float r0 = X.C288025bF.A00(r16)
            float r0 = r0 - r4
            android.graphics.Path r7 = r2.A03
            r7.moveTo(r1, r0)
        L_0x009a:
            boolean r1 = X.HXS.A00(r5)
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            if (r1 == 0) goto L_0x00b0
            float r0 = -r4
            r7.rLineTo(r3, r0)
            r7.rLineTo(r3, r4)
        L_0x00aa:
            X.5dQ r0 = new X.5dQ
            r0.<init>(r2)
            return r0
        L_0x00b0:
            r7.rLineTo(r3, r4)
            float r0 = -r4
            r7.rLineTo(r3, r0)
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IG4.AMX(X.4cd, X.5Q8, long):X.5dO");
    }
}
