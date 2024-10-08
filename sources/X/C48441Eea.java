package X;

/* renamed from: X.Eea  reason: case insensitive filesystem */
public abstract class C48441Eea {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c6, code lost:
        r6.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e8, code lost:
        r1 = r2.getString(r0);
        r0 = r3.A00;
        r0.A0U = r1;
        X.C46649DiU.A07(r2, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        X.0wb.A03("SafetyCheckUtil", "Invalid Safety Option Selected.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r8, X.AnonymousClass6Tm r9) {
        /*
            r3 = 0
            r7 = 1
            java.lang.Object r1 = r9.A03(r3)
            boolean r0 = r1 instanceof java.lang.String
            r4 = 0
            if (r0 == 0) goto L_0x0100
            java.lang.String r1 = (java.lang.String) r1
        L_0x000d:
            com.instagram.common.session.UserSession r5 = X.DbT.A0Z(r8)
            if (r1 == 0) goto L_0x002b
            androidx.fragment.app.FragmentActivity r2 = X.C308206Td.A04(r8)
            X.0qQ.A0B(r5, r3)
            X.0qQ.A0B(r2, r7)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1102697448: goto L_0x002c;
                case -385502252: goto L_0x006e;
                case -250538715: goto L_0x008a;
                case -54704478: goto L_0x009f;
                case 763636605: goto L_0x00ca;
                case 1950650808: goto L_0x00f4;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.String r1 = "SafetyCheckUtil"
            java.lang.String r0 = "Invalid Safety Option Selected."
            X.0wb.A03(r1, r0)
        L_0x002b:
            return r4
        L_0x002c:
            java.lang.String r0 = "limits"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = "step"
            java.lang.String r0 = "0"
            X.0eP r7 = X.AnonymousClass7TE.A1L(r1, r0)
            X.1Av r6 = X.1Au.A00(r5)
            X.0s0 r3 = r6.A6I
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 261(0x105, float:3.66E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r6, r3, r1, r0)
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = "False"
        L_0x004e:
            r0 = 3229(0xc9d, float:4.525E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.HashMap r1 = X.Dbb.A0e(r0, r1, r7)
            r0 = 557(0x22d, float:7.8E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DiU r6 = X.C46649DiU.A04(r0, r1)
            X.F1e r3 = new X.F1e
            r3.<init>(r5)
            r0 = 2131965055(0x7f13347f, float:1.956691E38)
            goto L_0x00e8
        L_0x006b:
            java.lang.String r1 = "True"
            goto L_0x004e
        L_0x006e:
            java.lang.String r0 = "hidden_words"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            X.6Yo r6 = X.DbU.A0Q(r2, r5)
            X.1ZQ r0 = X.C48883Elj.A00()
            X.1ZR r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            androidx.fragment.app.Fragment r0 = r1.A00(r2, r5, r0)
            r6.A0B(r4, r0)
            goto L_0x00c6
        L_0x008a:
            java.lang.String r0 = "message_control"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r0 = new com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment
            r0.<init>()
            X.6Yo r6 = X.DbU.A0Q(r2, r5)
            r6.A0B(r4, r0)
            goto L_0x00c6
        L_0x009f:
            java.lang.String r0 = "two_factor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            X.F3Y r1 = X.FFR.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.E2h r3 = r1.A02(r0, r3, r3)
            X.6Yo r6 = X.DbS.A0M(r2, r5)
            r2 = 60
            r1 = 24
            r0 = 43
            java.lang.String r0 = X.Dbp.A02(r2, r1, r0)
            r6.A0A = r0
            r6.A0B(r4, r3)
            r6.A0F = r7
        L_0x00c6:
            r6.A04()
            return r4
        L_0x00ca:
            java.lang.String r0 = "comment_control"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            r0 = 74
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DiU r6 = X.C46649DiU.A04(r0, r1)
            X.F1e r3 = new X.F1e
            r3.<init>(r5)
            r0 = 2131956382(0x7f13129e, float:1.9549318E38)
        L_0x00e8:
            java.lang.String r1 = r2.getString(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r3.A00
            r0.A0U = r1
            X.C46649DiU.A07(r2, r0, r6)
            return r4
        L_0x00f4:
            java.lang.String r0 = "tag_control"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            X.C49242Erl.A00(r2, r5)
            return r4
        L_0x0100:
            r1 = r4
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48441Eea.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
