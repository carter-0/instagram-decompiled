package X;

import com.instagram.common.session.UserSession;
import com.instagram.hallpass.repository.HallPassMemberListRepository;

/* renamed from: X.EEk  reason: case insensitive filesystem */
public final class C47727EEk extends C228042kh {
    public final UserSession A00;

    public C47727EEk(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C46777Dl4(new HallPassMemberListRepository(this.A00));
    }
}
