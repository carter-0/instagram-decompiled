package com.instagram.login.credentialmanager;

import X.19E;
import X.AnonymousClass12T;
import X.C262224Cq;
import android.content.Context;

public final class CredentialManagerSaveHelper {
    public final C262224Cq A00 = 19E.A02(AnonymousClass12T.A00.CO6(759212040, 3));
    public final Context A01;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[Catch:{ RKd -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.login.credentialmanager.CredentialManagerSaveHelper r7, X.C49371EuZ r8, java.lang.String r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r5 = 0
            boolean r0 = X.ME9.A03(r5, r11)
            if (r0 == 0) goto L_0x0025
            r6 = r11
            X.ME9 r6 = (X.ME9) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0025
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r3) goto L_0x002b
            java.lang.Object r8 = r6.A02
            X.EuZ r8 = (X.C49371EuZ) r8
            goto L_0x004c
        L_0x0025:
            X.ME9 r6 = new X.ME9
            r6.<init>(r7, r11, r5)
            goto L_0x0015
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0030:
            X.0eS.A00(r1)
            android.content.Context r2 = r7.A01
            X.SdH r1 = new X.SdH
            r1.<init>(r2)
            X.QAg r0 = new X.QAg     // Catch:{ RKd -> 0x005d }
            r0.<init>(r9, r10)     // Catch:{ RKd -> 0x005d }
            r6.A01 = r7     // Catch:{ RKd -> 0x005d }
            r6.A02 = r8     // Catch:{ RKd -> 0x005d }
            r6.A00 = r3     // Catch:{ RKd -> 0x005d }
            java.lang.Object r1 = r1.ALk(r2, r0, r6)     // Catch:{ RKd -> 0x005d }
            if (r1 != r4) goto L_0x004f
            return r4
        L_0x004c:
            X.0eS.A00(r1)     // Catch:{ RKd -> 0x005d }
        L_0x004f:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.credentials.CreatePasswordResponse"
            X.0qQ.A0C(r1, r0)     // Catch:{ RKd -> 0x005d }
            if (r8 == 0) goto L_0x007c
            X.G78 r1 = r8.A00     // Catch:{ RKd -> 0x005d }
            r0 = 0
            r1.D5C(r3, r0)     // Catch:{ RKd -> 0x005d }
            goto L_0x007c
        L_0x005d:
            r0 = move-exception
            if (r8 == 0) goto L_0x007c
            java.lang.String r4 = r0.A00()
            java.lang.String r3 = r0.getMessage()
            X.0qQ.A0B(r4, r5)
            X.G78 r2 = r8.A00
            java.lang.String r1 = "Credential manager save failed: errorType:"
            r0 = 2014(0x7de, float:2.822E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0u(r1, r4, r0, r3)
            r2.D5C(r5, r0)
        L_0x007c:
            X.0gF r4 = X.C60340gF.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.credentialmanager.CredentialManagerSaveHelper.A00(com.instagram.login.credentialmanager.CredentialManagerSaveHelper, X.EuZ, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public CredentialManagerSaveHelper(Context context) {
        this.A01 = context;
    }
}
