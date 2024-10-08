package X;

import com.instagram.common.session.UserSession;
import com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository;
import com.instagram.user.model.UpcomingEvent;

public final class NNH extends C228042kh {
    public final UserSession A00;
    public final 1Xj A01;
    public final AnonymousClass4DU A02;
    public final UpcomingEvent A03;

    public NNH(UserSession userSession, 1Xj r3, AnonymousClass4DU r4, UpcomingEvent upcomingEvent) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = r4;
        this.A03 = upcomingEvent;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C67732Mtl(userSession, this.A01, new UpcomingEventReminderRepository(userSession, this.A02, (String) null), this.A03);
    }
}
