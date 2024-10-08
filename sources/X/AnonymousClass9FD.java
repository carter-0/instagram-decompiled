package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9FD  reason: invalid class name */
public final class AnonymousClass9FD implements AnonymousClass9FE {
    public final /* synthetic */ AnonymousClass9JK A00;
    public final /* synthetic */ UserSession A01;

    public final void onError(Throwable th) {
    }

    public AnonymousClass9FD(AnonymousClass9JK r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r1 == 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r5) {
        /*
            r4 = this;
            X.9Ge r5 = (X.C376009Ge) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = r4.A01
            com.instagram.user.model.User r2 = r0.A01(r3)
            X.9Gd r1 = r5.A00
            if (r1 == 0) goto L_0x0021
            X.9JK r0 = r4.A00
            java.lang.String r0 = r1.A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            r0 = r0 ^ 1
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Eqy(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9FD.onSuccess(java.lang.Object):void");
    }
}
