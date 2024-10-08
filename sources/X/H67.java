package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.configs.PagerSheetLaunchConfig;
import com.instagram.friendmap.data.FriendMapRepository;

public final class H67 extends C228042kh {
    public final UserSession A00;
    public final PagerSheetLaunchConfig A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        PagerSheetLaunchConfig pagerSheetLaunchConfig = this.A01;
        FriendMapRepository A002 = AnonymousClass4A3.A00(userSession);
        AnonymousClass7TG.A1U(userSession, pagerSheetLaunchConfig, A002);
        MYL myl = new MYL(new C53544GqF(C56317HwU.A00(userSession, pagerSheetLaunchConfig.A04), AnonymousClass62M.A01, true));
        AnonymousClass7TE.A1Z(new MHE(userSession, A002, myl, (AnonymousClass4D7) null, 38), C318116oQ.A00(myl));
        return myl;
    }

    public H67(UserSession userSession, PagerSheetLaunchConfig pagerSheetLaunchConfig) {
        AnonymousClass7TG.A1O(userSession, pagerSheetLaunchConfig);
        this.A00 = userSession;
        this.A01 = pagerSheetLaunchConfig;
    }
}
