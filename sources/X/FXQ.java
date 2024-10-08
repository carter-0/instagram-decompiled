package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;

public final class FXQ implements 1wn {
    public final /* synthetic */ UserDetailFragment A00;

    public FXQ(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-640369603);
        C324016yT r8 = (C324016yT) obj;
        int A032 = AnonymousClass0fD.A03(470683134);
        String str = r8.A01;
        UserDetailFragment userDetailFragment = this.A00;
        UserSession userSession = userDetailFragment.A0I;
        if (str.equals(userSession.A06) && DbY.A1Y(0Tu.A05, userSession, 36315829686111826L) && userDetailFragment.A10.A0C.A00.equals(r8.A00)) {
            userDetailFragment.A22 = true;
        }
        AnonymousClass0fD.A0A(712679445, A032);
        AnonymousClass0fD.A0A(1935434811, A03);
    }
}
