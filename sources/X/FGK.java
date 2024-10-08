package X;

import com.instagram.common.session.UserSession;

public final class FGK {
    public static final FGK A00 = new Object();

    public static final boolean A01(UserSession userSession, C245893de r5) {
        0qQ.A0B(userSession, 0);
        if (!C245953dk.A00(userSession, r5)) {
            return false;
        }
        FGK fgk = A00;
        if ((!C249223jK.A02(userSession)) && 182.A06(0Tu.A05, userSession, 36320652936749812L)) {
            return true;
        }
        if (!fgk.A06(userSession) || !182.A06(0Tu.A05, userSession, 36320652936880886L)) {
            return false;
        }
        return true;
    }

    public final boolean A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!(!C249223jK.A02(userSession))) {
            return false;
        }
        if ((!A05(userSession) || !A04(userSession)) && A00(userSession) != EW5.RecipientListMediaPreviewOnly) {
            return false;
        }
        return true;
    }

    public static final EW5 A00(UserSession userSession) {
        long A01 = 182.A01(0Tu.A05, userSession, 36602127911948866L);
        for (EW5 ew5 : EW5.values()) {
            if (ew5.A00 == A01) {
                return ew5;
            }
        }
        return EW5.HScrollProfilePicture;
    }

    public static final boolean A02(UserSession userSession, boolean z, boolean z2, boolean z3) {
        if (!z || z2 || !z3 || !(!C249223jK.A02(userSession)) || !182.A06(0Tu.A05, userSession, 36320652936749812L)) {
            return false;
        }
        return true;
    }

    public final boolean A04(UserSession userSession) {
        if (!(!C249223jK.A02(userSession)) || A06(userSession)) {
            return false;
        }
        if ((!C249223jK.A02(userSession)) && 182.A06(0Tu.A05, userSession, 36320652936749812L)) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36320652934914788L) || 182.A06(r2, userSession, 36320652934980325L)) {
            return true;
        }
        if ((!C249223jK.A02(userSession)) && (182.A06(r2, userSession, 36320652934914788L) || A00(userSession) == EW5.HScrollIcon)) {
            return true;
        }
        if (!(!C249223jK.A02(userSession)) || A00(userSession) != EW5.HScrollProfilePicture) {
            return false;
        }
        return true;
    }

    public final boolean A05(UserSession userSession) {
        if (!(!C249223jK.A02(userSession))) {
            return false;
        }
        if (182.A06(0Tu.A05, userSession, 36320652934980325L) || A00(userSession) == EW5.HScrollMediaPreview) {
            return true;
        }
        return false;
    }

    public final boolean A06(UserSession userSession) {
        if (!(!C249223jK.A02(userSession)) || !0sr.A1P(new EW5[]{EW5.RecipientListBubbleOnly, EW5.RecipientListProfilePicture, EW5.RecipientListMediaPreviewOnly}).contains(A00(userSession))) {
            return false;
        }
        return true;
    }
}
