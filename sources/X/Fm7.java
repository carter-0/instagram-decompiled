package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class Fm7 implements C273414mX {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 2Er A01;

    public final void Cyf() {
    }

    public Fm7(UserSession userSession, 2Er r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void Cyc() {
        UserSession userSession = this.A00;
        2Er r0 = this.A01;
        C50338FYv A002 = C69866NtU.A00(userSession);
        String C6C = r0.C6C();
        String C6k = r0.C6k();
        1Ln A003 = C50338FYv.A00(A002);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("entrypoint", "upsell");
        if (DbT.A1Y(A003)) {
            C50338FYv.A04(A003, A002);
            DbV.A1M(A003, "exit_share_to_story_sheet");
            A003.A0p("back_button");
            Dba.A1E(A003, "share_to_story_bottom_sheet");
            A003.A0s(C6C);
            A003.A0i(DbZ.A0d(C6k));
            A003.A0w(A1E);
            A003.A0v(A002.A00);
            A003.Cgf();
        }
    }
}
