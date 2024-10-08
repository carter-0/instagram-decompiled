package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HbB  reason: case insensitive filesystem */
public abstract class C55040HbB {
    public static final AnonymousClass3DY A00(UserSession userSession, Integer num) {
        if (num != AnonymousClass05K.A0C) {
            return null;
        }
        0Tu r5 = 0Tu.A06;
        String A04 = 182.A04(r5, userSession, 36881914963558823L);
        AnonymousClass3DY r2 = AnonymousClass3DY.AFI_AD_DWELL_SEE_MORE_CLICK;
        if (!0qQ.A0K(A04, "afi_ad_dwell_see_more_click")) {
            String A042 = 182.A04(r5, userSession, 36881914963558823L);
            r2 = AnonymousClass3DY.AFI_VIEW_SIMILAR;
            if (0qQ.A0K(A042, "afi_view_similar")) {
                return r2;
            }
            return null;
        }
        return r2;
    }
}
