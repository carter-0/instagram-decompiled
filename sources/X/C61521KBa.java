package X;

import com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.KBa  reason: case insensitive filesystem */
public final class C61521KBa extends C228042kh {
    public final UserSession A00;

    public C61521KBa(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60224Jhh(new AudienceListsListRepository(this.A00));
    }
}
