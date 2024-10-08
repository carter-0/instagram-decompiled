package com.instagram.login.credentialmanager;

import X.AnonymousClass12T;
import X.C262224Cq;
import X.JTR;
import X.L8K;
import android.content.Context;

public final class CredentialManagerFetchHelper {
    public L8K A00;
    public final C262224Cq A01 = JTR.A17(AnonymousClass12T.A00, 1348461140);
    public final Context A02;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d A[Catch:{ NullPointerException -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.login.credentialmanager.CredentialManagerFetchHelper r8, X.L8K r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 49
            boolean r0 = X.C66145MDx.A02(r3, r10)
            if (r0 == 0) goto L_0x002a
            r5 = r10
            X.MDx r5 = (X.C66145MDx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r7) goto L_0x0030
            java.lang.Object r9 = r5.A02
            X.L8K r9 = (X.L8K) r9
            java.lang.Object r8 = r5.A01
            com.instagram.login.credentialmanager.CredentialManagerFetchHelper r8 = (com.instagram.login.credentialmanager.CredentialManagerFetchHelper) r8
            goto L_0x0072
        L_0x002a:
            X.MDx r5 = new X.MDx
            r5.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0035:
            X.0eS.A00(r1)
            r0 = 270(0x10e, float:3.78E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = 684(0x2ac, float:9.58E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r2, r1)
            java.util.Set r2 = X.JTP.A0y(r0)
            X.0sl r1 = X.0sl.A00
            r4 = 0
            X.QAo r0 = new X.QAo
            r0.<init>(r1, r2)
            android.content.Context r3 = r8.A02     // Catch:{ RKe -> 0x0091 }
            X.SdH r2 = new X.SdH     // Catch:{ RKe -> 0x0091 }
            r2.<init>(r3)     // Catch:{ RKe -> 0x0091 }
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)     // Catch:{ RKe -> 0x0091 }
            X.Rqc r0 = new X.Rqc     // Catch:{ RKe -> 0x0091 }
            r0.<init>(r1, r4)     // Catch:{ RKe -> 0x0091 }
            r5.A01 = r8     // Catch:{ RKe -> 0x0091 }
            r5.A02 = r9     // Catch:{ RKe -> 0x0091 }
            r5.A00 = r7     // Catch:{ RKe -> 0x0091 }
            java.lang.Object r1 = r2.Asl(r3, r0, r5)     // Catch:{ RKe -> 0x0091 }
            if (r1 != r6) goto L_0x0075
            return r6
        L_0x0072:
            X.0eS.A00(r1)     // Catch:{ RKe -> 0x0091 }
        L_0x0075:
            X.RnL r1 = (X.C10144RnL) r1     // Catch:{ RKe -> 0x0091 }
            X.RnK r2 = r1.A00     // Catch:{ NullPointerException -> 0x008c }
            boolean r0 = r2 instanceof X.C7385QAm     // Catch:{ NullPointerException -> 0x008c }
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "null cannot be cast to non-null type androidx.credentials.PasswordCredential"
            X.0qQ.A0C(r2, r0)     // Catch:{ NullPointerException -> 0x008c }
            X.QAm r2 = (X.C7385QAm) r2     // Catch:{ NullPointerException -> 0x008c }
            java.lang.String r1 = r2.A00     // Catch:{ NullPointerException -> 0x008c }
            java.lang.String r0 = r2.A01     // Catch:{ NullPointerException -> 0x008c }
            r8.A01(r1, r0)     // Catch:{ NullPointerException -> 0x008c }
            goto L_0x00b1
        L_0x008c:
            r0 = 0
            r8.A01(r0, r0)
            goto L_0x00b1
        L_0x0091:
            r0 = move-exception
            java.lang.String r4 = r0.A01()
            java.lang.String r5 = r0.getMessage()
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r0 = r0.A04
            X.19S r0 = X.19E.A02(r0)
            X.G85 r3 = r9.A02
            r6 = 0
            X.MES r2 = new X.MES
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
        L_0x00b1:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.credentialmanager.CredentialManagerFetchHelper.A00(com.instagram.login.credentialmanager.CredentialManagerFetchHelper, X.L8K, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r13.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0009
            int r1 = r13.length()
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            java.lang.String r2 = "retrieveCredentialResultListener"
            if (r0 != 0) goto L_0x003f
            if (r14 == 0) goto L_0x003f
            int r0 = r14.length()
            if (r0 == 0) goto L_0x003f
            X.L8K r1 = r12.A00
            if (r1 == 0) goto L_0x0056
            X.Lt8 r0 = new X.Lt8
            r0.<init>(r13, r14)
            X.Lt9 r7 = new X.Lt9
            r7.<init>(r0)
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r0 = r0.A04
            X.19S r3 = X.19E.A02(r0)
            X.G85 r8 = r1.A02
            androidx.fragment.app.Fragment r6 = r1.A00
            X.DiE r5 = r1.A03
            X.0aP r9 = r1.A01
            r10 = 0
            r11 = 6
            X.MGM r4 = new X.MGM
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        L_0x003b:
            X.AnonymousClass7TE.A1Z(r4, r3)
            return
        L_0x003f:
            X.L8K r1 = r12.A00
            if (r1 == 0) goto L_0x0056
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r0 = r0.A04
            X.19S r3 = X.19E.A02(r0)
            X.G85 r2 = r1.A02
            r1 = 0
            r0 = 41
            X.Fy5 r4 = new X.Fy5
            r4.<init>(r2, r1, r0)
            goto L_0x003b
        L_0x0056:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.credentialmanager.CredentialManagerFetchHelper.A01(java.lang.String, java.lang.String):void");
    }

    public CredentialManagerFetchHelper(Context context) {
        this.A02 = context;
    }
}
