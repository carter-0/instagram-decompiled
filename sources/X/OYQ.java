package X;

public final class OYQ {
    public static final 0xG A00 = DbS.A0O("SendErrorNotifier");
    public static final OYQ A01 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (r8.length() != 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ed, code lost:
        if (r15 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ef, code lost:
        r10 = r15.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f1, code lost:
        X.0nY.A00().ATE(new X.NSX(r5, r6, r7, r8, r9, r10, r11, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r13, com.instagram.common.session.UserSession r14, X.C270214gN r15, java.util.List r16, boolean r17, boolean r18, boolean r19) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r6 = r14
            X.2Dm r2 = X.1bJ.A00(r14)
            java.util.Iterator r1 = r16.iterator()
        L_0x000d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.next()
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x000d
            X.3U9 r0 = X.C66580MXl.A0d(r2, r0)
            if (r0 == 0) goto L_0x000d
            r3.add(r0)
            goto L_0x000d
        L_0x0027:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x010d
            int r1 = r3.size()
            r0 = 1
            r10 = 0
            if (r1 != r0) goto L_0x0064
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            X.2Ep r0 = (X.AnonymousClass2Ep) r0
            java.lang.String r9 = r0.C6C()
            java.util.List r12 = r0.BRZ()
            java.util.List r0 = r0.BRZ()
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0050:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r1.next()
            X.171 r0 = (X.AnonymousClass171) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            r11.add(r0)
            goto L_0x0050
        L_0x0064:
            r9 = r10
            r11 = r10
            r12 = r10
        L_0x0067:
            r4 = 0
            if (r15 == 0) goto L_0x0079
            boolean r0 = r15.A0A
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = r15.A02
            if (r0 == 0) goto L_0x0079
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0079
            r4 = 1
        L_0x0079:
            boolean r1 = X.DbT.A1b(r3)
            java.lang.String r0 = "Thread summaries cannot be empty"
            X.17k.A0G(r1, r0)
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.util.Iterator r3 = r3.iterator()
        L_0x008a:
            boolean r0 = r3.hasNext()
            r5 = r13
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r1 = r3.next()
            X.2Es r1 = (X.AnonymousClass2Es) r1
            java.lang.String r0 = r2.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = ", "
            r2.append(r0)
        L_0x00a6:
            java.lang.String r0 = X.AnonymousClass48N.A07(r13, r14, r1)
            r2.append(r0)
            goto L_0x008a
        L_0x00ae:
            java.lang.String r7 = r2.toString()
            X.0qQ.A07(r7)
            if (r4 == 0) goto L_0x00c6
            r0 = 2131959252(0x7f131dd4, float:1.955514E38)
            if (r18 == 0) goto L_0x00bf
            r0 = 2131959255(0x7f131dd7, float:1.9555145E38)
        L_0x00bf:
            java.lang.String r7 = X.DbW.A0h(r13, r7, r0)
            X.0qQ.A0A(r7)
        L_0x00c6:
            r1 = 0
            if (r15 == 0) goto L_0x00e4
            boolean r0 = r15.A0A
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = r15.A02
            if (r0 == 0) goto L_0x00d8
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00d8
            r1 = 1
        L_0x00d8:
            java.lang.String r8 = r15.A02
            if (r1 == 0) goto L_0x00e4
            if (r8 == 0) goto L_0x00e4
            int r0 = r8.length()
            if (r0 != 0) goto L_0x00ef
        L_0x00e4:
            if (r17 != 0) goto L_0x00fe
            r0 = 2131959250(0x7f131dd2, float:1.9555135E38)
        L_0x00e9:
            java.lang.String r8 = X.C51967G9n.A0p(r13, r0)
            if (r15 == 0) goto L_0x00f1
        L_0x00ef:
            java.lang.String r10 = r15.A06
        L_0x00f1:
            X.0nO r0 = X.0nY.A00()
            X.NSX r4 = new X.NSX
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.ATE(r4)
            return
        L_0x00fe:
            if (r18 == 0) goto L_0x0104
            r0 = 2131959253(0x7f131dd5, float:1.9555141E38)
            goto L_0x00e9
        L_0x0104:
            r0 = 2131959251(0x7f131dd3, float:1.9555137E38)
            if (r19 == 0) goto L_0x00e9
            r0 = 2131959254(0x7f131dd6, float:1.9555143E38)
            goto L_0x00e9
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OYQ.A00(android.content.Context, com.instagram.common.session.UserSession, X.4gN, java.util.List, boolean, boolean, boolean):void");
    }
}
