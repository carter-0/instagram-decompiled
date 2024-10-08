package X;

/* renamed from: X.Vtg  reason: case insensitive filesystem */
public final class C18528Vtg {
    public static final C18528Vtg A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r7.A0y, 36322160465291238L) == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(com.instagram.business.promote.model.PromoteData r7) {
        /*
            r6 = this;
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r7.A0i
            if (r0 == 0) goto L_0x0017
            int r1 = r0.ordinal()
            r4 = 1
            r0 = 8
            if (r1 == r0) goto L_0x00dd
            r0 = 10
            if (r1 == r0) goto L_0x00dd
            if (r1 == r4) goto L_0x007b
            r0 = 12
            if (r1 == r0) goto L_0x007b
        L_0x0017:
            X.XA0 r3 = r7.A0Z
            if (r3 == 0) goto L_0x0032
            com.instagram.api.schemas.XIGIGBoostDestination r2 = r7.A0i
            if (r2 == 0) goto L_0x0032
            int r1 = r2.ordinal()
            r0 = 8
            if (r1 == r0) goto L_0x003c
            r0 = 10
            if (r1 == r0) goto L_0x003c
            r0 = 1
            if (r1 == r0) goto L_0x0033
            r0 = 12
            if (r1 == r0) goto L_0x0033
        L_0x0032:
            return
        L_0x0033:
            int r1 = r7.A08
            int r0 = r7.A0J
            int r1 = java.lang.Math.max(r1, r0)
            goto L_0x003e
        L_0x003c:
            int r1 = r7.A0B
        L_0x003e:
            X.UNS r3 = (X.UNS) r3
            int r5 = r3.A00
            int r4 = r3.A01
            boolean r0 = r7.A2v
            if (r0 != 0) goto L_0x0032
            if (r1 >= r5) goto L_0x0032
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.PROFILE_VISITS
            if (r2 == r0) goto L_0x0052
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CLICK
            if (r2 != r0) goto L_0x0061
        L_0x0052:
            com.instagram.common.session.UserSession r3 = r7.A0y
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322160465291238(0x810ad0000227e6, double:3.033618763626365E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 != 0) goto L_0x00ff
        L_0x0061:
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r7.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            if (r1 == r0) goto L_0x006b
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r1 != r0) goto L_0x0032
        L_0x006b:
            com.instagram.common.session.UserSession r3 = r7.A0y
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322160465225701(0x810ad0000127e5, double:3.0336187635849195E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 != 0) goto L_0x00ff
            return
        L_0x007b:
            int r2 = r7.A0J
            int r1 = r7.A0K
            int r0 = r7.A0L
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = java.lang.Math.max(r2, r0)
            X.XA0 r0 = r7.A0Z
            if (r0 == 0) goto L_0x00d5
            X.UNS r0 = (X.UNS) r0
            int r5 = r0.A00
        L_0x0091:
            int r0 = r7.A07
            if (r0 != 0) goto L_0x0017
            int r0 = r7.A08
            if (r0 >= r1) goto L_0x0017
            com.instagram.common.session.UserSession r2 = r7.A0y
            X.0qQ.A06(r2)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36603175880430462(0x820a650001137e, double:3.211334043718662E-306)
            long r1 = X.182.A01(r3, r2, r0)
            int r0 = (int) r1
            if (r0 != r4) goto L_0x0017
            int r2 = r7.A0J
            int r1 = r7.A0K
            int r0 = r7.A0L
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.max(r2, r0)
            if (r0 <= r2) goto L_0x00fb
            if (r5 >= r0) goto L_0x00fb
            com.instagram.common.session.UserSession r2 = r7.A0y
            X.0qQ.A06(r2)
            r0 = 36611082915289292(0x821196000218cc, double:3.21633448440246E-306)
            long r2 = X.182.A01(r3, r2, r0)
            int r1 = (int) r2
            if (r1 == r4) goto L_0x00da
            r0 = 2
            if (r1 == r0) goto L_0x00d7
            int r2 = r7.A0J
            goto L_0x00fb
        L_0x00d5:
            r5 = 0
            goto L_0x0091
        L_0x00d7:
            int r2 = r7.A0L
            goto L_0x00fb
        L_0x00da:
            int r2 = r7.A0K
            goto L_0x00fb
        L_0x00dd:
            int r0 = r7.A07
            if (r0 != 0) goto L_0x0017
            int r1 = r7.A08
            int r0 = r7.A0B
            if (r1 >= r0) goto L_0x0017
            com.instagram.common.session.UserSession r3 = r7.A0y
            X.0qQ.A06(r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326038820632029(0x810e57000035dd, double:3.036071451160765E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0017
            int r2 = r7.A0B
        L_0x00fb:
            r7.A08 = r2
            goto L_0x0017
        L_0x00ff:
            r7.A08 = r5
            r7.A09 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18528Vtg.A00(com.instagram.business.promote.model.PromoteData):void");
    }
}
