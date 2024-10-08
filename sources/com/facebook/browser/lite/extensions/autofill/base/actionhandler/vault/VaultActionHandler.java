package com.facebook.browser.lite.extensions.autofill.base.actionhandler.vault;

public final class VaultActionHandler {
    public static final VaultActionHandler A00 = new Object();

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDt, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(android.os.Bundle r16, androidx.fragment.app.FragmentActivity r17, X.AnonymousClass07Z r18, X.S0E r19, X.C270254gR r20, com.fbpay.w3c.CardDetails r21, X.S33 r22, com.meta.vault.service.base.DefaultVaultService r23, X.AnonymousClass4D7 r24) {
        /*
            r15 = this;
            r11 = r21
            r14 = r20
            r3 = r18
            r5 = r22
            r12 = r16
            r13 = r19
            r4 = 3
            r6 = r24
            boolean r0 = X.C66141MDt.A02(r4, r6)
            if (r0 == 0) goto L_0x0116
            r8 = r6
            X.MDt r8 = (X.C66141MDt) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0116
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0023:
            java.lang.Object r1 = r8.A08
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r4 = 1
            r6 = 0
            if (r0 == 0) goto L_0x00e5
            if (r0 != r4) goto L_0x011d
            java.lang.Object r13 = r8.A07
            X.S0E r13 = (X.S0E) r13
            java.lang.Object r12 = r8.A06
            android.os.Bundle r12 = (android.os.Bundle) r12
            java.lang.Object r5 = r8.A05
            X.S33 r5 = (X.S33) r5
            java.lang.Object r3 = r8.A04
            X.07Z r3 = (X.AnonymousClass07Z) r3
            java.lang.Object r14 = r8.A03
            X.4gR r14 = (X.C270254gR) r14
            java.lang.Object r11 = r8.A02
            com.fbpay.w3c.CardDetails r11 = (com.fbpay.w3c.CardDetails) r11
            X.0eS.A00(r1)
        L_0x004a:
            X.Hsl r1 = (X.C56098Hsl) r1
            boolean r0 = r1.A01
            java.lang.String r8 = "VAULT_PHASE_ONE_USE_FAIL"
            if (r0 != 0) goto L_0x0079
            X.SJq r3 = r14.A01
            java.util.List r5 = r1.A00
            r2 = 91
            java.lang.String r1 = ", "
            r0 = 0
            java.lang.String r1 = X.DbT.A0z(r1, r5, r0)
            r0 = 93
            java.lang.String r1 = X.002.A0E(r1, r2, r0)
            java.lang.String r0 = "VAULT_BIO_AUTH_FAILURE_REASONS"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)
            r3.A05(r12, r8, r0)
        L_0x006e:
            X.Jw4 r0 = new X.Jw4
            r0.<init>((java.lang.Object) r11, (int) r6, (boolean) r6, (boolean) r4)
        L_0x0073:
            r13.A00(r0)
        L_0x0076:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0079:
            java.lang.String r1 = "VAULT_GET_ENCRYPTED_PAN_FAILURE_REASON"
            if (r3 != 0) goto L_0x008e
            X.SJq r2 = r14.A01
            java.lang.String r0 = "NULL_LIFECYCLE_OWNER"
        L_0x0081:
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r1, r0)
            r2.A05(r12, r8, r0)
            X.Jw4 r0 = new X.Jw4
            r0.<init>((java.lang.Object) r11, (int) r6, (boolean) r6, (boolean) r6)
            goto L_0x0073
        L_0x008e:
            if (r5 != 0) goto L_0x0095
            X.SJq r2 = r14.A01
            java.lang.String r0 = "NULL_W3C_CARD_MANAGER"
            goto L_0x0081
        L_0x0095:
            java.lang.String r7 = r11.A08
            if (r7 != 0) goto L_0x009e
            X.SJq r2 = r14.A01
            java.lang.String r0 = "NULL_CREDENTIAL_ID"
            goto L_0x0081
        L_0x009e:
            X.RzL r0 = r14.A00
            X.JwI r0 = r0.A0D
            java.lang.Object r0 = r0.A00
            java.util.Iterator r10 = X.C51966G9m.A1H(r0)
        L_0x00a8:
            boolean r0 = r10.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r9 = r10.next()
            r0 = r9
            com.fbpay.w3c.W3CCardDetail r0 = (com.fbpay.w3c.W3CCardDetail) r0
            com.fbpay.w3c.CardDetails r0 = r0.A00
            java.lang.String r0 = r0.A08
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 == 0) goto L_0x00a8
            if (r9 == 0) goto L_0x00d2
            java.lang.String r1 = ""
            X.S7C r0 = r5.A00
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = "w3cAppRepo"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d2:
            X.SJq r2 = r14.A01
            java.lang.String r0 = "NULL_W3C_CARD_DETAIL"
            goto L_0x0081
        L_0x00d7:
            X.5A6 r0 = r0.A03(r7, r1, r2, r4)
            r10 = 5
            X.IxG r9 = new X.IxG
            r9.<init>(r10, r11, r12, r13, r14)
            X.C9678Rew.A00(r3, r0, r9)
            goto L_0x0076
        L_0x00e5:
            X.0eS.A00(r1)
            X.1yd r0 = r14.A04
            boolean r0 = r0.A0D(r6)
            if (r0 == 0) goto L_0x006e
            X.SJq r2 = r14.A01
            X.0sm r1 = X.0Yt.A0E()
            java.lang.String r0 = "VAULT_PHASE_ONE_USE_INIT"
            r2.A05(r12, r0, r1)
            r8.A01 = r15
            r8.A02 = r11
            r8.A03 = r14
            r8.A04 = r3
            r8.A05 = r5
            r8.A06 = r12
            r8.A07 = r13
            r8.A00 = r4
            r0 = r23
            r1 = r17
            java.lang.Object r1 = r0.A00(r1, r8)
            if (r1 != r7) goto L_0x004a
            return r7
        L_0x0116:
            X.MDt r8 = new X.MDt
            r8.<init>(r15, r6, r4)
            goto L_0x0023
        L_0x011d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.base.actionhandler.vault.VaultActionHandler.A00(android.os.Bundle, androidx.fragment.app.FragmentActivity, X.07Z, X.S0E, X.4gR, com.fbpay.w3c.CardDetails, X.S33, com.meta.vault.service.base.DefaultVaultService, X.4D7):java.lang.Object");
    }
}
