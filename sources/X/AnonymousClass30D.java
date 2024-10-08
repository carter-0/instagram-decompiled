package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.30D  reason: invalid class name */
public abstract class AnonymousClass30D {
    public static final boolean A00(MusicProduct musicProduct, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(musicProduct, 1);
        if (musicProduct != MusicProduct.CLIPS_CAMERA_FORMAT_V2) {
            if (musicProduct == MusicProduct.MUSIC_IN_FEED) {
                0Tu r2 = 0Tu.A06;
                if (182.A06(r2, userSession, 36323960056524420L) || 182.A06(r2, userSession, 36323960056589957L)) {
                    return true;
                }
                return false;
            } else if (C14245TsS.A02(musicProduct)) {
                return 182.A06(0Tu.A06, userSession, 36323960056458883L);
            } else {
                return false;
            }
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return !182.A06(0Tu.A05, userSession, 36327202756901093L);
    }

    public static final boolean A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36330277953356332L);
    }

    public static final boolean A05(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36323509085023442L) || 182.A06(r2, userSession, 36323509085220053L) || 182.A06(r2, userSession, 36323960056589957L)) {
            return true;
        }
        return false;
    }

    public static final boolean A08(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return C349167zh.A00(userSession).booleanValue();
    }

    public static final boolean A09(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A06, userSession, 36313987142584666L) || 182.A06(0Tu.A05, userSession, 36323960056524420L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36317212663157600L);
    }

    public static final boolean A0B(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36327812642519771L) || !A09(userSession) || !182.A06(r2, userSession, 36324604301553843L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0F(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36326296518735536L);
    }

    public static final boolean A0K(UserSession userSession, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        return z2 && z && A05(userSession);
    }

    public static final boolean A01(MusicProduct musicProduct, UserSession userSession) {
        if (musicProduct == MusicProduct.CLIPS_CAMERA_FORMAT_V2) {
            return true;
        }
        if (C14245TsS.A02(musicProduct)) {
            return 182.A06(0Tu.A06, userSession, 36323960056458883L);
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        if (182.A06(0Tu.A06, userSession, 36313987143502179L) || 182.A06(0Tu.A05, userSession, 36323960056524420L)) {
            return true;
        }
        return false;
    }

    public static final boolean A07(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36323509085088979L) || 182.A06(r2, userSession, 36323509085220053L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0D(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36325042388218435L) || 182.A06(r2, userSession, 36325042388546120L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0G(UserSession userSession) {
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36325042388349509L) || 182.A06(r2, userSession, 36325042388546120L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0H(UserSession userSession, User user) {
        if (user != null) {
            user.getId();
            if (!0qQ.A0K(user.getId(), userSession.A06)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0J(UserSession userSession, User user, boolean z) {
        if (z) {
            return false;
        }
        if (A0H(userSession, user)) {
            return true;
        }
        boolean A06 = 182.A06(0Tu.A06, userSession, 36313987143436642L);
        0qQ.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static final boolean A06(UserSession userSession) {
        if (!C349167zh.A00(userSession).booleanValue() || !182.A06(0Tu.A05, userSession, 36312621343114441L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0C(UserSession userSession) {
        if (!C349167zh.A00(userSession).booleanValue() || !182.A06(0Tu.A05, userSession, 36327920016374579L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0E(UserSession userSession) {
        if (!C349167zh.A00(userSession).booleanValue() || !182.A06(0Tu.A05, userSession, 36327920016309042L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0I(UserSession userSession, User user) {
        if (A0H(userSession, user) || 182.A06(0Tu.A06, userSession, 36313987142519129L)) {
            return true;
        }
        return false;
    }
}
