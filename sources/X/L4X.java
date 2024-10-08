package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

public final class L4X {
    public final UserSession A00;
    public final FanClubApi A01;

    public /* synthetic */ L4X(UserSession userSession) {
        FanClubApi fanClubApi = new FanClubApi(userSession);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = fanClubApi;
    }
}
