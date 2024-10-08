package X;

/* renamed from: X.WQw  reason: case insensitive filesystem */
public final class C19237WQw implements AnonymousClass1FD {
    public static final C19237WQw A00 = new C19237WQw();

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.UKp] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r2 = 0
            java.lang.String r0 = ""
            X.UKp r1 = new X.UKp
            r1.<init>()
            r1.A07 = r0
            r1.A09 = r0
            r1.A06 = r2
            r1.A00 = r2
            r1.A08 = r2
            r1.A04 = r2
            r1.A03 = r2
            r1.A05 = r2
            r1.A01 = r2
            r1.A02 = r2
            X.16L r2 = r4.A11()
            X.16L r0 = X.16L.A0D
            if (r2 == r0) goto L_0x0030
            java.lang.String r1 = "JSON string for User should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0030:
            X.16L r2 = r4.A1J()
            X.16L r0 = X.16L.A09
            if (r2 == r0) goto L_0x0117
            java.lang.String r2 = X.AnonymousClass7TE.A17(r4)
            if (r2 == 0) goto L_0x0112
            int r0 = r2.hashCode()
            switch(r0) {
                case -1677176261: goto L_0x0052;
                case -265713450: goto L_0x0061;
                case -227009660: goto L_0x007c;
                case 3355: goto L_0x008f;
                case 1185812334: goto L_0x00a8;
                case 1490300194: goto L_0x00b7;
                case 1565553213: goto L_0x00c6;
                case 1757470412: goto L_0x00d6;
                case 1782139044: goto L_0x00ee;
                case 1958764699: goto L_0x00fe;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r2 = X.C13988Tno.A0g(r2)
            java.lang.String r0 = "UserJsonHelper"
            X.0KC.A0C(r0, r2)
        L_0x004e:
            r4.A0z()
            goto L_0x0030
        L_0x0052:
            java.lang.String r0 = "full_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r1.A06 = r0
            goto L_0x004e
        L_0x0061:
            java.lang.String r0 = X.Dbe.A01()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.16L r2 = r4.A11()
            X.16L r0 = X.16L.A0G
            if (r2 == r0) goto L_0x004e
            java.lang.String r0 = r4.A1P()
            if (r0 == 0) goto L_0x004e
            r1.A09 = r0
            goto L_0x004e
        L_0x007c:
            r0 = 3435(0xd6b, float:4.813E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)
            r1.A02 = r0
            goto L_0x004e
        L_0x008f:
            java.lang.String r0 = "id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.16L r2 = r4.A11()
            X.16L r0 = X.16L.A0G
            if (r2 == r0) goto L_0x004e
            java.lang.String r0 = r4.A1P()
            if (r0 == 0) goto L_0x004e
            r1.A07 = r0
            goto L_0x004e
        L_0x00a8:
            java.lang.String r0 = "is_private"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)
            r1.A03 = r0
            goto L_0x004e
        L_0x00b7:
            java.lang.String r0 = "charity_id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r1.A05 = r0
            goto L_0x004e
        L_0x00c6:
            java.lang.String r0 = "is_verified"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)
            r1.A04 = r0
            goto L_0x004e
        L_0x00d6:
            r0 = 1407(0x57f, float:1.972E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            X.WQv r0 = X.C19236WQv.A00
            java.lang.Object r0 = X.16P.A01(r4, r0)
            X.GnJ r0 = (X.C53387GnJ) r0
            r1.A00 = r0
            goto L_0x004e
        L_0x00ee:
            java.lang.String r0 = "profile_pic_url"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = X.C13989Tnp.A0o(r4)
            r1.A08 = r0
            goto L_0x004e
        L_0x00fe:
            r0 = 3427(0xd63, float:4.802E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)
            r1.A01 = r0
            goto L_0x004e
        L_0x0112:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0117:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19237WQw.invoke(X.16F):java.lang.Object");
    }
}
