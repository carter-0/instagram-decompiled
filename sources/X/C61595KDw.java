package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;

/* renamed from: X.KDw  reason: case insensitive filesystem */
public final class C61595KDw extends C228042kh {
    public final UserSession A00;
    public final L4X A01;
    public final FanClubSettingsRecommendationsRepository A02;
    public final LNy A03;

    public /* synthetic */ C61595KDw(UserSession userSession, String str) {
        L4X l4x = new L4X(userSession);
        FanClubSettingsRecommendationsRepository fanClubSettingsRecommendationsRepository = new FanClubSettingsRecommendationsRepository(new FanClubApi(userSession));
        LNy lNy = new LNy(userSession, str);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = l4x;
        this.A02 = fanClubSettingsRecommendationsRepository;
        this.A03 = lNy;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60212JhV(this.A01, this.A02, this.A03);
    }
}
