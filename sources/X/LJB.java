package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public abstract class LJB {
    public static final void A00(View view, boolean z) {
        0qQ.A0B(view, 0);
        if (z) {
            view.setAlpha(1.0f);
            2eQ.A01(view);
            return;
        }
        view.setAlpha(0.5f);
        03v.A0B(view, new U7B(0));
    }

    public static final void A01(Fragment fragment, Fragment fragment2, UserSession userSession, C64092LMk lMk) {
        AnonymousClass7TG.A1P(userSession, lMk);
        C309516Yo A0H = DbW.A0H(fragment, userSession);
        A0H.A0D(fragment2);
        A0H.A0A(lMk.A00, lMk.A01, lMk.A02, lMk.A03);
        A0H.A04();
    }
}
