package X;

/* renamed from: X.5LA  reason: invalid class name */
public class AnonymousClass5LA extends AnonymousClass5LB {
    public final byte[] A00;

    public int A04() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = (X.AnonymousClass5L9) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r9 == r8) goto L_0x009f
            boolean r1 = r9 instanceof X.AnonymousClass5L9
            r5 = 0
            if (r1 == 0) goto L_0x0025
            int r3 = r8.A03()
            r7 = r9
            X.5L9 r7 = (X.AnonymousClass5L9) r7
            int r2 = r7.A03()
            if (r3 != r2) goto L_0x0025
            if (r3 == 0) goto L_0x009f
            boolean r0 = r9 instanceof X.AnonymousClass5LA
            if (r0 == 0) goto L_0x009b
            int r1 = r8.A00
            int r0 = r7.A00
            if (r1 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            return r5
        L_0x0026:
            if (r3 > r2) goto L_0x007d
            boolean r0 = r7 instanceof X.AnonymousClass5LA
            X.5LA r7 = (X.AnonymousClass5LA) r7
            if (r0 == 0) goto L_0x004c
            byte[] r6 = r8.A00
            byte[] r5 = r7.A00
            int r4 = r8.A04()
            int r3 = r3 + r4
            int r2 = r7.A04()
        L_0x003b:
            if (r4 >= r3) goto L_0x004a
            byte r1 = r6[r4]
            byte r0 = r5[r2]
            if (r1 == r0) goto L_0x0045
            r0 = 0
            return r0
        L_0x0045:
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x003b
        L_0x004a:
            r0 = 1
            return r0
        L_0x004c:
            int r0 = r7.A03()
            int r2 = X.AnonymousClass5L9.A00(r5, r3, r0)
            if (r2 != 0) goto L_0x0071
            X.5L9 r4 = X.AnonymousClass5L9.A02
        L_0x0058:
            int r3 = X.AnonymousClass5L9.A00(r5, r3, r3)
            if (r3 != 0) goto L_0x0065
            X.5L9 r2 = X.AnonymousClass5L9.A02
        L_0x0060:
            boolean r0 = r4.equals(r2)
            return r0
        L_0x0065:
            byte[] r1 = r8.A00
            int r0 = r8.A04()
            X.QBp r2 = new X.QBp
            r2.<init>(r1, r0, r3)
            goto L_0x0060
        L_0x0071:
            byte[] r1 = r7.A00
            int r0 = r7.A04()
            X.QBp r4 = new X.QBp
            r4.<init>(r1, r0, r2)
            goto L_0x0058
        L_0x007d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 155(0x9b, float:2.17E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r1.append(r0)
            r1.append(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x009b:
            boolean r0 = r9.equals(r8)
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5LA.equals(java.lang.Object):boolean");
    }

    public AnonymousClass5LA(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }
}
