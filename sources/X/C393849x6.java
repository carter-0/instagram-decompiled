package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

/* renamed from: X.9x6  reason: invalid class name and case insensitive filesystem */
public abstract class C393849x6 {
    public static final boolean A00(UserSession userSession, AnonymousClass3QO r4, ProductType productType, User user, boolean z, boolean z2) {
        0Tu r2;
        long j;
        if (!z || z2 || !2R8.A06(user) || r4 != AnonymousClass3QO.DEFAULT) {
            return false;
        }
        if (productType == ProductType.CLIPS) {
            r2 = 0Tu.A05;
            j = 36326653000955801L;
        } else if (productType != ProductType.FEED && productType != ProductType.FEED_CAROUSEL) {
            return false;
        } else {
            r2 = 0Tu.A05;
            j = 36326653001021338L;
        }
        boolean A06 = 182.A06(r2, userSession, j);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }
}
