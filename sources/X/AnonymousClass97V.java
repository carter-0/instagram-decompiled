package X;

/* renamed from: X.97V  reason: invalid class name */
public class AnonymousClass97V extends AnonymousClass97W {
    public final byte[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = (X.AnonymousClass97R) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r9 == r8) goto L_0x007b
            boolean r1 = r9 instanceof X.AnonymousClass97R
            r4 = 0
            if (r1 == 0) goto L_0x0025
            int r3 = r8.A02()
            r7 = r9
            X.97R r7 = (X.AnonymousClass97R) r7
            int r2 = r7.A02()
            if (r3 != r2) goto L_0x0025
            if (r3 == 0) goto L_0x007b
            boolean r0 = r9 instanceof X.AnonymousClass97V
            if (r0 == 0) goto L_0x0077
            int r1 = r8.A00
            int r0 = r7.A00
            if (r1 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            if (r3 > r2) goto L_0x0059
            boolean r0 = r7 instanceof X.AnonymousClass97V
            if (r0 == 0) goto L_0x004c
            X.97V r7 = (X.AnonymousClass97V) r7
            byte[] r6 = r8.A00
            byte[] r5 = r7.A00
            int r4 = r8.A05()
            int r3 = r3 + r4
            int r2 = r7.A05()
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
            X.97R r1 = r7.A03(r3)
            X.97R r0 = r8.A03(r3)
            boolean r0 = r1.equals(r0)
            return r0
        L_0x0059:
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
        L_0x0077:
            boolean r0 = r9.equals(r8)
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass97V.equals(java.lang.Object):boolean");
    }

    public final int A05() {
        if (this instanceof AnonymousClass9CJ) {
            return ((AnonymousClass9CJ) this).A01;
        }
        return 0;
    }

    public AnonymousClass97V(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }
}
