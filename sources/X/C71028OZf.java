package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OZf  reason: case insensitive filesystem */
public final class C71028OZf {
    public final AnonymousClass7BV A00;
    public final AnonymousClass43S A01;
    public final C74484Pve A02;
    public final Integer A03;
    public final boolean A04;
    public volatile AnonymousClass2Ep A05;

    public C71028OZf() {
        this((AnonymousClass7BV) null, (AnonymousClass43S) null, (C74484Pve) null, (Integer) null, false);
    }

    public static final void A00(C370538wd r4, C71028OZf oZf) {
        AnonymousClass43S r3;
        if (!(r4 == null || (r3 = oZf.A01) == null)) {
            AnonymousClass7BV r2 = oZf.A00;
            r3.A0B(r2, "is_ttlc_thread", r4.A03());
            r3.A0B(r2, "is_tlc_thread", r4.A03());
        }
        AnonymousClass43S r1 = oZf.A01;
        if (r1 != null) {
            r1.A0C(oZf.A00);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C268654dm r6) {
        /*
            r5 = this;
            boolean r4 = r6 instanceof X.C268674do
            java.lang.String r2 = "DirectThreadLoader"
            if (r4 != 0) goto L_0x003a
            java.lang.String r0 = "thread fetch failed for an unknown reason"
        L_0x0008:
            X.0KC.A0E(r2, r0)
        L_0x000b:
            java.lang.String r3 = "unknown_error"
            if (r4 == 0) goto L_0x001e
            X.4do r6 = (X.C268674do) r6
            java.lang.Throwable r0 = r6.A01()
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x001b:
            if (r0 == 0) goto L_0x001e
            r3 = r0
        L_0x001e:
            X.43S r2 = r5.A01
            if (r2 == 0) goto L_0x0029
            X.7BV r1 = r5.A00
            java.lang.String r0 = "server"
            r2.A0A(r1, r0, r3)
        L_0x0029:
            X.Pve r0 = r5.A02
            if (r0 == 0) goto L_0x0030
            r0.onFailure()
        L_0x0030:
            return
        L_0x0031:
            java.lang.Object r0 = r6.A00
            X.1XT r0 = (X.AnonymousClass1XT) r0
            java.lang.String r0 = r0.getErrorMessage()
            goto L_0x001b
        L_0x003a:
            r0 = r6
            X.4do r0 = (X.C268674do) r0
            java.lang.Throwable r1 = r0.A01()
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = "thread fetch failed because of a throwable"
            X.0KC.A0J(r2, r0, r1)
            goto L_0x000b
        L_0x0049:
            java.lang.Object r0 = r0.A00
            X.1XT r0 = (X.AnonymousClass1XT) r0
            java.lang.String r1 = r0.getErrorMessage()
            if (r1 != 0) goto L_0x0055
            java.lang.String r1 = ""
        L_0x0055:
            int r0 = r0.getStatusCode()
            java.lang.String r0 = X.002.A03(r0, r1)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71028OZf.A01(X.4dm):void");
    }

    public final void A02(UserSession userSession, C370538wd r6) {
        AnonymousClass3U9 FKy;
        String str;
        A00(r6, this);
        2Dm A002 = 1bJ.A00(userSession);
        A002.CnE("ThreadLoaderOnSuccess");
        if (r6 == null) {
            DbT.A1Q(0wj.A01, "DirectThreadLoader: threadPagedResult is null", 20134884);
            FKy = null;
        } else {
            FKy = A002.FKy(r6, r6.A0o, r6, this.A04);
        }
        this.A05 = FKy;
        AnonymousClass2Ep r0 = this.A05;
        if (r0 != null) {
            A002.EKE(r0.BJy());
        }
        AnonymousClass2Ep r2 = this.A05;
        if (r2 != null && (str = r2.BJy().A00) != null && r2.C6a() == 29 && C51966G9m.A1W(userSession, r2.AsX()) && 182.A06(0Tu.A05, userSession, 36319407394790730L)) {
            C71129OdS.A06(userSession, this.A03, str, (String) null);
        }
        C74484Pve pve = this.A02;
        if (pve != null) {
            pve.onSuccessInBackground(this.A05);
        }
    }

    public C71028OZf(AnonymousClass7BV r1, AnonymousClass43S r2, C74484Pve pve, Integer num, boolean z) {
        this.A02 = pve;
        this.A04 = z;
        this.A03 = num;
        this.A01 = r2;
        this.A00 = r1;
    }
}
