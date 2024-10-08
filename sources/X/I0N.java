package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import org.webrtc.MediaStreamTrack;

public final class I0N {
    public static final I0N A00 = new Object();

    public final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        int i;
        Object A03 = r9.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        Object A032 = r9.A03(1);
        0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.String");
        UserSession A0B = C308206Td.A0B(r8);
        if (!(A0B instanceof UserSession)) {
            return null;
        }
        UserSession userSession = A0B;
        FragmentActivity A04 = C308206Td.A04(r8);
        0qQ.A0B(userSession, 0);
        DbZ.A0t(1, A04, str, A032);
        if ("clips".equals(A032)) {
            C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.FEED_LIKED, userSession);
            A0i.A1C = str;
            A0i.A1c = false;
            DbU.A1M(A04, A0i, userSession);
            return null;
        }
        C309516Yo A0M = DbS.A0M(A04, userSession);
        F3W A0k = C51971G9r.A0k(str);
        A0k.A0O = true;
        A0M.A0D(A0k.A01());
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A032)) {
            i = 823;
        } else {
            i = 737;
        }
        A0M.A0B = AnonymousClass000.A00(i);
        A0M.A04();
        return null;
    }
}
