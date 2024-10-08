package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FLL implements View.OnClickListener {
    public final /* synthetic */ Ey6 A00;

    public FLL(Ey6 ey6) {
        this.A00 = ey6;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-318286011);
        Ey6 ey6 = this.A00;
        User user = ey6.A02.A0P.A0J;
        if (user != null) {
            UserSession userSession = ey6.A00;
            String id = user.getId();
            1NY A0N = DbU.A0N(userSession);
            A0N.A0K("friendships/mark_user_underage/%s/feed/", new Object[]{id});
            DbS.A1P(A0N, id);
            A0N.A0R(CF2.class, C45498CxY.class);
            1OC A0U = DbT.A0U(A0N, true);
            A0U.A00 = new EBC(userSession, user.getId());
            ey6.A01.schedule(A0U);
        }
        AnonymousClass0fD.A0C(973608589, A05);
    }
}
