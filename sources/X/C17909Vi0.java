package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Vi0  reason: case insensitive filesystem */
public final class C17909Vi0 {
    public final C14929UFq A00;
    public final 0wc A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final UserSession A05;
    public final AnonymousClass4DU A06;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.Long r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, int r12) {
        /*
            r6 = this;
            X.0wc r1 = r6.A01
            java.lang.String r0 = "instagram_shopping_checker_tile_tap"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r6.A02
            X.C13988Tno.A1C(r5, r0)
            java.lang.String r1 = r6.A03
            java.lang.String r0 = "prior_submodule"
            r5.AAJ(r0, r1)
            java.lang.String r0 = "submodule"
            r5.AAJ(r0, r8)
            java.lang.String r1 = r6.A04
            java.lang.String r0 = "shopping_session_id"
            X.C51973G9u.A14(r5, r0, r1)
            java.lang.String r1 = X.C320166rs.A01(r11, r12)
            java.lang.String r0 = "position"
            r5.AAJ(r0, r1)
            X.UFq r1 = r6.A00
            java.lang.String r0 = "feed_item_info"
            r5.AAK(r1, r0)
            if (r10 == 0) goto L_0x0052
            X.4Ny r1 = X.C263944Ny.A00(r10)
            java.lang.String r0 = "marketer_id"
        L_0x003e:
            r5.AAE(r1, r0)
        L_0x0041:
            if (r7 == 0) goto L_0x004e
            r3 = 0
            long r1 = r7.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            X.C13991Tnr.A14(r5, r7, r0)
        L_0x004e:
            r5.Cgf()
        L_0x0051:
            return
        L_0x0052:
            if (r9 == 0) goto L_0x0041
            X.4Ny r1 = X.C263944Ny.A00(r9)
            java.lang.String r0 = "merchant_id"
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17909Vi0.A00(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    public C17909Vi0(UserSession userSession, AnonymousClass4DU r5, String str, String str2, String str3, String str4) {
        0bb r2;
        this.A06 = r5;
        this.A05 = userSession;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = AnonymousClass0kN.A01(r5, userSession);
        if (str4 != null) {
            r2 = new 0bb();
            r2.A06("m_pk", str4);
            r2.A06("tracking_token", C231122qu.A0I(userSession, str4));
        } else {
            r2 = null;
        }
        this.A00 = r2;
    }
}
