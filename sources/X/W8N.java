package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class W8N implements View.OnClickListener {
    public final /* synthetic */ C306146Ky A00;

    public W8N(C306146Ky r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(81571829);
        C306146Ky r8 = this.A00;
        C306146Ky.A00(r8).A0F(C16678UzE.CREATE_AUDIENCE, "interest");
        C322576w3.A00().A02();
        AnonymousClass0eM r7 = r8.A0S;
        UserSession A0l = AnonymousClass7TE.A0l(r7);
        String str = C306146Ky.A01(r8).A05;
        String str2 = C306146Ky.A01(r8).A04;
        0qQ.A0B(A0l, 0);
        UZV uzv = new UZV();
        uzv.setArguments(DbY.A0C("audience_id", str2, new 0eP("IgSessionManager.SESSION_TOKEN_KEY", A0l.A05), new 0eP("media_id", str)));
        Dbc.A0S(uzv, r8.requireActivity(), r7);
        AnonymousClass0fD.A0C(1213102356, A05);
    }
}
