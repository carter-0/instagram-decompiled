package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.OyG  reason: case insensitive filesystem */
public final class C72195OyG implements AnonymousClass0lh {
    public final long A00;
    public final 0wc A01;
    public final UserSession A02;
    public final String A03 = AnonymousClass7TG.A0j();

    public static final void A00(C72195OyG oyG, Integer num, String str, String str2, String str3, String str4, String str5, Map map) {
        1Ln A0E = 1Ln.A0E(oyG.A01);
        if (DbT.A1Y(A0E)) {
            C66584MXp.A10(A0E, str3, str4, oyG.A00);
            A0E.A0p(str5);
            A0E.A0q("thread_view");
            A0E.A0i(C66583MXo.A0e(A0E, C313746gw.A01(num), str, str2));
            A0E.A0v(oyG.A03);
            A0E.A0w(map);
            A0E.Cgf();
        }
    }

    public final void onSessionWillEnd() {
        this.A02.A03(C72195OyG.class);
    }

    public C72195OyG(UserSession userSession) {
        this.A02 = userSession;
        this.A00 = JTS.A06(AnonymousClass7TE.A10(userSession.A06));
        this.A01 = C66580MXl.A0N(new AnonymousClass0kM(userSession), "creator_broadcast_chat");
    }
}
