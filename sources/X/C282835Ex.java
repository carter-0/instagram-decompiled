package X;

import com.instagram.api.schemas.MoreInfoType;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.5Ex  reason: invalid class name and case insensitive filesystem */
public final class C282835Ex {
    public static final C282835Ex A00 = new Object();
    public static final Set A01 = 0sc.A07(new MoreInfoType[]{MoreInfoType.PROMOTION, MoreInfoType.HEADLINE});

    public final boolean A03(UserSession userSession, 1Xj r5, AnonymousClass4DU r6) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r5, 2);
        if (!A02(r5) || !A01(userSession, r6.getModuleName()) || !A00(userSession, r5) || !182.A06(0Tu.A05, userSession, 36326579986511708L)) {
            return false;
        }
        return true;
    }

    public final boolean A04(UserSession userSession, 1Xj r5, AnonymousClass4DU r6) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r5, 2);
        if (!A02(r5) || !A01(userSession, r6.getModuleName()) || !A00(userSession, r5) || !182.A06(0Tu.A05, userSession, 36326579987036003L)) {
            return false;
        }
        return true;
    }

    public final boolean A05(UserSession userSession, 1Xj r5, AnonymousClass4DU r6) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r5, 2);
        if (!A02(r5) || !A01(userSession, r6.getModuleName()) || !A00(userSession, r5) || !182.A06(0Tu.A05, userSession, 36326579986577245L)) {
            return false;
        }
        return true;
    }

    public final boolean A06(UserSession userSession, 1Xj r5, String str) {
        0qQ.A0B(str, 1);
        if (!A01(userSession, str) || !A00(userSession, r5) || !182.A06(0Tu.A05, userSession, 36326579986642782L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(1Xj r2) {
        MoreInfoType moreInfoType;
        C270854hQ At8;
        Set set = A01;
        AnonymousClass41Z BUC = r2.A0C.BUC();
        if (BUC == null || (At8 = BUC.At8()) == null) {
            moreInfoType = null;
        } else {
            moreInfoType = At8.BUD();
        }
        return 00k.A0u(set, moreInfoType);
    }

    public static final boolean A00(UserSession userSession, 1Xj r4) {
        if (!r4.CcK() && !182.A06(0Tu.A05, userSession, 36326579986773856L)) {
            return false;
        }
        if (r4.A60() || r4.A5e()) {
            return 182.A06(0Tu.A05, userSession, 36326579986839393L);
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, String str) {
        String str2;
        int hashCode = str.hashCode();
        if (hashCode != -975990334) {
            if (hashCode == 339532540) {
                str2 = "feed_contextual_profile";
            } else if (hashCode != 877420756) {
                return false;
            } else {
                str2 = "feed_contextual_chain";
            }
            if (str.equals(str2)) {
                return 182.A06(0Tu.A05, userSession, 36326579986708319L);
            }
            return false;
        } else if (!str.equals("feed_timeline")) {
            return false;
        } else {
            return true;
        }
    }
}
