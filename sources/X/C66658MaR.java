package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;

/* renamed from: X.MaR  reason: case insensitive filesystem */
public abstract class C66658MaR {
    public static final boolean A00(UserSession userSession, AnonymousClass2Ep r4) {
        0qQ.A0B(userSession, 1);
        if (r4 != null) {
            SmartSuggestion Bwx = r4.Bwx();
            if (!r4.CUG() && !r4.CVr()) {
                Integer num = AnonymousClass05K.A0Y;
                if (Bwx == null || num != Bwx.A03 || !AnonymousClass431.A01(userSession) || !182.A06(0Tu.A06, userSession, 36314889085586291L)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, AnonymousClass2Ep r4) {
        0qQ.A0B(userSession, 1);
        if (r4 == null) {
            return false;
        }
        SmartSuggestion Bwx = r4.Bwx();
        if (r4.CUG() || r4.CVr()) {
            return false;
        }
        Integer num = AnonymousClass05K.A0Y;
        if (Bwx == null || num != Bwx.A03) {
            return false;
        }
        if (AnonymousClass431.A01(userSession) || 182.A06(0Tu.A05, userSession, 36316830411002524L)) {
            return true;
        }
        return false;
    }
}
