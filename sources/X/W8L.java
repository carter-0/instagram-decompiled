package X;

import android.view.View;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;

public final class W8L implements View.OnClickListener {
    public final /* synthetic */ C306146Ky A00;

    public W8L(C306146Ky r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-487381250);
        C306146Ky r7 = this.A00;
        C306146Ky.A00(r7).A0F(C16678UzE.CREATE_AUDIENCE, "age_and_gender");
        C322576w3.A00().A02();
        AnonymousClass0eM r5 = r7.A0S;
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        XIGIGBoostDestination xIGIGBoostDestination = C306146Ky.A01(r7).A00;
        0qQ.A0B(A0l, 0);
        UZT uzt = new UZT();
        Dbc.A0S(uzt, DbU.A0I(Q21.A00(JTQ.A1b("destination", xIGIGBoostDestination, new 0eP("IgSessionManager.SESSION_TOKEN_KEY", A0l.A05))), uzt, r7), r5);
        AnonymousClass0fD.A0C(1541705750, A05);
    }
}
