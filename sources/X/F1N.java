package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class F1N {
    public final boolean A00(Activity activity, View view, UserSession userSession, int i) {
        UserSession userSession2 = userSession;
        1Av A00 = 1Au.A00(userSession);
        if (!(!AnonymousClass7TG.A1a(A00, A00.A2S, 1Av.A8a, 291))) {
            return false;
        }
        View view2 = view;
        view.postDelayed(new C51547Fvt(activity, view2, userSession2, C226262fy.ABOVE_ANCHOR, A00, AnonymousClass05K.A00, AnonymousClass7TE.A16(activity, i)), 100);
        return true;
    }
}
