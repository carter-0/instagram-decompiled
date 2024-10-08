package X;

import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hbw  reason: case insensitive filesystem */
public abstract class C55087Hbw {
    public static final void A00(Fragment fragment, UserSession userSession, 1Xj r11) {
        AnonymousClass7TG.A1T(fragment, userSession, r11);
        r11.A0C.ERx(AnonymousClass7TE.A1I(userSession.A06));
        r11.AE7(userSession);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        Dba.A1H(A0a, "users/pin_timeline_media/");
        A0a.A9m("post_id", r11.A2n());
        1OC A0T = DbT.A0T(A0a, "profile_tab", "clips");
        A0T.A00 = I0I.A00(fragment, new C51763G0f(userSession, 24), new MJ4(21, r11, userSession), 2131969491, R.drawable.instagram_pin_pano_outline_24, 2131969468, 2131969473);
        1ES.A03(A0T);
    }
}
