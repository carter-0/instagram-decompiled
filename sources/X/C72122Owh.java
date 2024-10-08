package X;

/* renamed from: X.Owh  reason: case insensitive filesystem */
public final class C72122Owh implements AnonymousClass67Q {
    public final int A00;
    public final Object A01;

    public C72122Owh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x012a, code lost:
        if (r3.EJd(new X.C67192Mjo(r6, r1, r4, r2)) != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x012c, code lost:
        r2.cancel(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0130, code lost:
        X.C3030067a.A02(r6);
        X.C3030067a.A03(r9, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0136, code lost:
        r9 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x016b, code lost:
        X.C66582MXn.A1E(r4, new X.C71723Oph(r1, (java.lang.Object) r3, (java.lang.Object) r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0173, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01ac, code lost:
        com.facebook.msys.mci.PlatformLogger.platformEventLog(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0074, code lost:
        r4.addResultCallback(new X.C71721Opf(r11, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Eyr(X.AnonymousClass67Z r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0174;
                case 1: goto L_0x0152;
                case 2: goto L_0x0138;
                case 3: goto L_0x0103;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00b3;
                case 6: goto L_0x0098;
                case 7: goto L_0x007d;
                case 8: goto L_0x0055;
                case 9: goto L_0x0035;
                case 10: goto L_0x0025;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r10.A01
            X.OeR r3 = (X.C71153OeR) r3
            com.instagram.common.session.UserSession r0 = r3.A0h
            X.1NY r2 = X.DbZ.A0M(r0)
            java.lang.String r0 = "users/get_message_settings_v2/"
            r2.A0A(r0)
            java.lang.Class<X.NHW> r1 = X.NHW.class
            java.lang.Class<X.ORD> r0 = X.ORD.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r0 = 16
            X.NMH.A00(r1, r3, r11, r0)
            X.1ES.A03(r1)
            return
        L_0x0025:
            java.lang.Object r0 = r10.A01
            X.PPZ r0 = (X.PPZ) r0
            X.7eL r2 = r0.A00
            r1 = 2
            X.PPb r0 = new X.PPb
            r0.<init>(r11, r1)
            r2.EcJ(r0)
            return
        L_0x0035:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r3 = r10.A01
            com.facebook.msys.mca.MailboxFeature r3 = (com.facebook.msys.mca.MailboxFeature) r3
            X.68J r1 = r3.mMailboxApiHandleMetaProvider
            r0 = 3
            X.68L r2 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r4 = X.C66580MXl.A0G(r2)
            r1 = 38
            X.Oph r0 = new X.Oph
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r4)
            X.C66582MXn.A1E(r2, r0, r4)
            r1 = 27
            goto L_0x0074
        L_0x0055:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r3 = r10.A01
            com.facebook.msys.mca.MailboxFeature r3 = (com.facebook.msys.mca.MailboxFeature) r3
            X.68J r1 = r3.mMailboxApiHandleMetaProvider
            r0 = 3
            X.68L r2 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r4 = X.C66580MXl.A0G(r2)
            r1 = 42
            X.Oph r0 = new X.Oph
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r4)
            X.C66582MXn.A1E(r2, r0, r4)
            r1 = 24
        L_0x0074:
            X.Opf r0 = new X.Opf
            r0.<init>((X.AnonymousClass67Z) r11, (int) r1)
            r4.addResultCallback(r0)
            return
        L_0x007d:
            r2 = 0
            X.0qQ.A0B(r11, r2)
            java.lang.Object r3 = r10.A01
            com.facebook.msys.mca.MailboxFeature r3 = (com.facebook.msys.mca.MailboxFeature) r3
            r1 = 23
            X.Opf r0 = new X.Opf
            r0.<init>((X.AnonymousClass67Z) r11, (int) r1)
            X.68L r4 = X.C66580MXl.A0F(r3, r2)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66581MXm.A0J(r4, r0)
            r1 = 41
            goto L_0x016b
        L_0x0098:
            r2 = 0
            X.0qQ.A0B(r11, r2)
            java.lang.Object r3 = r10.A01
            com.facebook.msys.mca.MailboxFeature r3 = (com.facebook.msys.mca.MailboxFeature) r3
            r1 = 22
            X.Opf r0 = new X.Opf
            r0.<init>((X.AnonymousClass67Z) r11, (int) r1)
            X.68L r4 = X.C66580MXl.A0F(r3, r2)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66581MXm.A0J(r4, r0)
            r1 = 32
            goto L_0x016b
        L_0x00b3:
            java.lang.Object r4 = r10.A01
            com.facebook.msys.mca.MailboxFeature r4 = (com.facebook.msys.mca.MailboxFeature) r4
            X.Oo7 r0 = new X.Oo7
            r0.<init>(r11)
            X.68L r3 = X.C66581MXm.A0I(r4)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66580MXl.A0G(r3)
            java.lang.String r8 = "MailboxInstagramSecureMessage"
            java.lang.String r7 = "insertRTCE2eeAdminMessages"
            int r6 = X.C3030067a.A00(r2)
            com.facebook.msys.mci.TraceInfo r9 = X.C66580MXl.A0I(r0, r2, r8, r7)
            r1 = 6
            goto L_0x0121
        L_0x00d2:
            java.lang.Object r5 = r10.A01
            com.facebook.msys.mca.MailboxFeature r5 = (com.facebook.msys.mca.MailboxFeature) r5
            r0 = 7
            X.Opf r1 = new X.Opf
            r1.<init>((X.AnonymousClass67Z) r11, (int) r0)
            X.68J r0 = r5.mMailboxApiHandleMetaProvider
            r4 = 0
            X.68L r3 = r0.ASa(r4)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66580MXl.A0G(r3)
            java.lang.String r8 = "MailboxInstagramSecureMessage"
            java.lang.String r7 = "loadInstagramSecureCutoverThreadList"
            int r6 = X.C3030067a.A00(r2)
            com.facebook.msys.mci.TraceInfo r9 = X.C66580MXl.A0I(r1, r2, r8, r7)
            r1 = 3
            X.Mjo r0 = new X.Mjo
            r0.<init>(r6, r1, r5, r2)
            boolean r0 = r3.EJd(r0)
            if (r0 != 0) goto L_0x0136
            r2.cancel(r4)
            goto L_0x0130
        L_0x0103:
            java.lang.Object r4 = r10.A01
            com.facebook.msys.mca.MailboxFeature r4 = (com.facebook.msys.mca.MailboxFeature) r4
            X.Oo7 r0 = new X.Oo7
            r0.<init>(r11)
            X.68L r3 = X.C66581MXm.A0I(r4)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66580MXl.A0G(r3)
            java.lang.String r8 = "MailboxInstagramSecureMessage"
            java.lang.String r7 = "insertRTCE2eeXma"
            int r6 = X.C3030067a.A00(r2)
            com.facebook.msys.mci.TraceInfo r9 = X.C66580MXl.A0I(r0, r2, r8, r7)
            r1 = 7
        L_0x0121:
            X.Mjo r0 = new X.Mjo
            r0.<init>(r6, r1, r4, r2)
            boolean r0 = r3.EJd(r0)
            if (r0 != 0) goto L_0x0136
            r0 = 0
            r2.cancel(r0)
        L_0x0130:
            X.C3030067a.A02(r6)
            X.C3030067a.A03(r9, r8, r7)
        L_0x0136:
            r9 = 5
            goto L_0x01ac
        L_0x0138:
            java.lang.Object r3 = r10.A01
            com.facebook.msys.mca.MailboxFeature r3 = (com.facebook.msys.mca.MailboxFeature) r3
            X.MYb r0 = X.MYb.A0M
            r0 = 64
            X.Opg r2 = X.C71722Opg.A00(r11, r0)
            X.68J r1 = r3.mMailboxApiHandleMetaProvider
            r0 = 0
            X.68L r4 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66581MXm.A0J(r4, r2)
            r1 = 16
            goto L_0x016b
        L_0x0152:
            java.lang.Object r3 = r10.A01
            com.facebook.msys.mca.MailboxFeature r3 = (com.facebook.msys.mca.MailboxFeature) r3
            X.MYb r0 = X.MYb.A0M
            r0 = 62
            X.Opg r2 = X.C71722Opg.A00(r11, r0)
            X.68J r1 = r3.mMailboxApiHandleMetaProvider
            r0 = 0
            X.68L r4 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66581MXm.A0J(r4, r2)
            r1 = 40
        L_0x016b:
            X.Oph r0 = new X.Oph
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r2)
            X.C66582MXn.A1E(r4, r0, r2)
            return
        L_0x0174:
            java.lang.Object r8 = r10.A01
            com.facebook.msys.mca.MailboxFeature r8 = (com.facebook.msys.mca.MailboxFeature) r8
            X.MYb r0 = X.MYb.A0M
            r0 = 70
            X.Opg r1 = X.C71722Opg.A00(r11, r0)
            X.68J r0 = r8.mMailboxApiHandleMetaProvider
            r7 = 0
            X.68L r6 = r0.ASa(r7)
            com.facebook.msys.mca.MailboxFutureImpl r5 = X.C66580MXl.A0G(r6)
            java.lang.String r4 = "MailboxInstagramSecureMessage"
            java.lang.String r3 = "runInstagramSecurePendingThreadUnreadCount"
            int r2 = X.C3030067a.A00(r5)
            com.facebook.msys.mci.TraceInfo r1 = X.C66580MXl.A0I(r1, r5, r4, r3)
            r9 = 5
            X.Mjo r0 = new X.Mjo
            r0.<init>(r2, r9, r8, r5)
            boolean r0 = r6.EJd(r0)
            if (r0 != 0) goto L_0x01ac
            r5.cancel(r7)
            X.C3030067a.A02(r2)
            X.C3030067a.A03(r1, r4, r3)
        L_0x01ac:
            com.facebook.msys.mci.PlatformLogger.platformEventLog(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72122Owh.Eyr(X.67Z):void");
    }
}
