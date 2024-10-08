package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8qA  reason: invalid class name and case insensitive filesystem */
public abstract class C367088qA {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        Boolean Cbx = 0eE.A00(userSession).A00().A03.Cbx();
        if (Cbx != null) {
            return Cbx.booleanValue();
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 0eE.A00(userSession).A00().A0U().contains(C367098qB.POST_PRODUCT_TAG);
    }

    public static final boolean A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        Boolean BVd = 0eE.A00(userSession).A00().A03.BVd();
        if (BVd != null) {
            return BVd.booleanValue();
        }
        return false;
    }

    public static final boolean A02(UserSession userSession) {
        0eE r3 = AnonymousClass0t1.A01;
        if (r3.A01(userSession).A0U().contains(C367098qB.STORY_MULTI_PRODUCT_STICKER) || r3.A01(userSession).A0U().contains(C367098qB.STORY_PRODUCT_COLLECTION_STICKER) || r3.A01(userSession).A0U().contains(C367098qB.STORY_STOREFRONT_STICKER) || A06(userSession, true)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        if (AnonymousClass0t1.A01.A01(userSession).A0J() == 16V.A05) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession, boolean z) {
        0Tu r2;
        if (AnonymousClass0t1.A01.A01(userSession).A0U().contains(C367098qB.STORY_ORGANIC_PRODUCT_TAGGING_STICKER)) {
            if (z) {
                r2 = 0Tu.A05;
            } else {
                r2 = 0Tu.A06;
            }
            if (!182.A06(r2, userSession, 36314648567548657L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession, boolean z) {
        if (AnonymousClass0t1.A01.A01(userSession).A0U().contains(C367098qB.STORY_PRODUCT_STICKER) || A05(userSession, z)) {
            return true;
        }
        return false;
    }
}
