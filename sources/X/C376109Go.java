package X;

import java.util.Arrays;

/* renamed from: X.9Go  reason: invalid class name and case insensitive filesystem */
public final class C376109Go {
    public String A00;
    public String A01;
    public String A02;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C376109Go
            r2 = 0
            if (r0 == 0) goto L_0x0022
            X.9Go r4 = (X.C376109Go) r4
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r4.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r3.A00
            java.lang.String r0 = r4.A00
            if (r1 != 0) goto L_0x002a
            if (r0 != 0) goto L_0x0022
        L_0x0019:
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            if (r1 != 0) goto L_0x0023
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r2 = 1
        L_0x0022:
            return r2
        L_0x0023:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            goto L_0x0021
        L_0x002a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376109Go.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A02, this.A00, this.A01});
    }

    public C376109Go(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public C376109Go() {
        this.A02 = "";
        this.A00 = "";
        this.A01 = "";
    }
}
