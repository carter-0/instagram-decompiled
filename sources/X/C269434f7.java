package X;

import java.io.Serializable;

/* renamed from: X.4f7  reason: invalid class name and case insensitive filesystem */
public final class C269434f7 implements Serializable {
    public static final C269434f7 A03 = new C269434f7(new String(""), (String) null);
    public static final C269434f7 A04 = new C269434f7("", (String) null);
    public 15z A00;
    public final String A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r4) goto L_0x0031
            r2 = 0
            if (r5 == 0) goto L_0x001a
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x001a
            X.4f7 r5 = (X.C269434f7) r5
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 != 0) goto L_0x001b
            if (r0 == 0) goto L_0x0022
        L_0x001a:
            return r2
        L_0x001b:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
            return r2
        L_0x0022:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 != 0) goto L_0x002c
            if (r0 == 0) goto L_0x0031
            r3 = 0
            return r3
        L_0x002c:
            boolean r2 = r1.equals(r0)
            return r2
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269434f7.equals(java.lang.Object):boolean");
    }

    public static C269434f7 A00(String str) {
        if (str == null || str.isEmpty()) {
            return A04;
        }
        return new C269434f7(16O.A01.A00(str), (String) null);
    }

    public static C269434f7 A01(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 != null || !str.isEmpty()) {
            return new C269434f7(16O.A01.A00(str), str2);
        }
        return A04;
    }

    public final boolean A02() {
        if (this.A01 != null || !this.A02.isEmpty()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        if (str == null) {
            return this.A02.hashCode();
        }
        return str.hashCode() ^ this.A02.hashCode();
    }

    public final String toString() {
        String str = this.A01;
        if (str == null) {
            return this.A02;
        }
        return 002.A0u("{", str, "}", this.A02);
    }

    public C269434f7(String str, String str2) {
        C269584fM[] r0 = C269574fL.A01;
        this.A02 = str == null ? "" : str;
        this.A01 = str2;
    }
}
