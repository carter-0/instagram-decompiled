package X;

/* renamed from: X.5fC  reason: invalid class name and case insensitive filesystem */
public final class C290365fC {
    public final int A00;
    public final int A01;
    public final C256683wB A02;
    public final C256683wB A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C290365fC r5 = (C290365fC) obj;
            if (this.A01 != r5.A01 || this.A00 != r5.A00 || !this.A04.equals(r5.A04) || !this.A03.equals(r5.A03) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((527 + this.A01) * 31) + this.A00) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r6 == 0) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C290365fC(X.C256683wB r2, X.C256683wB r3, java.lang.String r4, int r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            if (r5 == 0) goto L_0x0008
            r0 = 0
            if (r6 != 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.C256703wD.A03(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0020
            r1.A04 = r4
            r2.getClass()
            r1.A03 = r2
            r1.A02 = r3
            r1.A01 = r5
            r1.A00 = r6
            return
        L_0x0020:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290365fC.<init>(X.3wB, X.3wB, java.lang.String, int, int):void");
    }
}
