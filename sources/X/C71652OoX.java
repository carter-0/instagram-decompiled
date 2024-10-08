package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.OoX  reason: case insensitive filesystem */
public final class C71652OoX implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b1, code lost:
        com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI.dispatchVOOO(r0, r4, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f0, code lost:
        com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI.dispatchVOOO(r0, r4, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r4, r5, r6, r7, r8, r9, r10, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r13) {
        /*
            r12 = this;
            r4 = r13
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00d3;
                case 2: goto L_0x00b5;
                case 3: goto L_0x0094;
                case 4: goto L_0x0076;
                case 5: goto L_0x0055;
                case 6: goto L_0x003b;
                case 7: goto L_0x0024;
                default: goto L_0x0006;
            }
        L_0x0006:
            boolean r0 = X.DbX.A1a(r13)
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r12.A01
            X.61J r0 = (X.AnonymousClass61J) r0
            X.61N r3 = r0.A01
            r0 = 4
            java.lang.String r2 = r12.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.Map r0 = r3.A01
            r0.put(r1, r2)
        L_0x001e:
            java.lang.Object r0 = r12.A02
            X.C66581MXm.A1Q(r0, r13)
            return
        L_0x0024:
            com.facebook.msys.mca.Mailbox r4 = (com.facebook.msys.mca.Mailbox) r4
            java.lang.Object r5 = r12.A02
            com.facebook.msys.mca.MailboxFutureImpl r5 = (com.facebook.msys.mca.MailboxFutureImpl) r5
            r7 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            r0 = 49
            X.Opk r11 = X.C71726Opk.A00(r12, r0)
            java.lang.String r9 = "MCAMailboxSecureConsentFramework"
            java.lang.String r10 = "SecureConsentFrameworkUpsertStringValue"
            r8 = 1
            goto L_0x0051
        L_0x003b:
            com.facebook.msys.mca.Mailbox r4 = (com.facebook.msys.mca.Mailbox) r4
            java.lang.Object r5 = r12.A02
            com.facebook.msys.mca.MailboxFutureImpl r5 = (com.facebook.msys.mca.MailboxFutureImpl) r5
            com.facebook.msys.mca.MailboxNullable r6 = X.C66581MXm.A0K()
            r0 = 20
            X.Opk r11 = X.C71726Opk.A00(r12, r0)
            java.lang.String r9 = "MCAMailboxInstagramSearch"
            java.lang.String r10 = "IgSearchResults"
            r7 = 0
            r8 = r7
        L_0x0051:
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0055:
            com.facebook.msys.mci.AccountSession r4 = (com.facebook.msys.mci.AccountSession) r4
            X.681 r1 = X.NAY.A00
            r0 = 27
            java.lang.String r3 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r4)
            r0 = 16
            com.facebook.msys.util.NotificationScope r2 = X.C71734Opu.A01(r1, r12, r3, r0)
            java.lang.Object r0 = r12.A02
            X.C66580MXl.A1N(r2, r0, r3)
            java.lang.String r1 = r12.A03
            r0 = 8
            com.facebook.instagrammem.mca.MailboxInstagramMemJNI.dispatchVOOO(r0, r4, r1, r2)
            return
        L_0x0076:
            com.facebook.msys.mci.AccountSession r4 = (com.facebook.msys.mci.AccountSession) r4
            X.681 r1 = X.NAX.A00
            r0 = 328(0x148, float:4.6E-43)
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r4)
            r0 = 13
            com.facebook.msys.util.NotificationScope r3 = X.C71734Opu.A01(r1, r12, r2, r0)
            java.lang.Object r0 = r12.A02
            X.C66580MXl.A1N(r3, r0, r2)
            java.lang.String r1 = r12.A03
            r0 = 44
            goto L_0x00b1
        L_0x0094:
            com.facebook.msys.mci.AccountSession r4 = (com.facebook.msys.mci.AccountSession) r4
            X.681 r1 = X.NAX.A00
            r0 = 351(0x15f, float:4.92E-43)
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r4)
            r0 = 13
            com.facebook.msys.util.NotificationScope r3 = X.C71733Opt.A00(r1, r12, r2, r0)
            java.lang.Object r0 = r12.A02
            X.C66580MXl.A1N(r3, r0, r2)
            java.lang.String r1 = r12.A03
            r0 = 37
        L_0x00b1:
            com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI.dispatchVOOO(r0, r4, r3, r1)
            return
        L_0x00b5:
            com.facebook.msys.mci.AccountSession r4 = (com.facebook.msys.mci.AccountSession) r4
            X.681 r1 = X.NAX.A00
            r0 = 325(0x145, float:4.55E-43)
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r4)
            r0 = 12
            com.facebook.msys.util.NotificationScope r3 = X.C71733Opt.A00(r1, r12, r2, r0)
            java.lang.Object r0 = r12.A02
            X.C66580MXl.A1N(r3, r0, r2)
            java.lang.String r1 = r12.A03
            r0 = 35
            goto L_0x00f0
        L_0x00d3:
            com.facebook.msys.mci.AccountSession r4 = (com.facebook.msys.mci.AccountSession) r4
            X.681 r1 = X.NAX.A00
            r0 = 326(0x146, float:4.57E-43)
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r4)
            r0 = 11
            com.facebook.msys.util.NotificationScope r3 = X.C71733Opt.A00(r1, r12, r2, r0)
            java.lang.Object r0 = r12.A02
            X.C66580MXl.A1N(r3, r0, r2)
            java.lang.String r1 = r12.A03
            r0 = 34
        L_0x00f0:
            com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI.dispatchVOOO(r0, r4, r1, r3)
            return
        L_0x00f4:
            com.facebook.msys.mci.AccountSession r4 = (com.facebook.msys.mci.AccountSession) r4
            X.681 r1 = X.AnonymousClass632.A00
            r0 = 2
            java.lang.String r3 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r4)
            r0 = 3
            com.facebook.msys.util.NotificationScope r2 = X.C71734Opu.A01(r1, r12, r3, r0)
            java.lang.Object r0 = r12.A02
            X.C66580MXl.A1N(r2, r0, r3)
            java.lang.String r1 = r12.A03
            r0 = 9
            com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchVOOO(r0, r4, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71652OoX.onCompletion(java.lang.Object):void");
    }

    public C71652OoX(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }
}
