package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.KwL  reason: case insensitive filesystem */
public abstract class C63400KwL {
    public static final void A00(UserSession userSession, String str, String str2) {
        boolean A1W = AnonymousClass7TF.A1W(JTS.A0e(userSession), AnonymousClass05K.A0C);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_reels_inspiration_acr_upsell");
        if (A0e.isSampled()) {
            A0e.AAJ("upsell_name", "story_highlight_acr_upsell");
            A0e.AAJ(TraceFieldType.AdhocEventName, str);
            A0e.A7p("is_private", JTP.A0g(A0e, "upsell_surface", "self_profile", A1W));
            A0e.AAJ("story_highlight_id", str2);
            A0e.Cgf();
        }
    }
}
