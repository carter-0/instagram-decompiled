package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.GDw  reason: case insensitive filesystem */
public abstract class C52076GDw {
    public static final Set A00;
    public static final Set A01;
    public static final Set A02;

    public static final GJR A00(1Xj r2) {
        0qQ.A0B(r2, 0);
        if (r2.CcK()) {
            return GJR.ADS;
        }
        if (r2.A5D()) {
            if (r2.A5h()) {
                return GJR.CAROUSEL_WITH_MUSIC;
            }
            if (r2.A6O(0)) {
                return GJR.CAROUSEL_WITH_VIDEO_IN_FIRST_POSITION;
            }
            1Xj A1c = r2.A1c(0);
            if (A1c != null && A1c.A5p()) {
                return GJR.CAROUSEL_WITH_PHOTO_IN_FIRST_POSITION;
            }
            throw new IllegalStateException("ClipsOrganicType: Unsupported carousel type");
        } else if (r2.CeS()) {
            return GJR.CLIPS;
        } else {
            if (!r2.A5p()) {
                return GJR.UNRECOGNIZED;
            }
            if (r2.A5h()) {
                return GJR.PHOTO_WITH_MUSIC;
            }
            return GJR.PHOTO_WITHOUT_MUSIC;
        }
    }

    public static final boolean A03(C267324bN r2) {
        GJR gjr;
        0qQ.A0B(r2, 0);
        Set set = A00;
        1Xj r0 = r2.A02;
        if (r0 != null) {
            gjr = A00(r0);
        } else {
            gjr = null;
        }
        return 00k.A0u(set, gjr);
    }

    public static final boolean A05(C267324bN r4, UserSession userSession) {
        C257853y4 r0;
        0qQ.A0B(r4, 0);
        0qQ.A0B(userSession, 1);
        1Xj r02 = r4.A02;
        if (r02 != null && A00(r02).equals(GJR.CAROUSEL_WITH_MUSIC)) {
            return true;
        }
        if (!r4.A0E() || (r0 = r4.A06().A0I) == null || r0.BUi() == null || !182.A06(0Tu.A05, userSession, 36320541262684744L)) {
            return false;
        }
        return true;
    }

    static {
        GJR gjr = GJR.CAROUSEL_WITH_MUSIC;
        A00 = C51967G9n.A0t(new GJR[]{gjr, GJR.CAROUSEL_WITH_PHOTO_IN_FIRST_POSITION, GJR.CAROUSEL_WITH_VIDEO_IN_FIRST_POSITION}, 0);
        GJR gjr2 = GJR.PHOTO_WITH_MUSIC;
        A02 = C51967G9n.A0t(new GJR[]{gjr2, GJR.PHOTO_WITHOUT_MUSIC}, 0);
        A01 = C51967G9n.A0t(new GJR[]{gjr2, gjr}, 0);
    }

    public static final List A01(C267324bN r4) {
        List list = r4.A0R;
        if (list == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            1Xj r1 = (1Xj) next;
            if (r1.CeS() || r1.A5h()) {
                A1C.add(next);
            }
        }
        return A1C;
    }

    public static final boolean A02(C267324bN r3) {
        List A012;
        1Xj r0 = r3.A02;
        if (r0 == null || !r0.A5D() || (A012 = A01(r3)) == null || !(!A012.isEmpty())) {
            return false;
        }
        return true;
    }

    public static final boolean A04(C267324bN r2) {
        GJR gjr;
        Set set = A02;
        1Xj r0 = r2.A02;
        if (r0 != null) {
            gjr = A00(r0);
        } else {
            gjr = null;
        }
        if (00k.A0u(set, gjr) || A03(r2)) {
            return true;
        }
        return false;
    }
}
