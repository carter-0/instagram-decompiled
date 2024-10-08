package X;

import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hwl  reason: case insensitive filesystem */
public abstract class C56334Hwl {
    public static final 1OC A00(Fragment fragment, UserSession userSession, String str) {
        AnonymousClass7TG.A1N(fragment, userSession);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        Dba.A1H(A0a, "users/pin_timeline_media/");
        1OC A0T = DbT.A0T(A0a, "post_id", str);
        A0T.A00 = I0I.A00(fragment, new C51763G0f(userSession, 21), new C51763G0f(userSession, 22), 2131969491, R.drawable.instagram_pin_pano_outline_24, 2131969468, 2131969471);
        return A0T;
    }

    public static final 1OC A01(Fragment fragment, UserSession userSession, String str) {
        AnonymousClass7TG.A1N(fragment, userSession);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        Dba.A1H(A0a, "users/unpin_timeline_media/");
        1OC A0T = DbT.A0T(A0a, "post_id", str);
        A0T.A00 = I0I.A00(fragment, new C51763G0f(userSession, 23), C58482Isd.A00, 2131975968, R.drawable.instagram_unpin_pano_outline_24, 2131975964, 2131975965);
        return A0T;
    }
}
