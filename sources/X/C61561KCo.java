package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;

/* renamed from: X.KCo  reason: case insensitive filesystem */
public final class C61561KCo extends C228042kh {
    public final UserSession A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        return new C60166Jgl((FanClubSettingsRecommendationsRepository) userSession.A01(FanClubSettingsRecommendationsRepository.class, new C58176Ing(userSession, 29)), new LNy(userSession, this.A01));
    }

    public C61561KCo(UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
