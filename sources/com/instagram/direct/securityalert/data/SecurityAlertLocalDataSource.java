package com.instagram.direct.securityalert.data;

import X.05G;
import X.AnonymousClass7TG;
import X.C62154KbC;
import X.DbS;
import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.room.SecurityAlertDatabase;

public final class SecurityAlertLocalDataSource {
    public final UserSession A00;
    public final C62154KbC A01;
    public final SecurityAlertDatabase A02;
    public final 05G A03 = DbS.A10("");

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r9) {
        /*
            r8 = this;
            r3 = 28
            boolean r0 = X.ME7.A02(r3, r9)
            if (r0 == 0) goto L_0x0053
            r6 = r9
            X.ME7 r6 = (X.ME7) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0053
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A01
            X.1Hj r7 = X.1Hj.A02
            int r2 = r6.A00
            r1 = 1
            if (r2 == 0) goto L_0x0029
            if (r2 != r1) goto L_0x005b
            X.0eS.A00(r0)
        L_0x0024:
            if (r0 != 0) goto L_0x0028
        L_0x0026:
            X.0sn r0 = X.0sn.A00
        L_0x0028:
            return r0
        L_0x0029:
            X.0eS.A00(r0)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r5 = r8.A00
            com.instagram.user.model.User r0 = r0.A01(r5)
            java.lang.Long r0 = r0.BST()
            if (r0 == 0) goto L_0x0026
            long r3 = r0.longValue()
            r6.A00 = r1
            X.12T r0 = X.AnonymousClass12T.A00
            r2 = 0
            X.0nV r1 = X.DbX.A0c(r0)
            X.MGH r0 = new X.MGH
            r0.<init>(r5, r2, r3)
            java.lang.Object r0 = X.1Eo.A00(r6, r1, r0)
            if (r0 != r7) goto L_0x0024
            return r7
        L_0x0053:
            r0 = 42
            X.ME7 r6 = new X.ME7
            r6.<init>(r8, r9, r3, r0)
            goto L_0x0016
        L_0x005b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource.A00(X.4D7):java.lang.Object");
    }

    public SecurityAlertLocalDataSource(UserSession userSession, C62154KbC kbC, SecurityAlertDatabase securityAlertDatabase) {
        AnonymousClass7TG.A1U(userSession, securityAlertDatabase, kbC);
        this.A00 = userSession;
        this.A02 = securityAlertDatabase;
        this.A01 = kbC;
    }
}
