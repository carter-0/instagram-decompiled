package X;

import com.instagram.common.session.UserSession;

public final class OTK {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C73660PhZ(this, 9));

    public OTK(AnonymousClass0iw r3, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r3;
    }

    public static final void A00(OTK otk, String str) {
        String A0k = DbS.A0k();
        if (A0k != null) {
            0Aj A0e = AnonymousClass7TE.A0e((0wc) otk.A02.getValue(), C273654mx.A00(2885));
            C51965G9l.A1K(A0e, A0k);
            A0e.A9F("ig_user_id", AnonymousClass7TE.A10(otk.A01.A06));
            A0e.AAJ("event_type", "trending_prompts_netego_interaction");
            A0e.AAJ("component_type", "story");
            A0e.AAJ("target_type", str);
            A0e.AAJ("feed_type", "trending");
            A0e.Cgf();
        }
    }
}
