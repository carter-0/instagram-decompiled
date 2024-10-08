package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Oxe  reason: case insensitive filesystem */
public final class C72169Oxe implements AnonymousClass67Q {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C72169Oxe(1a8 r1, OO6 oo6, int i) {
        this.A00 = i;
        if (3 - i != 0) {
            this.A02 = oo6;
            this.A01 = r1;
        } else {
            this.A02 = r1;
            this.A01 = oo6;
        }
    }

    public static 1aU A00(C269794fh r1, Object obj, Object obj2, int i) {
        return 1aU.A07(new C72169Oxe(i, obj, obj2), r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x015d, code lost:
        r12 = new X.C71724Opi(r13, r8, r11, r16, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0261, code lost:
        r12 = new X.C71724Opi(r8, r14, r11, r16, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x026f, code lost:
        if (r4.EJd(r7) != false) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0271, code lost:
        r8.cancel(r2);
        X.C3030067a.A02(r11);
        X.C3030067a.A03(r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x027a, code lost:
        com.facebook.msys.mci.PlatformLogger.platformEventLog(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x027e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0360, code lost:
        X.C73452Pcu.A00(r5, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0363, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0379, code lost:
        r6.A02(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x037c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0127, code lost:
        r10 = new X.C71662Ooh(r11, r12, r5, r6, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Eyr(X.AnonymousClass67Z r20) {
        /*
            r19 = this;
            r0 = r19
            int r2 = r0.A00
            r1 = r20
            switch(r2) {
                case 0: goto L_0x037d;
                case 1: goto L_0x0364;
                case 2: goto L_0x034a;
                case 3: goto L_0x032e;
                case 4: goto L_0x0317;
                case 5: goto L_0x02e4;
                case 6: goto L_0x02c3;
                case 7: goto L_0x0196;
                case 8: goto L_0x0169;
                case 9: goto L_0x022e;
                case 10: goto L_0x0132;
                case 11: goto L_0x0102;
                case 12: goto L_0x00d8;
                case 13: goto L_0x00ab;
                case 14: goto L_0x02b2;
                case 15: goto L_0x0081;
                case 16: goto L_0x005a;
                case 17: goto L_0x0030;
                case 18: goto L_0x02a4;
                case 19: goto L_0x01cc;
                case 20: goto L_0x027f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r5 = r0.A01
            com.facebook.msys.mca.MailboxFeature r5 = (com.facebook.msys.mca.MailboxFeature) r5
            java.lang.Object r0 = r0.A02
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r0
            long r3 = r0.A00
            r0 = 40
            X.Opf r2 = new X.Opf
            r2.<init>((X.AnonymousClass67Z) r1, (int) r0)
            X.68J r1 = r5.mMailboxApiHandleMetaProvider
            r0 = 0
            X.68L r0 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r7 = X.C66581MXm.A0J(r0, r2)
            r6 = 9
            X.Opc r2 = new X.Opc
            r2.<init>((long) r3, (java.lang.Object) r5, (int) r6, (java.lang.Object) r7)
            X.C66582MXn.A1E(r0, r2, r7)
        L_0x002f:
            return
        L_0x0030:
            java.lang.Object r14 = r0.A01
            X.NAb r14 = (X.C68314NAb) r14
            java.lang.Object r0 = r0.A02
            long r5 = X.AnonymousClass7TE.A0R(r0)
            X.Oo7 r3 = new X.Oo7
            r3.<init>(r1)
            X.68J r0 = r14.mMailboxApiHandleMetaProvider
            r2 = 0
            X.68L r4 = r0.ASa(r2)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r4)
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientMessageDelete"
            int r11 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r1, r0)
            r16 = 12
            goto L_0x0261
        L_0x005a:
            java.lang.Object r5 = r0.A01
            com.facebook.msys.mca.MailboxFeature r5 = (com.facebook.msys.mca.MailboxFeature) r5
            java.lang.Object r6 = r0.A02
            r0 = 14
            X.Opf r3 = new X.Opf
            r3.<init>((X.AnonymousClass67Z) r1, (int) r0)
            X.68J r0 = r5.mMailboxApiHandleMetaProvider
            r2 = 0
            X.68L r4 = r0.ASa(r2)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r4)
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadInstagramUserCutoverStatusArray"
            int r11 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r1, r0)
            r12 = 1
            goto L_0x0127
        L_0x0081:
            java.lang.Object r14 = r0.A01
            X.NAb r14 = (X.C68314NAb) r14
            java.lang.Object r0 = r0.A02
            long r5 = X.AnonymousClass7TE.A0R(r0)
            X.Oo7 r3 = new X.Oo7
            r3.<init>(r1)
            X.68J r0 = r14.mMailboxApiHandleMetaProvider
            r2 = 0
            X.68L r4 = r0.ASa(r2)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r4)
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientMessageResendOptimistic"
            int r11 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r1, r0)
            r16 = 11
            goto L_0x0261
        L_0x00ab:
            java.lang.Object r13 = r0.A01
            X.67N r13 = (X.AnonymousClass67N) r13
            java.lang.Object r2 = r0.A02
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r2
            X.MYb r0 = X.MYb.A0M
            long r5 = r2.A00
            r0 = 68
            X.Opg r3 = X.C71722Opg.A00(r1, r0)
            X.68J r0 = r13.mMailboxApiHandleMetaProvider
            r2 = 0
            X.68L r4 = r0.ASa(r2)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r4)
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadInstagramSecureMessagePollList"
            int r11 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r1, r0)
            r16 = 1
            goto L_0x015d
        L_0x00d8:
            java.lang.Object r13 = r0.A01
            X.67N r13 = (X.AnonymousClass67N) r13
            java.lang.Object r2 = r0.A02
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r2
            X.MYb r0 = X.MYb.A0M
            long r5 = r2.A00
            r0 = 57
            X.Opg r3 = X.C71722Opg.A00(r1, r0)
            r2 = 0
            X.68L r4 = X.C66580MXl.A0F(r13, r2)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r4)
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadInstagramSecureParticipantList"
            int r11 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r1, r0)
            r16 = 3
            goto L_0x015d
        L_0x0102:
            java.lang.Object r5 = r0.A01
            com.facebook.msys.mca.MailboxFeature r5 = (com.facebook.msys.mca.MailboxFeature) r5
            java.lang.Object r6 = r0.A02
            X.MYb r0 = X.MYb.A0M
            X.Oo6 r3 = new X.Oo6
            r3.<init>(r1)
            X.68J r0 = r5.mMailboxApiHandleMetaProvider
            r2 = 0
            X.68L r4 = r0.ASa(r2)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r4)
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientSpamMessageFetch"
            int r11 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r1, r0)
            r12 = 2
        L_0x0127:
            X.Ooh r7 = new X.Ooh
            r10 = r7
            r13 = r5
            r14 = r6
            r15 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x026b
        L_0x0132:
            java.lang.Object r13 = r0.A01
            X.67N r13 = (X.AnonymousClass67N) r13
            java.lang.Object r2 = r0.A02
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r2
            X.MYb r0 = X.MYb.A0M
            long r5 = r2.A00
            r0 = 53
            X.Opg r3 = X.C71722Opg.A00(r1, r0)
            X.68J r0 = r13.mMailboxApiHandleMetaProvider
            r2 = 0
            X.68L r4 = r0.ASa(r2)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r4)
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "loadInstagramSecureThreadModel"
            int r11 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r1, r0)
            r16 = 4
        L_0x015d:
            X.Opi r7 = new X.Opi
            r12 = r7
            r14 = r8
            r15 = r11
            r17 = r5
            r12.<init>((X.AnonymousClass67N) r13, (com.facebook.msys.mca.MailboxFutureImpl) r14, (int) r15, (int) r16, (long) r17)
            goto L_0x026b
        L_0x0169:
            java.lang.Object r14 = r0.A01
            X.NAb r14 = (X.C68314NAb) r14
            java.lang.Object r2 = r0.A02
            com.instagram.model.direct.threadkey.impl.MsysThreadId r2 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r2
            X.MYb r0 = X.MYb.A0M
            long r5 = r2.A00
            r0 = 49
            X.Opg r3 = X.C71722Opg.A00(r1, r0)
            X.68J r0 = r14.mMailboxApiHandleMetaProvider
            r2 = 0
            X.68L r4 = r0.ASa(r2)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r4)
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientThreadBannerDismissProactiveWarnings"
            int r11 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r1, r0)
            r16 = 16
            goto L_0x0261
        L_0x0196:
            java.lang.Object r9 = r0.A01
            X.NAb r9 = (X.C68314NAb) r9
            java.lang.Object r2 = r0.A02
            java.lang.Number r2 = (java.lang.Number) r2
            X.MYb r0 = X.MYb.A0M
            java.lang.String r10 = X.AnonymousClass7TF.A0c()
            long r13 = r2.longValue()
            X.OoI r3 = new X.OoI
            r3.<init>(r1, r10)
            X.68J r0 = r9.mMailboxApiHandleMetaProvider
            r2 = 0
            X.68L r4 = r0.ASa(r2)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r4)
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamClientThreadSessionInsert"
            int r11 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r1, r0)
            r12 = 2
            X.Ope r7 = new X.Ope
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x026b
        L_0x01cc:
            java.lang.Object r3 = r0.A02
            X.5z0 r3 = (X.C301345z0) r3
            int r4 = X.C66580MXl.A04(r3)
            r2 = 0
        L_0x01d5:
            if (r2 >= r4) goto L_0x002f
            java.lang.Object r7 = r0.A01
            X.NAT r7 = (X.NAT) r7
            com.facebook.msys.mci.CQLResultSet r5 = r3.mResultSet
            r1 = 0
            int r14 = r5.getInteger(r2, r1)
            com.facebook.msys.mci.CQLResultSet r5 = r3.mResultSet
            r1 = 1
            int r15 = r5.getInteger(r2, r1)
            com.facebook.msys.mci.CQLResultSet r5 = r3.mResultSet
            r1 = 2
            int r16 = r5.getInteger(r2, r1)
            com.facebook.msys.mci.CQLResultSet r5 = r3.mResultSet
            r1 = 3
            java.lang.Boolean r8 = r5.getNullableBoolean(r2, r1)
            com.facebook.msys.mci.CQLResultSet r5 = r3.mResultSet
            r1 = 4
            java.lang.Boolean r9 = r5.getNullableBoolean(r2, r1)
            com.facebook.msys.mci.CQLResultSet r5 = r3.mResultSet
            r1 = 5
            java.lang.Boolean r10 = r5.getNullableBoolean(r2, r1)
            java.lang.String r11 = X.C66581MXm.A0v(r3, r2)
            com.facebook.msys.mci.CQLResultSet r5 = r3.mResultSet
            r1 = 7
            java.lang.String r12 = r5.getString(r2, r1)
            com.facebook.msys.mci.CQLResultSet r5 = r3.mResultSet
            r1 = 8
            java.lang.String r13 = r5.getString(r2, r1)
            X.68J r5 = r7.mMailboxApiHandleMetaProvider
            r1 = 3
            X.68L r1 = r5.ASa(r1)
            com.facebook.msys.mca.MailboxFutureImpl r6 = X.C66580MXl.A0G(r1)
            X.OpO r5 = new X.OpO
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.C66582MXn.A1D(r1, r5, r6)
            int r2 = r2 + 1
            goto L_0x01d5
        L_0x022e:
            java.lang.Object r2 = r0.A01
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r14 = r0.A02
            X.NAb r14 = (X.C68314NAb) r14
            X.MYb r0 = X.MYb.A0M
            long r5 = r2.longValue()
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x002f
            r0 = 59
            X.Opg r3 = X.C71722Opg.A00(r1, r0)
            X.68J r0 = r14.mMailboxApiHandleMetaProvider
            r2 = 0
            X.68L r4 = r0.ASa(r2)
            com.facebook.msys.mca.MailboxFutureImpl r8 = X.C66580MXl.A0G(r4)
            java.lang.String r1 = "MailboxTam"
            java.lang.String r0 = "runTamMarkMessageRequestAccepted"
            int r11 = X.C3030067a.A00(r8)
            com.facebook.msys.mci.TraceInfo r3 = X.C66580MXl.A0I(r3, r8, r1, r0)
            r16 = 21
        L_0x0261:
            X.Opi r7 = new X.Opi
            r12 = r7
            r13 = r8
            r15 = r11
            r17 = r5
            r12.<init>((com.facebook.msys.mca.MailboxFutureImpl) r13, (X.C68314NAb) r14, (int) r15, (int) r16, (long) r17)
        L_0x026b:
            boolean r4 = r4.EJd(r7)
            if (r4 != 0) goto L_0x027a
            r8.cancel(r2)
            X.C3030067a.A02(r11)
            X.C3030067a.A03(r3, r1, r0)
        L_0x027a:
            r0 = 5
            com.facebook.msys.mci.PlatformLogger.platformEventLog(r0)
            return
        L_0x027f:
            r5 = 0
            X.0qQ.A0B(r1, r5)
            java.lang.Object r4 = r0.A02
            X.OyU r4 = (X.C72204OyU) r4
            X.2Dm r3 = r4.A06
            java.lang.Object r2 = r0.A01
            X.3t3 r2 = (X.C254793t3) r2
            X.3t0 r0 = X.C300965yF.A01(r2)
            com.instagram.model.direct.DirectThreadKey r0 = X.C327647Bq.A00(r0)
            java.util.ArrayList r0 = r3.Aax(r0, r5)
            java.util.LinkedList r0 = X.C72204OyU.A03(r4, r2, r0)
            r1.A02(r0)
            r1.A00()
            return
        L_0x02a4:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A01
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r0.A02
            r2.invoke(r0, r1)
            return
        L_0x02b2:
            java.lang.Object r4 = r0.A01
            X.67N r4 = (X.AnonymousClass67N) r4
            java.lang.Object r3 = r0.A02
            r2 = 18
            X.OoW r0 = new X.OoW
            r0.<init>(r2, r4, r3, r1)
            r4.A01(r0)
            return
        L_0x02c3:
            java.lang.Object r2 = r0.A02
            X.OHw r2 = (X.C70727OHw) r2
            X.0sP r2 = r2.A08
            java.lang.Object r0 = r0.A01
            X.0qQ.A0A(r0)
            java.lang.Object r3 = r2.invoke(r0)
            X.Mjr r3 = (X.C67195Mjr) r3
            r3.A00()
            r2 = 2
            X.OuV r0 = new X.OuV
            r0.<init>(r3, r2)
            r1.A01(r0)
            r1.A02(r3)
            return
        L_0x02e4:
            java.lang.Object r2 = r0.A01
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            java.lang.String r2 = r2.getUrl()
            android.net.Uri r2 = X.0cp.A03(r2)
            java.lang.String r4 = r2.getPath()
            X.Mqv r2 = X.C67620Mqs.A04
            java.lang.Object r0 = r0.A02
            X.76h r0 = (X.C3263276h) r0
            android.content.Context r2 = r0.A00
            X.O6N r0 = new X.O6N
            r0.<init>(r1)
            X.NMO r3 = new X.NMO
            r3.<init>(r2, r0)
            r2 = 1
            X.OuV r0 = new X.OuV
            r0.<init>(r3, r2)
            r1.A01(r0)
            java.lang.String[] r0 = new java.lang.String[]{r4}
            r3.A02(r0)
            return
        L_0x0317:
            X.OUY r4 = X.OUY.A00
            java.lang.Object r3 = r0.A02
            X.OO6 r3 = (X.OO6) r3
            com.instagram.common.session.UserSession r2 = r3.A04
            java.util.concurrent.CompletableFuture r5 = r4.A00(r2)
            java.lang.Object r2 = r0.A01
            r0 = 48
            X.J6W r4 = new X.J6W
            r4.<init>(r0, r1, r2, r3)
            r0 = 3
            goto L_0x0360
        L_0x032e:
            X.NTp r2 = X.C68703NTp.A00
            r1.A02(r2)
            java.lang.Object r6 = r0.A02
            X.1a8 r6 = (X.1a8) r6
            java.lang.Object r5 = r0.A01
            X.OO6 r5 = (X.OO6) r5
            X.1aU r2 = r5.A03
            X.Ovi r0 = X.C72069Ovi.A00
            X.1aU r4 = r2.A0L(r0)
            r0 = 5
            X.PUC r3 = new X.PUC
            r3.<init>((X.AnonymousClass67Z) r1, (X.1a8) r6, (X.OO6) r5, (int) r0)
            goto L_0x0379
        L_0x034a:
            X.OUY r4 = X.OUY.A00
            java.lang.Object r3 = r0.A02
            X.OHi r3 = (X.C70713OHi) r3
            com.instagram.common.session.UserSession r2 = r3.A03
            java.util.concurrent.CompletableFuture r5 = r4.A00(r2)
            java.lang.Object r2 = r0.A01
            r0 = 47
            X.J6W r4 = new X.J6W
            r4.<init>(r0, r1, r2, r3)
            r0 = 2
        L_0x0360:
            X.C73452Pcu.A00(r5, r4, r0)
            return
        L_0x0364:
            X.NTY r2 = X.NTY.A00
            r1.A02(r2)
            java.lang.Object r6 = r0.A01
            X.1a8 r6 = (X.1a8) r6
            java.lang.Object r2 = r0.A02
            X.OHi r2 = (X.C70713OHi) r2
            X.1aU r4 = r2.A01
            r0 = 1
            X.PUC r3 = new X.PUC
            r3.<init>((X.AnonymousClass67Z) r1, (X.1a8) r6, (X.C70713OHi) r2, (int) r0)
        L_0x0379:
            r6.A02(r4, r3)
            return
        L_0x037d:
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.Object r2 = r0.A02
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            int r3 = r2.incrementAndGet()
            r2 = 1
            if (r3 > r2) goto L_0x03a1
            java.lang.Object r2 = r0.A01
            X.1OC r2 = (X.1OC) r2
            X.NMI.A00(r2, r1, r4)
            r0 = 222(0xde, float:3.11E-43)
            X.1ES.A06(r2, r0, r4)
            X.OuV r0 = new X.OuV
            r0.<init>(r2, r4)
            r1.A01(r0)
            return
        L_0x03a1:
            java.lang.String r0 = "RxRequest currently does not support multiple subscribers."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72169Oxe.Eyr(X.67Z):void");
    }

    public C72169Oxe(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public C72169Oxe(1a8 r1, C70713OHi oHi, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A02 = oHi;
            this.A01 = r1;
        } else {
            this.A01 = r1;
            this.A02 = oHi;
        }
    }

    public C72169Oxe(C68314NAb nAb, Long l, int i) {
        this.A00 = i;
        switch (i) {
            case 7:
            case 15:
            case 17:
                this.A01 = nAb;
                this.A02 = l;
                return;
            default:
                this.A01 = l;
                this.A02 = nAb;
                return;
        }
    }

    public C72169Oxe(1OC r3) {
        this.A00 = 0;
        this.A01 = r3;
        this.A02 = new AtomicInteger(0);
    }
}
