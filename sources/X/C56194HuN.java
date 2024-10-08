package X;

/* renamed from: X.HuN  reason: case insensitive filesystem */
public abstract class C56194HuN {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        r0 = (r0 = (X.C275544qW) X.00k.A0J((r0 = r4.A04))).Bid();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.0Aj r3, X.C53278GlQ r4, X.C57282IVr r5, java.lang.String r6, java.util.Map r7) {
        /*
            java.lang.String r2 = ""
            java.lang.String r0 = "afi_type"
            r3.AAJ(r0, r6)
            java.lang.String r1 = r5.A05
            java.lang.String r0 = "ad_tracking_token"
            r3.AAJ(r0, r1)
            java.lang.String r0 = "extra_data"
            r3.A9H(r0, r7)
            java.lang.Integer r0 = r5.A04
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "trigger_source"
            r3.AAJ(r0, r1)
            if (r4 == 0) goto L_0x0033
            java.util.List r0 = r4.A04
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = X.00k.A0J(r0)
            X.4qW r0 = (X.C275544qW) r0
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r0.Bid()
            if (r0 == 0) goto L_0x0033
            return r0
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56194HuN.A00(X.0Aj, X.GlQ, X.IVr, java.lang.String, java.util.Map):java.lang.String");
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ad_share";
            case 2:
                return "ad_dwell";
            case 3:
                return "invalid";
            case 4:
                return C273654mx.A00(969);
            case 5:
                return "story_ad_share";
            case 6:
                return "dwell_reels_see_more_less";
            case 7:
                return "ads_overflow_menu";
            case 8:
                return "ad_ufi";
            default:
                return "ad_cta";
        }
    }
}
