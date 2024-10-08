package X;

import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class GLX {
    public static final void A01(Fragment fragment, UserSession userSession, 1Xj r11) {
        AnonymousClass7TG.A1N(fragment, userSession);
        r11.A0C.ERx(0sn.A00);
        r11.AE7(userSession);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        Dba.A1H(A0a, "users/unpin_timeline_media/");
        A0a.A9m("post_id", r11.A2n());
        1OC A0T = DbT.A0T(A0a, "profile_tab", "clips");
        A0T.A00 = I0I.A00(fragment, new C51763G0f(userSession, 25), new MJ4(22, r11, userSession), 2131975968, R.drawable.instagram_unpin_pano_outline_24, 2131975964, 2131975966);
        1ES.A03(A0T);
    }

    public static final void A00(Fragment fragment, UserSession userSession, 1Xj r5) {
        AnonymousClass7TG.A1N(fragment, userSession);
        AnonymousClass1Nd.A00(userSession).A00(new C320756st(new C59104J6m(48, (Object) r5, (Object) fragment, (Object) userSession)));
    }

    public static final boolean A02(UserSession userSession, 1Xj r4) {
        AnonymousClass7TG.A1N(userSession, r4);
        if (!r4.A5G() || r4.A58() || r4.A5s() || r4.A2K() == AnonymousClass05K.A0C || !2R8.A02(userSession, r4) || r4.A0C.B9t() != null || !182.A06(0Tu.A05, userSession, 36316980734595812L)) {
            return false;
        }
        return true;
    }
}
