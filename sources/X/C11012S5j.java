package X;

/* renamed from: X.S5j  reason: case insensitive filesystem */
public final class C11012S5j {
    public final String A00;
    public final String A01;

    public C11012S5j(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r5 = (X.C11012S5j) r5;
        r1 = r4.A00;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r1 = r4.A01;
        r0 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r4) goto L_0x0026
            boolean r0 = r5 instanceof X.C11012S5j
            r2 = 0
            if (r0 == 0) goto L_0x0027
            X.S5j r5 = (X.C11012S5j) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == r0) goto L_0x0018
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0018:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == r0) goto L_0x0026
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            return r3
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11012S5j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 37) + AnonymousClass7TG.A0E(this.A01);
    }

    public final String toString() {
        return 002.A11("[packageName=", this.A00, ",libraryName=", this.A01, "]");
    }
}
