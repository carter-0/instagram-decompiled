package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.51x  reason: invalid class name and case insensitive filesystem */
public abstract class C2804551x {
    public static final boolean A00(UserSession userSession, ProductType productType, String str, int i) {
        0Tu r2;
        long j;
        0qQ.A0B(userSession, 0);
        if (productType != null) {
            int ordinal = productType.ordinal();
            if (ordinal == 13) {
                r2 = 0Tu.A05;
                j = 36318346534262874L;
            } else if (ordinal == 9) {
                r2 = 0Tu.A05;
                j = 36318346534328411L;
            }
            if (182.A06(r2, userSession, j)) {
                return true;
            }
        }
        if (i <= -1) {
            return false;
        }
        if (0qQ.A0K(str, "clips_viewer_clips_tab") && productType == ProductType.CLIPS) {
            0Tu r4 = 0Tu.A05;
            if (182.A06(r4, userSession, 36318346534393948L) && ((long) i) >= 182.A01(r4, userSession, 36599821511167609L)) {
                return true;
            }
        }
        if (!0qQ.A0K(str, "feed_timeline") || productType != ProductType.CLIPS) {
            return false;
        }
        0Tu r22 = 0Tu.A05;
        if (!182.A06(r22, userSession, 36318346534525021L) || ((long) i) < 182.A01(r22, userSession, 36599821511298682L)) {
            return false;
        }
        return true;
    }
}
