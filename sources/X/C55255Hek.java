package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hek  reason: case insensitive filesystem */
public abstract class C55255Hek {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.CLIPS_REVIEW_TRANSLATED_DUBS, userSession);
        A0i.A1C = str;
        A0i.A1a = true;
        ClipsViewerConfig A00 = A0i.A00();
        AnonymousClass7TF.A1B(fragmentActivity, 1, A00);
        C243473Yx.A07(fragmentActivity, A00, userSession, false, false);
    }
}
