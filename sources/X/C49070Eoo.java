package X;

import android.app.Activity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Eoo  reason: case insensitive filesystem */
public abstract class C49070Eoo {
    public static final void A00(UserSession userSession, Activity activity, String str) {
        0qQ.A0B(userSession, 1);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("target_user_id", str);
        A1E.put("referer_type", "ProfileUsername");
        C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(45), A1E);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0U = activity.getResources().getString(2131951989);
        A0N.A0R = "account_transparency_bloks";
        C46649DiU.A07(activity, A0N, A04);
    }
}
