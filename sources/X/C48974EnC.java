package X;

/* renamed from: X.EnC  reason: case insensitive filesystem */
public abstract class C48974EnC {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        if (r6 == null) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r5, android.os.Bundle r6, X.0lg r7, boolean r8) {
        /*
            r1 = 0
            r3 = 1
            X.2cc r0 = X.C71342cb.A00(r7)
            r0.A06(r5)
            android.content.Intent r2 = X.DbS.A09()
            if (r6 == 0) goto L_0x0095
            java.lang.String r0 = "IS_ADD_ACCOUNT_FLOW"
            boolean r0 = r6.getBoolean(r0, r1)
            if (r0 != r3) goto L_0x0095
            X.DbX.A0z(r5)
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = "SHOULD_START_AT_SAC_REG_FLOW"
            boolean r0 = r6.getBoolean(r0)
            if (r0 != 0) goto L_0x0098
            X.0Tu r4 = X.0Tu.A05
            r0 = 18312769887549656(0x410f5e000038d8, double:1.8979911248901988E-307)
            boolean r0 = X.1AW.A06(r4, r0)
            if (r0 == 0) goto L_0x0098
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.String r1 = r7.A06
            r0 = 494(0x1ee, float:6.92E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putExtra(r0, r1)
            java.lang.String r1 = r7.A05
            java.lang.String r0 = "last_logged_in_ig_access_token"
            r2.putExtra(r0, r1)
            r0 = 676(0x2a4, float:9.47E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putExtra(r0, r3)
            r0 = 1199(0x4af, float:1.68E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.setClassName(r5, r0)
        L_0x0059:
            java.lang.String r1 = X.DbS.A0m(r6)
            if (r1 == 0) goto L_0x0064
            java.lang.String r0 = "launched_url"
            r2.putExtra(r0, r1)
        L_0x0064:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.setFlags(r0)
            if (r6 == 0) goto L_0x008c
            java.lang.String r1 = "confirm_email_encoded_email"
            java.lang.String r0 = r6.getString(r1)
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = X.C49023Enz.A00(r0)
            r6.putString(r1, r0)
        L_0x007a:
            java.lang.String r1 = "confirm_email_nonce"
            java.lang.String r0 = r6.getString(r1)
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = X.C49023Enz.A00(r0)
            r6.putString(r1, r0)
        L_0x0089:
            r2.putExtras(r6)
        L_0x008c:
            X.0kR.A0B(r5, r2)
            if (r8 == 0) goto L_0x0094
            r5.finish()
        L_0x0094:
            return
        L_0x0095:
            java.lang.String r0 = "com.instagram.nux.activity.BloksSignedOutFragmentActivity"
            goto L_0x009e
        L_0x0098:
            r0 = 1200(0x4b0, float:1.682E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x009e:
            r2.setClassName(r5, r0)
            if (r6 == 0) goto L_0x0064
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48974EnC.A00(android.app.Activity, android.os.Bundle, X.0lg, boolean):void");
    }
}
