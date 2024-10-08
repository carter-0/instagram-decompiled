package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.GIi  reason: case insensitive filesystem */
public final class C52191GIi {
    public static final C52191GIi A00 = new Object();

    public final boolean A00(ClipsViewerSource clipsViewerSource, UserSession userSession, String str, boolean z) {
        C296815qg Beg;
        AnonymousClass7TF.A1B(userSession, 1, clipsViewerSource);
        1Xj A0U = DbV.A0U(userSession, str);
        if ((A0U != null && (Beg = A0U.A0C.Beg()) != null && AnonymousClass7TF.A1Y(Beg.BuO(), true)) || clipsViewerSource.ordinal() != 11) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36318509747083471L)) {
            z = 182.A06(r2, userSession, 36318509747149008L);
        }
        if (!z) {
            return true;
        }
        return false;
    }
}
