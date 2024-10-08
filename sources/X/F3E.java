package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

public final class F3E {
    public final WeakReference A00;
    public final UserSession A01;
    public final C49674F1g A02;

    public F3E(Activity activity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new WeakReference(activity);
        this.A02 = new C49674F1g(userSession);
    }

    public final void A00(AnonymousClass0iw r3, G5W g5w, String str) {
        0qQ.A0B(str, 1);
        this.A02.A00(new C50352FZj(r3, g5w, this), str);
    }

    public final void A01(String str, AnonymousClass0iw r6) {
        Object obj = this.A00.get();
        if (str == null) {
            Context context = (Context) obj;
            if (context != null) {
                C59689JTv.A0F(context, "network_error", 2131963032);
                return;
            }
            return;
        }
        Activity activity = (Activity) obj;
        if (activity != null) {
            1pE A012 = 1pE.A01(activity, r6, this.A01, "creator_agent_sandbox_profile");
            DbZ.A1Z(A012, str);
            A012.A0H = 1013;
            A012.A0v = true;
            A012.A06();
        }
    }
}
