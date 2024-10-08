package X;

public final class ECU extends 1P0 {
    public final /* synthetic */ C320106rm A00;
    public final /* synthetic */ C322886wZ A01;

    public ECU(C320106rm r1, C322886wZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-1338579231);
        C320106rm r1 = this.A00;
        r1.A0E("fetch_request_fail");
        r1.A00.A01();
        this.A01.A03.A0L(C322496vv.Closed);
        AnonymousClass0fD.A0A(972535898, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(324766668);
        this.A01.A03.A0L(C322496vv.Loading);
        AnonymousClass0fD.A0A(1720118751, A03);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = -1686941525(0xffffffff9b7350ab, float:-2.0126554E-22)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.7ax r9 = (X.C334247ax) r9
            r0 = -1390244393(0xffffffffad228dd7, float:-9.240129E-12)
            int r4 = X.AnonymousClass7TG.A0D(r9, r0)
            X.6rm r1 = r8.A00
            java.lang.String r0 = "fetch_request_end"
            r1.A0E(r0)
            X.C46329Dbx.A00(r1)
            X.6wZ r6 = r8.A01
            com.instagram.common.session.UserSession r3 = r6.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329225686499194(0x81113d00023f7a, double:3.038086837967639E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            com.instagram.profile.fragment.UserDetailTabController r3 = r6.A03
            X.6vu r0 = r3.A0P
            com.instagram.user.model.User r7 = r0.A0J
            if (r1 == 0) goto L_0x0040
            if (r7 != 0) goto L_0x004d
            r0 = 420304775(0x190d5787, float:7.307205E-24)
        L_0x0036:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1489985922(0xffffffffa7309e7e, float:-2.4510825E-15)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0040:
            if (r7 != 0) goto L_0x004d
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1556772266(0xffffffffa3358a56, float:-9.8413234E-18)
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x004d:
            X.3HQ r1 = r9.A00
            java.lang.Object r0 = r1.FH3()
            X.7dC r0 = (X.C335587dC) r0
            java.lang.Boolean r2 = r0.Ae2()
            java.lang.Object r0 = r1.FH3()
            X.7dC r0 = (X.C335587dC) r0
            java.lang.Boolean r1 = r0.BAl()
            if (r2 == 0) goto L_0x006a
            X.4Cl r0 = r7.A03
            r0.EPK(r2)
        L_0x006a:
            if (r1 == 0) goto L_0x0071
            X.4Cl r0 = r7.A03
            r0.EY2(r1)
        L_0x0071:
            java.util.List r1 = r9.getItems()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x008c
            r7.A0w(r1)
            com.instagram.profile.fragment.UserDetailFragment r0 = r6.A02
            r0.A0t()
            X.6vv r0 = X.C322496vv.Open
        L_0x0085:
            r3.A0L(r0)
            r0 = -613213600(0xffffffffdb731a60, float:-6.8427419E16)
            goto L_0x0036
        L_0x008c:
            X.6vv r0 = X.C322496vv.Closed
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ECU.onSuccess(java.lang.Object):void");
    }
}
