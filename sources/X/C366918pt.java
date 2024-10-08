package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.8pt  reason: invalid class name and case insensitive filesystem */
public final class C366918pt {
    public static final C366918pt A00 = new Object();

    public final boolean A00(28D r2, C279284yO r3, C365758nd r4, boolean z) {
        if (r3 != AnonymousClass9QA.A00 || r4 != C365758nd.A04 || z) {
            return false;
        }
        switch (r2.ordinal()) {
            case 0:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 20:
            case 21:
            case 24:
            case 25:
            case 27:
            case 30:
            case 31:
            case 70:
            case 305:
            case 346:
            case 366:
            case 464:
            case 473:
            case 474:
            case 476:
            case 477:
            case 483:
            case 539:
            case 540:
                return true;
            default:
                return false;
        }
    }

    public final boolean A01(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 2342162927708282615L) || !182.A06(r2, userSession, 36319918492884707L) || !C364778lz.A00(userSession).booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A02(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 2342162927708282615L) || 182.A06(r2, userSession, 36319918492884707L) || !182.A06(r2, userSession, 36319918492819170L)) {
            return false;
        }
        return true;
    }

    public final boolean A03(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 2342162927708282615L) || !182.A06(r2, userSession, 36319918492884707L) || !C364768ly.A00(userSession).booleanValue()) {
            return false;
        }
        return true;
    }
}
