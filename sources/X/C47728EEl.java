package X;

import com.instagram.common.session.UserSession;
import com.instagram.hallpass.repository.HallPassParticipantsListRepository;

/* renamed from: X.EEl  reason: case insensitive filesystem */
public final class C47728EEl extends C228042kh {
    public final UserSession A00;

    public C47728EEl(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C46738DkR(new HallPassParticipantsListRepository(this.A00));
    }
}
