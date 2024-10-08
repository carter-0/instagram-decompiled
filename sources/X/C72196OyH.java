package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.OyH  reason: case insensitive filesystem */
public final class C72196OyH implements AnonymousClass0lh {
    public final long A00;
    public final 0wc A01;
    public final UserSession A02;
    public final String A03 = AnonymousClass7TG.A0j();

    public static final void A00(C48147EZp eZp, C48146EZo eZo, C72196OyH oyH, String str, String str2, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(oyH.A01, "igd_creator_subscriber_chats_action");
        if (A0e.isSampled()) {
            A0e.A9F("actor_id", Long.valueOf(oyH.A00));
            A0e.AAJ(AnonymousClass000.A00(1668), "instagram");
            DbS.A1I(A0e, str);
            DbS.A1J(A0e, str2);
            A0e.A8M(eZp, "source");
            A0e.A8M(eZo, "surface");
            C66584MXp.A0u(A0e, oyH.A03);
            if (map != null) {
                A0e.A9H("extra", map);
            }
            A0e.Cgf();
        }
    }

    public final void onSessionWillEnd() {
        this.A02.A03(C72196OyH.class);
    }

    public C72196OyH(UserSession userSession) {
        this.A02 = userSession;
        this.A00 = JTS.A06(AnonymousClass7TE.A10(userSession.A06));
        this.A01 = C66580MXl.A0N(new AnonymousClass0kM(userSession), "creator_subscriber_chat");
    }
}
