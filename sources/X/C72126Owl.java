package X;

/* renamed from: X.Owl  reason: case insensitive filesystem */
public final class C72126Owl implements AnonymousClass67Q {
    public final int A00;
    public final long A01;
    public final Object A02;

    public C72126Owl(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01bf, code lost:
        r11 = new X.C71724Opi(r8, r13, r9, r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01cd, code lost:
        if (r5.EJd(r6) != false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01cf, code lost:
        r8.cancel(r10);
        X.C3030067a.A02(r9);
        X.C3030067a.A03(r3, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01d8, code lost:
        r9 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0214, code lost:
        com.facebook.msys.mci.PlatformLogger.platformEventLog(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0217, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        r2 = new X.C71661Oog(r3, r4, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0033, code lost:
        X.C66582MXn.A1E(r0, r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Eyr(X.AnonymousClass67Z r19) {
        /*
            r18 = this;
            r4 = r18
            int r0 = r4.A00
            r2 = r19
            switch(r0) {
                case 0: goto L_0x01da;
                case 1: goto L_0x0198;
                case 2: goto L_0x0170;
                case 3: goto L_0x014b;
                case 4: goto L_0x00eb;
                case 5: goto L_0x0056;
                case 6: goto L_0x00ca;
                case 7: goto L_0x00a4;
                case 8: goto L_0x007e;
                case 9: goto L_0x0037;
                default: goto L_0x0009;
            }
        L_0x0009:
            r3 = 0
            java.lang.String r1 = "FBLegacyBroker"
            java.lang.String r0 = "329756131545874"
            com.facebook.msys.mci.PrivacyContext r7 = com.facebook.msys.mci.PrivacyContextCoding.newPrivacyContextNative(r3, r1, r0)
            X.0qQ.A07(r7)
            java.lang.Object r6 = r4.A02
            com.facebook.msys.mca.MailboxFeature r6 = (com.facebook.msys.mca.MailboxFeature) r6
            long r4 = r4.A01
            r0 = 39
            X.Opf r3 = new X.Opf
            r3.<init>((X.AnonymousClass67Z) r2, (int) r0)
            X.68J r1 = r6.mMailboxApiHandleMetaProvider
            r0 = 0
            X.68L r0 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66581MXm.A0J(r0, r3)
            r3 = 1
        L_0x002e:
            X.Oog r2 = new X.Oog
            r2.<init>(r3, r4, r6, r7, r8)
        L_0x0033:
            X.C66582MXn.A1E(r0, r2, r8)
            return
        L_0x0037:
            java.lang.Object r6 = r4.A02
            com.facebook.msys.mca.MailboxFeature r6 = (com.facebook.msys.mca.MailboxFeature) r6
            long r4 = r4.A01
            X.Oo7 r3 = new X.Oo7
            r3.<init>(r2)
            X.68J r1 = r6.mMailboxApiHandleMetaProvider
            r0 = 0
            X.68L r0 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66581MXm.A0J(r0, r3)
            r7 = 11
            X.Opc r2 = new X.Opc
            r3 = r2
            r3.<init>((long) r4, (java.lang.Object) r6, (int) r7, (java.lang.Object) r8)
            goto L_0x0033
        L_0x0056:
            java.lang.Object r6 = r4.A02
            com.facebook.msys.mca.MailboxFeature r6 = (com.facebook.msys.mca.MailboxFeature) r6
            long r4 = r4.A01
            r0 = 681066249448173(0x26b6d17ddeaed, double:3.36491436394287E-309)
            java.lang.String r3 = java.lang.Long.toString(r0)
            r1 = 0
            java.lang.String r0 = "FBLegacyBroker"
            com.facebook.msys.mci.PrivacyContext r7 = com.facebook.msys.mci.PrivacyContextCoding.newPrivacyContextNative(r1, r0, r3)
            X.Oo7 r3 = new X.Oo7
            r3.<init>(r2)
            X.68J r1 = r6.mMailboxApiHandleMetaProvider
            r0 = 0
            X.68L r0 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66581MXm.A0J(r0, r3)
            r3 = 3
            goto L_0x002e
        L_0x007e:
            java.lang.Object r13 = r4.A02
            X.NAb r13 = (X.C68314NAb) r13
            long r0 = r4.A01
            X.Oo7 r3 = new X.Oo7
            r3.<init>(r2)
            X.68J r2 = r13.mMailboxApiHandleMetaProvider
            r10 = 0
            X.68L r5 = r2.ASa(r10)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r5)
            java.lang.String r4 = "MailboxTam"
            java.lang.String r2 = "runTamClientParticipantLeaveThread"
            int r9 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r4, r2)
            r15 = 13
            goto L_0x01bf
        L_0x00a4:
            java.lang.Object r13 = r4.A02
            X.NAb r13 = (X.C68314NAb) r13
            long r0 = r4.A01
            X.Oo7 r3 = new X.Oo7
            r3.<init>(r2)
            X.68J r2 = r13.mMailboxApiHandleMetaProvider
            r10 = 0
            X.68L r5 = r2.ASa(r10)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r5)
            java.lang.String r4 = "MailboxTam"
            java.lang.String r2 = "runTamClientVisualMessageOpened"
            int r9 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r4, r2)
            r15 = 22
            goto L_0x01bf
        L_0x00ca:
            java.lang.Object r6 = r4.A02
            X.NAa r6 = (X.C68313NAa) r6
            long r4 = r4.A01
            X.Oo7 r3 = new X.Oo7
            r3.<init>(r2)
            X.68J r1 = r6.mMailboxApiHandleMetaProvider
            r0 = 0
            X.68L r0 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66581MXm.A0J(r0, r3)
            r7 = 10
            X.Opc r3 = new X.Opc
            r3.<init>((long) r4, (java.lang.Object) r6, (int) r7, (java.lang.Object) r8)
            X.C66582MXn.A1E(r0, r3, r8)
            return
        L_0x00eb:
            java.lang.Object r6 = r4.A02
            android.util.Pair r6 = (android.util.Pair) r6
            long r12 = r4.A01
            java.lang.Object r9 = r6.first
            X.NAb r9 = (X.C68314NAb) r9
            X.Oo7 r1 = new X.Oo7
            r1.<init>(r2)
            X.68J r0 = r9.mMailboxApiHandleMetaProvider
            r4 = 0
            X.68L r0 = r0.ASa(r4)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r0)
            java.lang.String r5 = "MailboxTam"
            java.lang.String r3 = "runTamTransportHybridThreadUnmute"
            int r10 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r1 = X.C66580MXl.A0I(r1, r8, r5, r3)
            r11 = 20
            X.Opi r7 = new X.Opi
            r7.<init>((com.facebook.msys.mca.MailboxFutureImpl) r8, (X.C68314NAb) r9, (int) r10, (int) r11, (long) r12)
            boolean r0 = r0.EJd(r7)
            if (r0 != 0) goto L_0x0127
            r8.cancel(r4)
            X.C3030067a.A02(r10)
            X.C3030067a.A03(r1, r5, r3)
        L_0x0127:
            r0 = 5
            com.facebook.msys.mci.PlatformLogger.platformEventLog(r0)
            java.lang.Object r14 = r6.second
            X.NAa r14 = (X.C68313NAa) r14
            X.Oo7 r3 = new X.Oo7
            r3.<init>(r2)
            X.68J r0 = r14.mMailboxApiHandleMetaProvider
            X.68L r1 = r0.ASa(r4)
            com.facebook.msys.mca.MailboxFutureImpl r0 = X.C66581MXm.A0J(r1, r3)
            r15 = 10
            X.Opc r11 = new X.Opc
            r16 = r0
            r11.<init>((long) r12, (java.lang.Object) r14, (int) r15, (java.lang.Object) r16)
            X.C66582MXn.A1E(r1, r11, r0)
            return
        L_0x014b:
            java.lang.Object r13 = r4.A02
            X.NAb r13 = (X.C68314NAb) r13
            long r0 = r4.A01
            X.Oo7 r3 = new X.Oo7
            r3.<init>(r2)
            X.68J r2 = r13.mMailboxApiHandleMetaProvider
            r10 = 0
            X.68L r5 = r2.ASa(r10)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r5)
            java.lang.String r4 = "MailboxTam"
            java.lang.String r2 = "runTamClientVisualMessageScreenshotted"
            int r9 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r4, r2)
            r15 = 23
            goto L_0x01bf
        L_0x0170:
            java.lang.Object r7 = r4.A02
            X.67N r7 = (X.AnonymousClass67N) r7
            long r11 = r4.A01
            X.MYb r0 = X.MYb.A0M
            r10 = 0
            X.OoO r0 = new X.OoO
            r0.<init>(r2, r11, r10)
            X.68L r5 = X.C66580MXl.A0F(r7, r10)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r5)
            java.lang.String r4 = "MailboxInstagramSecureMessage"
            java.lang.String r2 = "loadInstagramSecureFetchThreadInfoWithFbid"
            int r9 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r0, r8, r4, r2)
            X.Opi r6 = new X.Opi
            r6.<init>((X.AnonymousClass67N) r7, (com.facebook.msys.mca.MailboxFutureImpl) r8, (int) r9, (int) r10, (long) r11)
            goto L_0x01c9
        L_0x0198:
            java.lang.Object r13 = r4.A02
            X.NAb r13 = (X.C68314NAb) r13
            long r0 = r4.A01
            X.MYb r3 = X.MYb.A0M
            r3 = 48
            X.Opg r3 = X.C71722Opg.A00(r2, r3)
            X.68J r2 = r13.mMailboxApiHandleMetaProvider
            r10 = 0
            X.68L r5 = r2.ASa(r10)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r5)
            java.lang.String r4 = "MailboxTam"
            java.lang.String r2 = "fetchMessageDataForExternalForward"
            int r9 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r4, r2)
            r15 = 24
        L_0x01bf:
            X.Opi r6 = new X.Opi
            r11 = r6
            r12 = r8
            r14 = r9
            r16 = r0
            r11.<init>((com.facebook.msys.mca.MailboxFutureImpl) r12, (X.C68314NAb) r13, (int) r14, (int) r15, (long) r16)
        L_0x01c9:
            boolean r0 = r5.EJd(r6)
            if (r0 != 0) goto L_0x01d8
            r8.cancel(r10)
            X.C3030067a.A02(r9)
            X.C3030067a.A03(r3, r4, r2)
        L_0x01d8:
            r9 = 5
            goto L_0x0214
        L_0x01da:
            java.lang.Object r6 = r4.A02
            X.67N r6 = (X.AnonymousClass67N) r6
            long r10 = r4.A01
            X.MYb r0 = X.MYb.A0M
            r0 = 66
            X.Opg r1 = X.C71722Opg.A00(r2, r0)
            X.68J r0 = r6.mMailboxApiHandleMetaProvider
            r4 = 0
            X.68L r0 = r0.ASa(r4)
            com.facebook.msys.mca.MailboxFutureImpl r7 = X.C66580MXl.A0G(r0)
            java.lang.String r3 = "MailboxInstagramSecureMessage"
            java.lang.String r2 = "loadInstagramVisualMessageActionStatus"
            int r8 = X.C3030067a.A00(r7)
            com.facebook.msys.mci.TraceInfo r1 = X.C66580MXl.A0I(r1, r7, r3, r2)
            r9 = 5
            X.Opi r5 = new X.Opi
            r5.<init>((X.AnonymousClass67N) r6, (com.facebook.msys.mca.MailboxFutureImpl) r7, (int) r8, (int) r9, (long) r10)
            boolean r0 = r0.EJd(r5)
            if (r0 != 0) goto L_0x0214
            r7.cancel(r4)
            X.C3030067a.A02(r8)
            X.C3030067a.A03(r1, r3, r2)
        L_0x0214:
            com.facebook.msys.mci.PlatformLogger.platformEventLog(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72126Owl.Eyr(X.67Z):void");
    }
}
