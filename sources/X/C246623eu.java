package X;

/* renamed from: X.3eu  reason: invalid class name and case insensitive filesystem */
public final class C246623eu extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C246623eu) {
                C246623eu r5 = (C246623eu) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r4 <= 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C246623eu(int r3, int r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.A01 = r3
            r2.A00 = r4
            r1 = 1
            if (r3 <= 0) goto L_0x000d
            r0 = 1
            if (r4 > 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r2.A03 = r0
            if (r3 <= 0) goto L_0x0019
            if (r4 <= 0) goto L_0x0019
            if (r3 <= r4) goto L_0x0019
        L_0x0016:
            r2.A02 = r1
            return
        L_0x0019:
            r1 = 0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246623eu.<init>(int, int):void");
    }
}
