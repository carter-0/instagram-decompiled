package X;

import com.instagram.common.session.UserSession;
import com.instagram.hallpass.repository.HallPassRepository;

/* renamed from: X.EEj  reason: case insensitive filesystem */
public final class C47726EEj extends C228042kh {
    public final UserSession A00;

    public C47726EEj(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C46764Dkr(new HallPassRepository(this.A00));
    }
}
