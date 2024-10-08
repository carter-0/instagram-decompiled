package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.GGn  reason: case insensitive filesystem */
public final class C52145GGn {
    public final boolean A00(ClipsViewerSource clipsViewerSource, C267324bN r5, C52058GDe gDe, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1Xj r0 = r5.A02;
        if ((r0 == null || !r0.A5f()) && ((!C52146GGo.A00(r5, gDe, userSession) || clipsViewerSource == ClipsViewerSource.ACTIVITY_CENTER) && gDe.A0D == AnonymousClass3WA.A0F)) {
            return false;
        }
        return true;
    }
}
