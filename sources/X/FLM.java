package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;

public final class FLM implements View.OnClickListener {
    public final /* synthetic */ Ey6 A00;

    public FLM(Ey6 ey6) {
        this.A00 = ey6;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1352482615);
        Ey6 ey6 = this.A00;
        UserDetailTabController userDetailTabController = ey6.A02;
        User user = userDetailTabController.A0P.A0J;
        if (user != null) {
            UserDetailFragment userDetailFragment = ey6.A01;
            UserSession userSession = ey6.A00;
            String id = user.getId();
            1NY A0N = DbU.A0N(userSession);
            A0N.A0K("friendships/%s/%s/feed/", new Object[]{"mark_user_overage", id});
            DbS.A1P(A0N, id);
            A0N.A0R(1XO.class, 1XW.class);
            userDetailFragment.schedule(DbT.A0U(A0N, true));
            user.A03.EXS((C278084wF) null);
            userDetailFragment.A0r();
            userDetailFragment.A0w(userDetailTabController.A0B(), false);
        }
        AnonymousClass0fD.A0C(-34861792, A05);
    }
}
