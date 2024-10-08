package X;

import java.util.Set;

public final class S2U {
    public String A00;
    public Set A01;
    public final C11381SQt A02;
    public volatile Boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0.equals(r5) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set A00() {
        /*
            r6 = this;
            X.SNL r0 = X.SDN.A00
            java.lang.Object r5 = r0.A00
            java.lang.String r5 = (java.lang.String) r5
            java.util.Set r4 = r6.A01
            if (r4 == 0) goto L_0x0014
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0032
        L_0x0014:
            java.lang.String r0 = ","
            java.lang.String[] r3 = android.text.TextUtils.split(r5, r0)
            java.util.HashSet r4 = X.AnonymousClass7TE.A1F()
            int r2 = r3.length
            r1 = 0
        L_0x0020:
            if (r1 >= r2) goto L_0x002e
            r0 = r3[r1]
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x002b }
            X.AnonymousClass7TF.A1M(r4, r0)     // Catch:{ NumberFormatException -> 0x002b }
        L_0x002b:
            int r1 = r1 + 1
            goto L_0x0020
        L_0x002e:
            r6.A00 = r5
            r6.A01 = r4
        L_0x0032:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S2U.A00():java.util.Set");
    }

    public S2U(C11381SQt sQt) {
        this.A02 = sQt;
    }
}
