package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.party.data.StoryPartyRepository;

/* renamed from: X.KBz  reason: case insensitive filesystem */
public final class C61546KBz extends C228042kh {
    public final UserSession A00;

    public C61546KBz(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C60155Jga(userSession, new StoryPartyRepository(new C45243Csy(userSession)));
    }
}
