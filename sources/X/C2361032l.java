package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.32l  reason: invalid class name and case insensitive filesystem */
public final class C2361032l implements C2361132m {
    public final UserSession A00;
    public final C234172xD A01;
    public final C231332rR A02;

    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DF7(X.AnonymousClass1Xn r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.1Xj
            if (r0 == 0) goto L_0x0020
            X.2xD r2 = r3.A01
            if (r2 == 0) goto L_0x0018
            r0 = r4
            X.1Xj r0 = (X.1Xj) r0
            r2.A01(r0)
            X.ITe r1 = new X.ITe
            r1.<init>(r3, r4)
        L_0x0013:
            java.util.Map r0 = r2.A06
            r0.put(r4, r1)
        L_0x0018:
            X.2xD r0 = r3.A01
            if (r0 == 0) goto L_0x001f
            r0.A00()
        L_0x001f:
            return
        L_0x0020:
            boolean r0 = r4 instanceof X.C270054g7
            if (r0 == 0) goto L_0x0018
            X.2xD r2 = r3.A01
            if (r2 == 0) goto L_0x0018
            r0 = 1
            r2.A00 = r0
            X.ITd r1 = new X.ITd
            r1.<init>(r3)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2361032l.DF7(X.1Xn):void");
    }

    public final void DYo() {
        C234172xD r0 = this.A01;
        if (r0 != null) {
            r0.onPause();
        }
    }

    public final void Ds6() {
        this.A02.AV9();
    }

    public C2361032l(UserSession userSession, C234172xD r2, C231332rR r3) {
        this.A00 = userSession;
        this.A02 = r3;
        this.A01 = r2;
    }
}
