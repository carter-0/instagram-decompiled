package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.Mjo  reason: case insensitive filesystem */
public final class C67192Mjo implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a4, code lost:
        r6 = 0;
        r7 = 1;
        r0 = X.AnonymousClass67N.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00ca, code lost:
        com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r3, r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0137, code lost:
        com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI.dispatchVOO(r0, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x013a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0065, code lost:
        com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchVOO(r0, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0068, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r12) {
        /*
            r11 = this;
            r3 = r12
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0115;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00a9;
                case 4: goto L_0x0087;
                case 5: goto L_0x0069;
                case 6: goto L_0x0042;
                case 7: goto L_0x001e;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r11.A02
            X.OMh r1 = (X.C70812OMh) r1
            java.lang.Object r0 = r11.A03
            com.facebook.msys.mca.MailboxCallback r0 = (com.facebook.msys.mca.MailboxCallback) r0
            X.NBV r2 = new X.NBV
            r2.<init>(r1, r0)
            X.68F r0 = r1.A03
            X.692 r0 = r0.A00
            com.facebook.msys.mci.AccountSession r1 = r0.A02
            r0 = 1
            com.facebook.msys.mci.Execution.executeAsync(r2, r1, r0)
            return
        L_0x001e:
            com.facebook.msys.mci.AccountSession r3 = (com.facebook.msys.mci.AccountSession) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "insertRTCE2eeXma"
            X.C3030067a.A04(r1, r0, r2)
            X.681 r1 = X.AnonymousClass67N.A00
            r0 = 13
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r3)
            r0 = 43
            com.facebook.msys.util.NotificationScope r1 = X.C71733Opt.A00(r1, r11, r2, r0)
            java.lang.Object r0 = r11.A03
            X.C66580MXl.A1N(r1, r0, r2)
            r0 = 6
            goto L_0x0065
        L_0x0042:
            com.facebook.msys.mci.AccountSession r3 = (com.facebook.msys.mci.AccountSession) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "insertRTCE2eeAdminMessages"
            X.C3030067a.A04(r1, r0, r2)
            X.681 r1 = X.AnonymousClass67N.A00
            r0 = 11
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r3)
            r0 = 42
            com.facebook.msys.util.NotificationScope r1 = X.C71733Opt.A00(r1, r11, r2, r0)
            java.lang.Object r0 = r11.A03
            X.C66580MXl.A1N(r1, r0, r2)
            r0 = 5
        L_0x0065:
            com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchVOO(r0, r3, r1)
            return
        L_0x0069:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "runInstagramSecurePendingThreadUnreadCount"
            X.C3030067a.A04(r1, r0, r2)
            java.lang.Object r4 = r11.A03
            com.facebook.msys.mca.MailboxFutureImpl r4 = (com.facebook.msys.mca.MailboxFutureImpl) r4
            com.facebook.msys.mca.MailboxNullable r5 = X.C66581MXm.A0K()
            r0 = 36
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxInstagramSecureMessage"
            java.lang.String r9 = "InstagramSecurePendingThreadUnreadCount"
            goto L_0x00a4
        L_0x0087:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "runInstagramSecurePendingThreadCount"
            X.C3030067a.A04(r1, r0, r2)
            java.lang.Object r4 = r11.A03
            com.facebook.msys.mca.MailboxFutureImpl r4 = (com.facebook.msys.mca.MailboxFutureImpl) r4
            com.facebook.msys.mca.MailboxNullable r5 = X.C66581MXm.A0K()
            r0 = 35
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxInstagramSecureMessage"
            java.lang.String r9 = "InstagramSecurePendingThreadCount"
        L_0x00a4:
            r6 = 0
            r7 = 1
            X.681 r0 = X.AnonymousClass67N.A00
            goto L_0x00ca
        L_0x00a9:
            com.facebook.msys.mca.Mailbox r3 = (com.facebook.msys.mca.Mailbox) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadInstagramSecureCutoverThreadList"
            X.C3030067a.A04(r1, r0, r2)
            java.lang.Object r4 = r11.A03
            com.facebook.msys.mca.MailboxFutureImpl r4 = (com.facebook.msys.mca.MailboxFutureImpl) r4
            com.facebook.msys.mca.MailboxNullable r5 = X.C66581MXm.A0K()
            r0 = 27
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            java.lang.String r8 = "MCAMailboxInstagramSecureMessage"
            java.lang.String r9 = "InstagramSecureCutoverThreadList"
            r6 = 0
            X.681 r0 = X.AnonymousClass67N.A00
            r7 = r6
        L_0x00ca:
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x00ce:
            com.facebook.msys.mci.AccountSession r3 = (com.facebook.msys.mci.AccountSession) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramReverb"
            java.lang.String r0 = "getNextDeletedMessagePurgeTimestamp"
            X.C3030067a.A04(r1, r0, r2)
            X.681 r1 = X.NAZ.A00
            r0 = 6
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r3)
            r0 = 40
            com.facebook.msys.util.NotificationScope r1 = X.C71733Opt.A00(r1, r11, r2, r0)
            java.lang.Object r0 = r11.A03
            X.C66580MXl.A1N(r1, r0, r2)
            r0 = 7
            goto L_0x0137
        L_0x00f1:
            com.facebook.msys.mci.AccountSession r3 = (com.facebook.msys.mci.AccountSession) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramReverb"
            java.lang.String r0 = "purgeDeletedMessages"
            X.C3030067a.A04(r1, r0, r2)
            X.681 r1 = X.NAZ.A00
            r0 = 15
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r3)
            r0 = 39
            com.facebook.msys.util.NotificationScope r1 = X.C71733Opt.A00(r1, r11, r2, r0)
            java.lang.Object r0 = r11.A03
            X.C66580MXl.A1N(r1, r0, r2)
            r0 = 6
            goto L_0x0137
        L_0x0115:
            com.facebook.msys.mci.AccountSession r3 = (com.facebook.msys.mci.AccountSession) r3
            int r2 = r11.A01
            java.lang.String r1 = "MailboxInstagramReverb"
            java.lang.String r0 = "getNextExpirationTimestamp"
            X.C3030067a.A04(r1, r0, r2)
            X.681 r1 = X.NAZ.A00
            r0 = 7
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r3)
            r0 = 38
            com.facebook.msys.util.NotificationScope r1 = X.C71733Opt.A00(r1, r11, r2, r0)
            java.lang.Object r0 = r11.A03
            X.C66580MXl.A1N(r1, r0, r2)
            r0 = 5
        L_0x0137:
            com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI.dispatchVOO(r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67192Mjo.onCompletion(java.lang.Object):void");
    }

    public C67192Mjo(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
    }
}
