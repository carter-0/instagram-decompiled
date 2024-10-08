package X;

public final class S7Z {
    public final C269434f7 A00;
    public final S7Z A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.S7Z A00() {
        /*
            r4 = this;
            X.S7Z r0 = r4.A01
            if (r0 != 0) goto L_0x0005
            return r4
        L_0x0005:
            X.S7Z r3 = r0.A00()
            X.4f7 r1 = r4.A00
            r2 = 0
            X.4f7 r0 = r3.A00
            if (r1 == 0) goto L_0x0017
            if (r0 != 0) goto L_0x0022
        L_0x0012:
            X.S7Z r3 = r4.A05(r2)
        L_0x0016:
            return r3
        L_0x0017:
            if (r0 != 0) goto L_0x0016
            boolean r1 = r4.A05
            boolean r0 = r3.A05
            if (r1 == r0) goto L_0x0022
            if (r1 == 0) goto L_0x0016
            goto L_0x0012
        L_0x0022:
            X.S7Z r3 = r4.A05(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S7Z.A00():X.S7Z");
    }

    public final S7Z A01() {
        S7Z A012;
        boolean z = this.A03;
        S7Z s7z = this.A01;
        if (z) {
            if (s7z == null) {
                return null;
            }
            return s7z.A01();
        } else if (s7z == null || (A012 = s7z.A01()) == s7z) {
            return this;
        } else {
            return A05(A012);
        }
    }

    public final S7Z A02() {
        if (this.A01 == null) {
            return this;
        }
        return new S7Z(this.A00, (S7Z) null, this.A02, this.A04, this.A05, this.A03);
    }

    public final S7Z A03() {
        S7Z A032;
        S7Z s7z = this.A01;
        if (s7z == null) {
            A032 = null;
        } else {
            A032 = s7z.A03();
        }
        if (this.A05) {
            return A05(A032);
        }
        return A032;
    }

    public final S7Z A04(S7Z s7z) {
        S7Z s7z2 = this.A01;
        if (s7z2 != null) {
            s7z = s7z2.A04(s7z);
        }
        return A05(s7z);
    }

    public final S7Z A05(S7Z s7z) {
        S7Z s7z2 = s7z;
        if (s7z == this.A01) {
            return this;
        }
        return new S7Z(this.A00, s7z2, this.A02, this.A04, this.A05, this.A03);
    }

    public final String toString() {
        String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", new Object[]{this.A02.toString(), Boolean.valueOf(this.A05), Boolean.valueOf(this.A03), Boolean.valueOf(this.A04)});
        S7Z s7z = this.A01;
        if (s7z != null) {
            return 002.A0g(format, ", ", s7z.toString());
        }
        return format;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.A02() != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public S7Z(X.C269434f7 r3, X.S7Z r4, java.lang.Object r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A02 = r5
            r2.A01 = r4
            if (r3 == 0) goto L_0x0010
            boolean r1 = r3.A02()
            r0 = r3
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r2.A00 = r0
            if (r6 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r3.A02
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0022
            r6 = 0
        L_0x0022:
            r2.A04 = r6
            r2.A05 = r7
            r2.A03 = r8
            return
        L_0x0029:
            java.lang.String r0 = "Cannot pass true for 'explName' if name is null/empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S7Z.<init>(X.4f7, X.S7Z, java.lang.Object, boolean, boolean, boolean):void");
    }
}
