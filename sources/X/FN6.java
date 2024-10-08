package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

public final class FN6 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass70J A00;
    public final /* synthetic */ User A01;

    public FN6(AnonymousClass70J r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1434839867);
        AnonymousClass70J r2 = this.A00;
        User user = this.A01;
        UserSession userSession = r2.A03;
        UserDetailFragment userDetailFragment = r2.A08;
        C319976rX.A08(userDetailFragment, userSession, AnonymousClass70J.A01(r2), "tap_remembering", r2.A0A.A03(), r2.A0D, r2.A0E, "user_profile_header");
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("ARG_MEMORIALIZED_USER_NAME", user.B8Q());
        E11 e11 = new E11();
        e11.setArguments(A0a);
        DbW.A0T(userSession).A03(userDetailFragment.requireContext(), e11);
        AnonymousClass0fD.A0C(1922296954, A05);
    }
}
