package X;

import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallLaunchConfig;
import com.instagram.wonderwall.repository.WallFeedRepository;

public final class H6A extends C228042kh {
    public final UserSession A00;
    public final WallLaunchConfig A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        WallLaunchConfig wallLaunchConfig = this.A01;
        String str = wallLaunchConfig.A01;
        AnonymousClass7TG.A1N(str, userSession);
        return new C53047Ghf(userSession, wallLaunchConfig, new WallFeedRepository(userSession, str), C56353Hx4.A00(userSession));
    }

    public H6A(UserSession userSession, WallLaunchConfig wallLaunchConfig) {
        AnonymousClass7TG.A1O(userSession, wallLaunchConfig);
        this.A00 = userSession;
        this.A01 = wallLaunchConfig;
    }
}
