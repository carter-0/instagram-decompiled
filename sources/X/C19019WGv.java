package X;

import java.util.List;

/* renamed from: X.WGv  reason: case insensitive filesystem */
public final class C19019WGv implements X5s {
    public final String A00;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CmQ(X.W2K r7) {
        /*
            r6 = this;
            java.lang.String r1 = r7.A02
            int r0 = r1.hashCode()
            r5 = 0
            switch(r0) {
                case -1838656495: goto L_0x0059;
                case 72655: goto L_0x0041;
                case 2044650: goto L_0x002c;
                case 66988604: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            return r5
        L_0x000b:
            java.lang.String r0 = "FLOAT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = "INT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            long r0 = r7.A01
            double r3 = (double) r0
            goto L_0x0021
        L_0x001f:
            double r3 = r7.A00
        L_0x0021:
            java.lang.String r0 = r6.A00     // Catch:{ NumberFormatException -> 0x000a }
            double r1 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x000a }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x000a
            goto L_0x0072
        L_0x002c:
            java.lang.String r0 = "BOOL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000a
            boolean r1 = r7.A03
            java.lang.String r0 = r6.A00
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            boolean r5 = X.AnonymousClass7TF.A1S(r0, r1)
            return r5
        L_0x0041:
            java.lang.String r0 = "INT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000a
            long r0 = r7.A01()
            double r3 = (double) r0
            java.lang.String r0 = r6.A00     // Catch:{ NumberFormatException -> 0x000a }
            double r1 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x000a }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x000a
            goto L_0x0072
        L_0x0059:
            java.lang.String r0 = "STRING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000a
            java.lang.String r2 = r7.toString()
            java.lang.String r1 = r6.A00
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r2.toLowerCase(r0)
            boolean r5 = r1.equals(r0)
            return r5
        L_0x0072:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19019WGv.CmQ(X.W2K):boolean");
    }

    public final String getName() {
        return this.A00;
    }

    public C19019WGv(String str, List list) {
        if (list == null || list.isEmpty()) {
            this.A00 = str;
            return;
        }
        throw new C16687V1q("Mismatching number of values", str);
    }
}
