package X;

import android.os.Build;

/* renamed from: X.7xv  reason: invalid class name and case insensitive filesystem */
public final class C348127xv {
    public static C348127xv A03 = new C348127xv(Build.MANUFACTURER, Build.MODEL);
    public static C348127xv A04 = new C348127xv(Build.PRODUCT);
    public final String A00;
    public final String A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r6.A01.isEmpty() != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C348127xv
            r5 = 0
            if (r0 == 0) goto L_0x0040
            X.7xv r7 = (X.C348127xv) r7
            java.lang.String r4 = r6.A00
            boolean r0 = r4.isEmpty()
            r2 = 1
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r6.A01
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            java.lang.String r3 = r7.A00
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = r7.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0052
        L_0x002a:
            if (r1 == 0) goto L_0x0041
            if (r2 == 0) goto L_0x0041
            r1 = 58
            java.lang.String r0 = r6.A01
            java.lang.String r2 = X.002.A0T(r4, r0, r1)
            java.lang.String r0 = r7.A01
            java.lang.String r1 = X.002.A0T(r3, r0, r1)
        L_0x003c:
            boolean r5 = r2.equals(r1)
        L_0x0040:
            return r5
        L_0x0041:
            java.lang.String r2 = r6.A02
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0040
            java.lang.String r1 = r7.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0040
            goto L_0x003c
        L_0x0052:
            r2 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C348127xv.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str;
        String str2 = this.A00;
        if (!str2.isEmpty()) {
            String str3 = this.A01;
            if (!str3.isEmpty()) {
                str = 002.A0T(str2, str3, ':');
                return str.hashCode();
            }
        }
        str = this.A02;
        return str.hashCode();
    }

    public C348127xv(String str, String str2) {
        this.A02 = "";
        this.A00 = str;
        this.A01 = str2;
    }

    public C348127xv(String str) {
        this.A02 = str;
        this.A00 = "";
        this.A01 = "";
    }
}
