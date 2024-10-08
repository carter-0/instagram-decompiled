package com.instagram.direct.securityalert.debug;

import X.00y;
import X.2SP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C60890JtA;
import X.C61022JvM;
import X.DbX;
import java.util.UUID;

public final class SecurityAlertDevUtils {
    public static int A00 = 100;
    public static final SecurityAlertDevUtils A01 = new Object();

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.common.session.UserSession r9, com.instagram.direct.securityalert.debug.SecurityAlertDevUtils r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 35
            boolean r0 = X.C66129MDh.A01(r3, r11)
            if (r0 == 0) goto L_0x006c
            r5 = r11
            X.MDh r5 = (X.C66129MDh) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r1 = 1
            if (r0 == 0) goto L_0x0046
            if (r0 != r1) goto L_0x0072
            X.0eS.A00(r2)
        L_0x0024:
            java.util.Collection r2 = (java.util.Collection) r2
            X.2SQ r0 = X.2SP.A00
            java.lang.Object r6 = X.00k.A0H(r2, r0)
            if (r6 != 0) goto L_0x0045
            int r1 = A00
            int r0 = r1 + 1
            A00 = r0
            java.lang.String r9 = java.lang.String.valueOf(r1)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = "00 11 22 33 44 55 66 77 88 99 AA BB CC DD EE FF 00 11 22 33 44 55 66 77 88 99 AA BB CC DD EE FF 00"
            java.lang.String r11 = "mock device"
            X.JtA r6 = new X.JtA
            r6.<init>(r7, r9, r10, r11)
        L_0x0045:
            return r6
        L_0x0046:
            X.0eS.A00(r2)
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.JaB r0 = com.instagram.direct.securityalert.data.SecurityAlertRepository.A04
            com.instagram.direct.securityalert.data.SecurityAlertRepository r4 = r0.A00(r9)
            r5.A01 = r10
            r5.A00 = r1
            X.4Cq r0 = r4.A01
            X.4Cc r3 = r0.ArX()
            r2 = 0
            r1 = 26
            X.MGt r0 = new X.MGt
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            java.lang.Object r2 = X.1Eo.A00(r5, r3, r0)
            if (r2 != r6) goto L_0x0024
            return r6
        L_0x006c:
            X.MDh r5 = new X.MDh
            r5.<init>(r10, r11, r3)
            goto L_0x0016
        L_0x0072:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.securityalert.debug.SecurityAlertDevUtils.A02(com.instagram.common.session.UserSession, com.instagram.direct.securityalert.debug.SecurityAlertDevUtils, X.4D7):java.lang.Object");
    }

    public static final C61022JvM A00(C60890JtA jtA) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("mock/");
        String A0i = AnonymousClass7TF.A0i(UUID.randomUUID(), A1A);
        long currentTimeMillis = System.currentTimeMillis();
        int A012 = DbX.A01(00y.A0l(jtA.A01));
        2SP r6 = 2SP.A01;
        return new C61022JvM(Double.valueOf(r6.A01(-90.0d, 90.0d)), Double.valueOf(r6.A01(-180.0d, 180.0d)), (Long) null, (Long) null, A0i, "Menlo Park, CA", "Meta Mock Device", "iOS", 3, 1, A012, currentTimeMillis, false);
    }

    public static final C61022JvM A01(C60890JtA jtA) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("mock/");
        String A0i = AnonymousClass7TF.A0i(UUID.randomUUID(), A1A);
        long currentTimeMillis = System.currentTimeMillis();
        int A012 = DbX.A01(00y.A0l(jtA.A01));
        2SP r6 = 2SP.A01;
        return new C61022JvM(Double.valueOf(r6.A01(-90.0d, 90.0d)), Double.valueOf(r6.A01(-180.0d, 180.0d)), (Long) null, (Long) null, A0i, "Menlo Park, CA", "Meta Mock Device", "iOS", 3, 2, A012, currentTimeMillis, false);
    }
}
