package X;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

public final class OHX {
    public final AnonymousClass0iw A00;
    public final PRU A01;
    public final OGL A02;
    public final C18064Vkq A03;
    public final UpcomingEvent A04;
    public final AnonymousClass0eM A05;
    public final UserSession A06;

    public OHX(ViewStub viewStub, FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession, PRU pru, UpcomingEvent upcomingEvent) {
        C51974G9v.A1P(viewStub, fragmentActivity, userSession, r5);
        0qQ.A0B(pru, 6);
        this.A06 = userSession;
        this.A00 = r5;
        this.A04 = upcomingEvent;
        this.A01 = pru;
        this.A03 = C17116VIm.A00(userSession, C61410nE.A00, upcomingEvent);
        this.A05 = AnonymousClass1YB.A00(new C73666Phf(23, fragmentActivity, this));
        View A0H = JTP.A0H(viewStub, R.layout.ig_reminder_ads_footer);
        0qQ.A0A(A0H);
        this.A02 = new OGL(A0H);
    }
}
