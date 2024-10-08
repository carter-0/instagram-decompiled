package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Q2  reason: invalid class name */
public final class AnonymousClass7Q2 implements AnonymousClass9FE {
    public final /* synthetic */ AnonymousClass9JK A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 0sP A02;

    public final void onError(Throwable th) {
    }

    public AnonymousClass7Q2(AnonymousClass9JK r1, UserSession userSession, 0sP r3) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r3.length() == 0) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r5) {
        /*
            r4 = this;
            X.9Ge r5 = (X.C376009Ge) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.9Gd r2 = r5.A00
            if (r2 == 0) goto L_0x0037
            com.instagram.common.session.UserSession r1 = r4.A01
            X.9JK r0 = r4.A00
            java.lang.String r3 = r2.A00(r0, r1)
        L_0x0012:
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r4.A01
            com.instagram.user.model.User r2 = r1.A01(r0)
            if (r3 == 0) goto L_0x0023
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            r0 = r0 ^ 1
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Eqy(r0)
            if (r3 == 0) goto L_0x0036
            X.0sP r0 = r4.A02
            r0.invoke(r3)
        L_0x0036:
            return
        L_0x0037:
            r3 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Q2.onSuccess(java.lang.Object):void");
    }
}
