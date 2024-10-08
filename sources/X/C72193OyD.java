package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.OyD  reason: case insensitive filesystem */
public final class C72193OyD implements AnonymousClass0lh {
    public final Set A00 = DbS.A0y();
    public final 0wc A01;
    public final UserSession A02;

    public static final void A00(C72193OyD oyD, String str, String str2, String str3, String str4, int i, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(oyD.A01, "ig_reels_stack");
        if (A0e.isSampled()) {
            DbS.A1N(A0e, str);
            A0e.A9F(C273654mx.A00(3360), DbV.A0p(A0e, "action", str2, i));
            A0e.A7p("is_play_stack", Boolean.valueOf(z));
            A0e.AAJ("client_context", str3);
            C66580MXl.A1K(A0e, str4);
            A0e.Cgf();
        }
    }

    public final void onSessionWillEnd() {
        this.A02.A03(getClass());
        this.A00.clear();
    }

    public C72193OyD(AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A02 = userSession;
        this.A01 = AnonymousClass0kN.A01(r2, userSession);
    }
}
