package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

public final class KEV extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final UpcomingEvent A02;
    public final String A03;
    public final String A04 = "ig_live_scheduling_share";
    public final String A05;

    public KEV(AnonymousClass0iw r3, UserSession userSession, UpcomingEvent upcomingEvent, String str, String str2) {
        C51974G9v.A0d(1, userSession, str, str2, upcomingEvent);
        this.A01 = userSession;
        this.A00 = r3;
        this.A05 = str;
        this.A03 = str2;
        this.A02 = upcomingEvent;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        AnonymousClass0t1 A002 = 0eE.A00(userSession);
        UpcomingEvent upcomingEvent = this.A02;
        AnonymousClass0iw r5 = this.A00;
        return new C60184Jh3(A002, new C310306am(r5, userSession, this.A04), upcomingEvent, new C64104LMy(r5, userSession, this.A05, this.A03, upcomingEvent.getId()));
    }
}
