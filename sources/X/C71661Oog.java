package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.Oog  reason: case insensitive filesystem */
public final class C71661Oog implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006c, code lost:
        com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r1, r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r12) {
        /*
            r11 = this;
            r1 = r12
            int r0 = r11.A00
            com.facebook.msys.mca.Mailbox r1 = (com.facebook.msys.mca.Mailbox) r1
            switch(r0) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0027;
                case 2: goto L_0x0041;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r2 = r11.A03
            com.facebook.msys.mca.MailboxFutureImpl r2 = (com.facebook.msys.mca.MailboxFutureImpl) r2
            r4 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r7 = r11.A04
            com.facebook.msys.mci.PrivacyContext r7 = (com.facebook.msys.mci.PrivacyContext) r7
            r0 = 55
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            r6 = 0
            java.lang.String r8 = "MCAMailboxShim"
            java.lang.String r9 = "SHIMClientHybridThreadRemoveThreadImageOptimistic"
            r5 = 1
            X.681 r0 = X.C68313NAa.A00
        L_0x0023:
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0027:
            java.lang.Object r2 = r11.A03
            com.facebook.msys.mca.MailboxFutureImpl r2 = (com.facebook.msys.mca.MailboxFutureImpl) r2
            r4 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r7 = r11.A04
            com.facebook.msys.mci.PrivacyContext r7 = (com.facebook.msys.mci.PrivacyContext) r7
            r0 = 45
            X.Opk r10 = X.C71726Opk.A00(r11, r0)
            r6 = 0
            java.lang.String r8 = "MCAMailboxProactiveWarnings"
            java.lang.String r9 = "FetchClientThreadProactiveWarningContactLevelIfNeeded"
            r5 = 1
            goto L_0x0023
        L_0x0041:
            java.lang.Object r2 = r11.A03
            com.facebook.msys.mca.MailboxFutureImpl r2 = (com.facebook.msys.mca.MailboxFutureImpl) r2
            r4 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r0 = 52
            X.Opk r8 = X.C71726Opk.A00(r11, r0)
            java.lang.String r6 = "MCAMailboxShim"
            java.lang.String r7 = "SHIMTransportHybridAcceptMessageRequest"
            r5 = 1
            X.681 r0 = X.C68313NAa.A00
            goto L_0x006c
        L_0x0058:
            java.lang.Object r2 = r11.A04
            com.facebook.msys.mca.MailboxFutureImpl r2 = (com.facebook.msys.mca.MailboxFutureImpl) r2
            r4 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            X.Opk r8 = X.C71726Opk.A00(r11, r4)
            java.lang.String r6 = "MCAMailboxAdvancedCryptoTransport"
            java.lang.String r7 = "InsertOrReplaceSecureMessageICDCAdditionalDevice"
            r5 = 1
            X.681 r0 = X.AnonymousClass632.A00
        L_0x006c:
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71661Oog.onCompletion(java.lang.Object):void");
    }

    public C71661Oog(int i, long j, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = j;
        this.A03 = obj3;
    }
}
