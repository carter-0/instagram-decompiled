package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;

public final class OLM {
    public final OIT A00;
    public final P15 A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final AnonymousClass0eK A04;

    public OLM(AnonymousClass0iw r2, UserSession userSession, OIT oit, P15 p15, AnonymousClass0eK r6) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = r6;
        this.A02 = r2;
        this.A01 = p15;
        this.A00 = oit;
    }

    public final void A00(User user) {
        C48838El0.A00((FragmentActivity) C66580MXl.A0s(this.A04), this.A02, this.A03, MessagingUser.A00(user), "direct_prompt_viewer", (String) null, false, false);
    }
}
