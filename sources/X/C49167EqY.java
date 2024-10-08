package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.EqY  reason: case insensitive filesystem */
public abstract class C49167EqY {
    public static final void A00(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 0);
        if (str2 == null || !(!00l.A0W(str2)) || str2.equals("clips_media_notes")) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (str != null && (!00l.A0W(str))) {
                A1C.addAll(DbX.A0x(str));
            }
            FragmentActivity A00 = C71172bH.A00();
            DbS.A1X(A00);
            C270634h3 r0 = new C270634h3(ClipsViewerSource.CLIPS_MEDIA_NOTES, userSession);
            r0.A0s = str;
            DbU.A1M(A00, r0, userSession);
        }
    }
}
