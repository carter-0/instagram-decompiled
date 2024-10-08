package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;

public final class NNG extends C228042kh {
    public final UserSession A00;
    public final C71144Ody A01;
    public final FriendMapLaunchConfig A02;
    public final C71035OZw A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C69028NdD(userSession, this.A01, this.A02, AnonymousClass4A3.A00(userSession), this.A03);
    }

    public NNG(UserSession userSession, C71144Ody ody, FriendMapLaunchConfig friendMapLaunchConfig, C71035OZw oZw) {
        AnonymousClass7TG.A1P(userSession, ody);
        this.A00 = userSession;
        this.A03 = oZw;
        this.A01 = ody;
        this.A02 = friendMapLaunchConfig;
    }
}
