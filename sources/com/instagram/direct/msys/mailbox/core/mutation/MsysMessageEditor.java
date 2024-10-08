package com.instagram.direct.msys.mailbox.core.mutation;

import X.0qQ;
import com.instagram.common.session.UserSession;

public final class MsysMessageEditor {
    public final UserSession A00;

    public MsysMessageEditor(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass9HR r19, java.lang.String r20, java.lang.String r21, X.AnonymousClass4D7 r22) {
        /*
            r18 = this;
            r2 = r20
            r12 = r21
            r4 = 37
            r5 = r22
            boolean r0 = X.MED.A04(r4, r5)
            r8 = r18
            if (r0 == 0) goto L_0x00b7
            r6 = r5
            X.MED r6 = (X.MED) r6
            int r3 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00b7
            int r3 = r3 - r1
            r6.A00 = r3
        L_0x001e:
            java.lang.Object r7 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 == r3) goto L_0x0038
            if (r0 != r4) goto L_0x00c5
            X.0eS.A00(r7)
        L_0x002f:
            boolean r0 = X.AnonymousClass7TE.A1a(r7)
            if (r0 == 0) goto L_0x00be
            X.0gF r5 = X.C60340gF.A00
        L_0x0037:
            return r5
        L_0x0038:
            java.lang.Object r12 = r6.A03
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r6.A02
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r6.A01
            com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor r0 = (com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor) r0
            X.0eS.A00(r7)
            goto L_0x0066
        L_0x0048:
            X.0eS.A00(r7)
            com.instagram.common.session.UserSession r1 = r8.A00
            X.67N r0 = X.OUC.A00(r1)
            r7 = r19
            com.google.common.util.concurrent.ListenableFuture r0 = X.C70881OPy.A01(r0, r1, r7)
            r6.A01 = r8
            r6.A02 = r2
            r6.A03 = r12
            r6.A00 = r3
            java.lang.Object r7 = X.C70357O3j.A00(r0, r6)
            if (r7 == r5) goto L_0x0037
            r0 = r8
        L_0x0066:
            com.instagram.model.direct.threadkey.impl.MsysThreadId r7 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r7
            com.instagram.common.session.UserSession r1 = r0.A00
            long r14 = r7.A00
            r3 = 0
            long r16 = java.lang.Long.parseLong(r2)
            r0 = 4
            X.0qQ.A0B(r12, r0)
            X.67N r10 = X.OUC.A00(r1)
            X.68J r0 = r10.mMailboxApiHandleMetaProvider
            r2 = 0
            X.68L r8 = r0.ASa(r2)
            com.facebook.msys.mca.MailboxFutureImpl r11 = X.C66580MXl.A0G(r8)
            java.lang.String r1 = "MailboxInstagramSecureMessage"
            java.lang.String r0 = "runInstagramEditMessageClientSend"
            int r13 = X.C3030067a.A00(r11)
            com.facebook.msys.mci.TraceInfo r7 = X.C3030067a.A01(r11, r1, r0)
            X.Oor r9 = new X.Oor
            r9.<init>(r10, r11, r12, r13, r14, r16)
            boolean r8 = r8.EJd(r9)
            if (r8 != 0) goto L_0x00a4
            r11.cancel(r2)
            X.C3030067a.A02(r13)
            X.C3030067a.A03(r7, r1, r0)
        L_0x00a4:
            r0 = 5
            com.facebook.msys.mci.PlatformLogger.platformEventLog(r0)
            r6.A01 = r3
            r6.A02 = r3
            r6.A03 = r3
            r6.A00 = r4
            java.lang.Object r7 = X.C303606Aa.A01(r11, r6)
            if (r7 != r5) goto L_0x002f
            return r5
        L_0x00b7:
            X.MED r6 = new X.MED
            r6.<init>(r8, r5, r4)
            goto L_0x001e
        L_0x00be:
            java.lang.String r0 = "Send edit message returned false"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x00c5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.msys.mailbox.core.mutation.MsysMessageEditor.A00(X.9HR, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }
}
