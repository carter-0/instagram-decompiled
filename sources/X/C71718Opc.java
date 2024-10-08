package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Opc  reason: case insensitive filesystem */
public final class C71718Opc implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0078, code lost:
        r9 = 1;
        r0 = X.AnonymousClass632.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0144, code lost:
        r0 = X.AnonymousClass632.A00;
        com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r5, r6, r7, r8, r9, r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0149, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        r9 = 1;
        r0 = X.C68313NAa.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r5, r6, r7, r8, r9, r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r14) {
        /*
            r13 = this;
            r5 = r14
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0130;
                case 1: goto L_0x011a;
                case 2: goto L_0x0064;
                case 3: goto L_0x004f;
                case 4: goto L_0x0038;
                case 5: goto L_0x00fa;
                case 6: goto L_0x00d8;
                case 7: goto L_0x00b9;
                case 8: goto L_0x0096;
                case 9: goto L_0x007c;
                case 10: goto L_0x0022;
                default: goto L_0x0006;
            }
        L_0x0006:
            com.facebook.msys.mca.Mailbox r5 = (com.facebook.msys.mca.Mailbox) r5
            java.lang.Object r6 = r13.A03
            com.facebook.msys.mca.MailboxFutureImpl r6 = (com.facebook.msys.mca.MailboxFutureImpl) r6
            r8 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r0 = 51
            X.Opk r12 = X.C71726Opk.A00(r13, r0)
            java.lang.String r10 = "MCAMailboxShim"
            java.lang.String r11 = "SHIMTransportHybridThreadMuteMention"
        L_0x001b:
            r9 = 1
            X.681 r0 = X.C68313NAa.A00
        L_0x001e:
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0022:
            com.facebook.msys.mca.Mailbox r5 = (com.facebook.msys.mca.Mailbox) r5
            java.lang.Object r6 = r13.A03
            com.facebook.msys.mca.MailboxFutureImpl r6 = (com.facebook.msys.mca.MailboxFutureImpl) r6
            r8 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r0 = 50
            X.Opk r12 = X.C71726Opk.A00(r13, r0)
            java.lang.String r10 = "MCAMailboxShim"
            java.lang.String r11 = "SHIMTransportHybridThreadUnmuteMention"
            goto L_0x001b
        L_0x0038:
            com.facebook.msys.mca.Mailbox r5 = (com.facebook.msys.mca.Mailbox) r5
            java.lang.Object r6 = r13.A03
            com.facebook.msys.mca.MailboxFutureImpl r6 = (com.facebook.msys.mca.MailboxFutureImpl) r6
            r8 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r0 = 10
            X.Opk r12 = X.C71726Opk.A00(r13, r0)
            java.lang.String r10 = "MCAMailboxCutoverInternal"
            java.lang.String r11 = "CutoverOpenThread"
            r9 = 1
            goto L_0x001e
        L_0x004f:
            com.facebook.msys.mca.Mailbox r5 = (com.facebook.msys.mca.Mailbox) r5
            java.lang.Object r6 = r13.A03
            com.facebook.msys.mca.MailboxFutureImpl r6 = (com.facebook.msys.mca.MailboxFutureImpl) r6
            r8 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r0 = 5
            X.Opk r12 = X.C71726Opk.A00(r13, r0)
            java.lang.String r10 = "MCAMailboxAdvancedCryptoTransport"
            java.lang.String r11 = "SecureMessageUpdateICDCAlertTriggerForUser"
            goto L_0x0078
        L_0x0064:
            com.facebook.msys.mca.Mailbox r5 = (com.facebook.msys.mca.Mailbox) r5
            java.lang.Object r6 = r13.A03
            com.facebook.msys.mca.MailboxFutureImpl r6 = (com.facebook.msys.mca.MailboxFutureImpl) r6
            r8 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r0 = 4
            X.Opk r12 = X.C71726Opk.A00(r13, r0)
            java.lang.String r10 = "MCAMailboxAdvancedCryptoTransport"
            java.lang.String r11 = "SecureMessageDeleteICDCMetadata"
        L_0x0078:
            r9 = 1
            X.681 r0 = X.AnonymousClass632.A00
            goto L_0x001e
        L_0x007c:
            com.facebook.msys.mca.Mailbox r5 = (com.facebook.msys.mca.Mailbox) r5
            java.lang.Object r6 = r13.A03
            com.facebook.msys.mca.MailboxFutureImpl r6 = (com.facebook.msys.mca.MailboxFutureImpl) r6
            com.facebook.msys.mca.MailboxNullable r7 = X.C66581MXm.A0K()
            r0 = 46
            X.Opk r12 = X.C71726Opk.A00(r13, r0)
            java.lang.String r10 = "MCAMailboxProactiveWarningsNonCore"
            java.lang.String r11 = "ProactiveWarningClientThreadReportingContext"
            r8 = 0
            r9 = r8
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0096:
            com.facebook.msys.mci.AccountSession r5 = (com.facebook.msys.mci.AccountSession) r5
            X.681 r0 = X.NAQ.A00
            r4 = 1
            java.lang.String r3 = X.C66580MXl.A0u(r0, r4)
            X.5nb r2 = X.C66580MXl.A0H(r5)
            r1 = 33
            X.Opu r0 = new X.Opu
            r0.<init>(r13, r1)
            com.facebook.msys.util.NotificationScope r2 = r2.EBU(r0, r3, r4)
            java.lang.Object r0 = r13.A03
            X.C66580MXl.A1N(r2, r0, r3)
            long r0 = r13.A01
            com.facebook.messengerencryptedbackupsmemris.mca.MailboxMessengerEncryptedBackupsMemrisJNI.dispatchVJOO(r4, r0, r5, r2)
            return
        L_0x00b9:
            com.facebook.msys.mci.AccountSession r5 = (com.facebook.msys.mci.AccountSession) r5
            X.681 r1 = X.NAQ.A00
            r0 = 2
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r5)
            r0 = 32
            com.facebook.msys.util.NotificationScope r3 = X.C71734Opu.A01(r1, r13, r2, r0)
            java.lang.Object r0 = r13.A03
            X.C66580MXl.A1N(r3, r0, r2)
            long r1 = r13.A01
            r0 = 0
            com.facebook.messengerencryptedbackupsmemris.mca.MailboxMessengerEncryptedBackupsMemrisJNI.dispatchVJOO(r0, r1, r5, r3)
            return
        L_0x00d8:
            com.facebook.msys.mci.AccountSession r5 = (com.facebook.msys.mci.AccountSession) r5
            X.681 r1 = X.NAP.A00
            r0 = 4
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r5)
            r0 = 28
            com.facebook.msys.util.NotificationScope r6 = X.C71734Opu.A01(r1, r13, r2, r0)
            java.lang.Object r0 = r13.A03
            X.C66580MXl.A1N(r6, r0, r2)
            r2 = 20
            long r3 = r13.A01
            r1 = 8
            com.facebook.messengerencryptedbackupsdirect.mca.MailboxMessengerEncryptedBackupsDirectJNI.dispatchVIJOO(r1, r2, r3, r5, r6)
            return
        L_0x00fa:
            com.facebook.msys.mci.AccountSession r5 = (com.facebook.msys.mci.AccountSession) r5
            X.681 r1 = X.NAY.A00
            r0 = 0
            java.lang.String r2 = X.C66580MXl.A0u(r1, r0)
            X.5nb r1 = X.C66580MXl.A0H(r5)
            r0 = 18
            com.facebook.msys.util.NotificationScope r3 = X.C71734Opu.A01(r1, r13, r2, r0)
            java.lang.Object r0 = r13.A03
            X.C66580MXl.A1N(r3, r0, r2)
            long r1 = r13.A01
            r0 = 16
            com.facebook.instagrammem.mca.MailboxInstagramMemJNI.dispatchVJOO(r0, r1, r5, r3)
            return
        L_0x011a:
            com.facebook.msys.mca.Mailbox r5 = (com.facebook.msys.mca.Mailbox) r5
            java.lang.Object r6 = r13.A03
            com.facebook.msys.mca.MailboxFutureImpl r6 = (com.facebook.msys.mca.MailboxFutureImpl) r6
            com.facebook.msys.mca.MailboxNullable r7 = X.C66581MXm.A0K()
            r0 = 2
            X.Opk r12 = X.C71726Opk.A00(r13, r0)
            java.lang.String r10 = "MCAMailboxAdvancedCryptoTransport"
            java.lang.String r11 = "SecureMessageFetchICDCMetadata"
            r8 = 0
            r9 = 1
            goto L_0x0144
        L_0x0130:
            com.facebook.msys.mca.Mailbox r5 = (com.facebook.msys.mca.Mailbox) r5
            java.lang.Object r6 = r13.A03
            com.facebook.msys.mca.MailboxFutureImpl r6 = (com.facebook.msys.mca.MailboxFutureImpl) r6
            r8 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r9 = 1
            X.Opk r12 = X.C71726Opk.A00(r13, r9)
            java.lang.String r10 = "MCAMailboxAdvancedCryptoTransport"
            java.lang.String r11 = "SecureMessageDeleteICDCAdditionalDevice"
        L_0x0144:
            X.681 r0 = X.AnonymousClass632.A00
            com.facebook.msys.mca.MailboxFeature.safeDispatchToDbConnectionAndResolve(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71718Opc.onCompletion(java.lang.Object):void");
    }

    public C71718Opc(AnonymousClass632 r1, MailboxFutureImpl mailboxFutureImpl, int i, long j) {
        this.A00 = i;
        this.A02 = r1;
        this.A03 = mailboxFutureImpl;
        this.A01 = j;
    }

    public C71718Opc(long j, Object obj, int i, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
    }
}
