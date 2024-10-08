package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;

/* renamed from: X.F1k  reason: case insensitive filesystem */
public final class C49678F1k {
    public final /* synthetic */ E7M A00;

    public C49678F1k(E7M e7m) {
        this.A00 = e7m;
    }

    public final void A00(UserSession userSession, User user) {
        E7M e7m = this.A00;
        E7M.A01(e7m, user, AnonymousClass05K.A00);
        C46474Dfc A01 = C46548Dgp.A01(userSession, user.getId(), "user_list", E7M.A00(user));
        A01.A0C = E7M.A00(user);
        UserDetailLaunchConfig A04 = A01.A04();
        C309516Yo A0Q = DbU.A0Q(e7m.requireActivity(), userSession);
        A0Q.A0D(C46447Df9.A02().A02(userSession, A04));
        A0Q.A04();
    }
}
