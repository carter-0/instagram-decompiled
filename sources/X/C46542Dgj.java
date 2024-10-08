package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;

/* renamed from: X.Dgj  reason: case insensitive filesystem */
public final class C46542Dgj extends C228042kh {
    public final UserSession A00;
    public final UserDetailLaunchConfig A01;

    public C46542Dgj(UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = userDetailLaunchConfig;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new Dc6(userSession, this.A01, new C46461DfP(userSession));
    }
}
