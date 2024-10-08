package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KtJ  reason: case insensitive filesystem */
public abstract class C63212KtJ {
    public static final void A00(Activity activity, UserSession userSession, String str, 0sP r8, boolean z) {
        C331157Pu A00 = DbX.A0e(userSession, C51970G9q.A1Y(str)).A00();
        K45 k45 = new K45();
        k45.setArguments(AnonymousClass7TG.A0P("initial_auto_graduation_key", Boolean.valueOf(z), AnonymousClass7TE.A1L("session_id_key", str)));
        k45.A00 = r8;
        A00.A02(activity, k45);
    }
}
