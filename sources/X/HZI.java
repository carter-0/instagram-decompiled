package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class HZI {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, HNK hnk, String str, C62320sa r9) {
        0qQ.A0B(userSession, 1);
        if (str != null) {
            H22 h22 = new H22();
            C331127Pr A0V = DbV.A0V(AnonymousClass7TG.A0P("creator_ai_agent_id_extra", str, AnonymousClass7TE.A1L("creator_ai_audience_extra", hnk)), h22, userSession);
            A0V.A0d = fragmentActivity.getResources().getString(2131973031);
            C57385IZq.A00(A0V, r9, 2);
            DbU.A0y(fragmentActivity, h22, A0V);
        }
    }
}
