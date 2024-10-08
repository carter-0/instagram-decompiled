package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

public final class LXG implements View.OnClickListener {
    public final /* synthetic */ UpcomingEvent A00;
    public final /* synthetic */ C63820L8b A01;

    public LXG(UpcomingEvent upcomingEvent, C63820L8b l8b) {
        this.A01 = l8b;
        this.A00 = upcomingEvent;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1610309769);
        C63820L8b l8b = this.A01;
        UpcomingEvent upcomingEvent = this.A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        UserSession userSession = l8b.A01;
        DbU.A1D(A0a, userSession);
        A0a.putString("creation_session_id", l8b.A02);
        A0a.putParcelable("upcoming_live", upcomingEvent);
        AnonymousClass4DH r2 = l8b.A00;
        A0a.putString("prior_module_name", r2.getModuleName());
        C309516Yo A0H = DbW.A0H(r2, userSession);
        C2601144i.A00();
        DbW.A0x(A0a, new K6B(), A0H);
        AnonymousClass0fD.A0C(-537342404, A05);
    }
}
