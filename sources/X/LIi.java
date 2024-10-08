package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public abstract class LIi {
    public static final void A01(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A07(layoutParams);
        if (z) {
            view.setVisibility(0);
            layoutParams.height = -2;
        } else {
            view.setVisibility(8);
            layoutParams.height = 0;
        }
        view.setLayoutParams(layoutParams);
    }

    public static final C62518Kh9 A00(UserSession userSession, AnonymousClass3QO r2) {
        boolean A1W = AnonymousClass7TF.A1W(JTR.A0w(userSession), AnonymousClass05K.A0C);
        if (r2 == AnonymousClass3QO.CLOSE_FRIENDS) {
            return C62518Kh9.CLOSE_FRIENDS;
        }
        if (r2 == AnonymousClass3QO.OPAL) {
            return C62518Kh9.OPAL;
        }
        if (r2 == AnonymousClass3QO.FAN_CLUB) {
            return C62518Kh9.FAN_CLUB;
        }
        if (A1W) {
            return C62518Kh9.PRIVATE_ACCOUNT_FOLLOWERS;
        }
        return C62518Kh9.EVERYONE;
    }
}
