package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;

public final class FXN implements 1wn {
    public final /* synthetic */ UserDetailFragment A00;

    public FXN(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-567813766);
        int A032 = AnonymousClass0fD.A03(237490612);
        UserDetailFragment userDetailFragment = this.A00;
        UserSession userSession = userDetailFragment.A0I;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36327795462978252L)) {
            C322486vu r2 = userDetailFragment.A13.A00;
            r2.A0S = AnonymousClass7TF.A1R(userDetailFragment.A0g.A01(userDetailFragment.A0I));
            r2.A00();
        } else {
            userDetailFragment.A0g.A03(userDetailFragment.A0I);
        }
        AnonymousClass0fD.A0A(1823746173, A032);
        AnonymousClass0fD.A0A(224623424, A03);
    }
}
