package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public abstract class F9V {
    public static final 0xG A00 = DbS.A0O("direct_thread");

    public static final void A00(View view, UserSession userSession, C314466iJ r6, 2Er r7) {
        1Av A002 = 1Au.A00(userSession);
        String BZP = r7.BZP();
        if (BZP == null) {
            BZP = "";
        }
        DbX.A1T(AnonymousClass7TE.A0p(A002), "direct_open_to_collab_nux/", BZP, true);
        view.setVisibility(8);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(A00, userSession), "ig_creator_connections_events");
        DbS.A1I(A0e, "dismiss");
        A0e.AAJ("target", C273654mx.A00(2275));
        A0e.A8M(EZb.DIRECT_THREAD, "screen");
        A0e.A8M(C271174i4.A00(userSession), "project");
        A0e.Cgf();
        r6.DUr();
    }
}
