package X;

/* renamed from: X.HVd  reason: case insensitive filesystem */
public abstract class C54846HVd {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        if (r9 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00be, code lost:
        if (r0.length() <= 0) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C299725vk A00(X.DT0 r12, com.instagram.common.session.UserSession r13, java.lang.String r14) {
        /*
            r5 = 0
            java.util.List r0 = r12.B1p()
            r11 = 0
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r3 = X.00k.A0J(r0)
            X.DTT r3 = (X.DTT) r3
            if (r3 == 0) goto L_0x00c1
            X.DTt r0 = r3.B1r()
            java.lang.String r10 = r0.AyC()
            X.0qQ.A0B(r10, r5)
            X.6CV r4 = X.AnonymousClass6CU.A00(r13)
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x0082
            com.instagram.common.session.UserSession r8 = r4.A05
            X.0Tu r7 = X.0Tu.A05
            r0 = 36885531325432431(0x830b320001026f, double:3.3898967640920256E-306)
            java.lang.String r2 = X.182.A04(r7, r8, r0)
            boolean r0 = r4.A01()
            r9 = 0
            if (r0 == 0) goto L_0x0082
            X.11S r0 = r4.A02
            if (r0 != 0) goto L_0x00ab
            r0 = 36889821997695843(0x830f1900000363, double:3.392610202508558E-306)
            java.lang.String r0 = X.182.A04(r7, r8, r0)     // Catch:{ Exception -> 0x007f }
            byte[] r1 = android.util.Base64.decode(r0, r5)     // Catch:{ Exception -> 0x007f }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x007f }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ Exception -> 0x007f }
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x007f }
            r6.<init>(r1, r0)     // Catch:{ Exception -> 0x007f }
            r0 = 36889821997761380(0x830f1900010364, double:3.3926102025500037E-306)
            java.lang.String r1 = X.182.A04(r7, r8, r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0j(r6)
            java.util.List r1 = X.DbV.A18(r0, r1)
            X.0qQ.A0B(r1, r5)
            X.XFR r0 = X.29b.A01()
            java.util.List r1 = X.00k.A0g(r1, r0)
            java.lang.String r0 = "|"
            java.lang.String r1 = X.DbT.A0z(r0, r1, r11)
            X.Nmz r0 = X.C69517Nmz.IGNORE_CASE
            X.11S r9 = new X.11S
            r9.<init>(r1, r0)
            r4.A02 = r9
        L_0x007f:
            r0 = r9
            if (r9 != 0) goto L_0x00ab
        L_0x0082:
            r2 = r11
        L_0x0083:
            X.DTt r0 = r3.B1r()
            java.lang.String r9 = r0.getId()
            int r12 = r3.getOffset()
            java.lang.Integer r0 = r3.BMP()
            if (r0 == 0) goto L_0x00a6
            int r13 = r0.intValue()
        L_0x0099:
            boolean r0 = X.0qQ.A0K(r14, r2)
            if (r0 == 0) goto L_0x00a0
            r11 = r14
        L_0x00a0:
            X.5vk r8 = new X.5vk
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x00a6:
            int r13 = r10.length()
            goto L_0x0099
        L_0x00ab:
            X.5gs r0 = r0.A05(r10)
            if (r0 == 0) goto L_0x0082
            java.util.regex.Matcher r0 = r0.A01
            java.lang.String r0 = r0.group()
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 > 0) goto L_0x0083
            goto L_0x0082
        L_0x00c1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54846HVd.A00(X.DT0, com.instagram.common.session.UserSession, java.lang.String):X.5vk");
    }
}
