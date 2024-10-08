package X;

/* renamed from: X.I0y  reason: case insensitive filesystem */
public final class C56544I0y {
    public static final C56544I0y A03 = new C56544I0y("");
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if ("".length() != 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56544I0y(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            r4.<init>()
            r4.A00 = r5
            int r0 = r5.length()
            r2 = 1
            if (r0 != 0) goto L_0x0015
            int r1 = r3.length()
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r4.A02 = r0
            boolean r0 = X.C55284HfD.A00(r5)
            if (r0 != 0) goto L_0x0025
            boolean r0 = X.C55284HfD.A00(r3)
            if (r0 != 0) goto L_0x0025
            r2 = 0
        L_0x0025:
            r4.A01 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56544I0y.<init>(java.lang.String):void");
    }

    public final void A00(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("prefix = \"");
        sb.append(this.A00);
        sb.append("\",");
        sb.append(10);
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append(10);
        sb.append(str);
        C51975G9x.A1G(sb, "removeLeadingZeros = ");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NumberHexFormat(");
        A1A.append(10);
        A00(A1A, "    ");
        A1A.append(10);
        String A0l = AnonymousClass7TF.A0l(")", A1A);
        0qQ.A07(A0l);
        return A0l;
    }
}
