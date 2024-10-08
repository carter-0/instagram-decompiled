package X;

import com.instagram.api.schemas.StoryTrendingPromptSubType;
import com.instagram.common.session.UserSession;

/* renamed from: X.OKs  reason: case insensitive filesystem */
public final class C70772OKs {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C73660PhZ(this, 8));

    public C70772OKs(AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r3;
    }

    public final void A00(StoryTrendingPromptSubType storyTrendingPromptSubType, C69406Nkk nkk, Integer num, String str, String str2, String str3, int i, long j) {
        String str4;
        String A0k = DbS.A0k();
        if (A0k != null) {
            0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A02.getValue(), "igye_prompts_surface_component_interaction");
            C51965G9l.A1K(A0e, A0k);
            if (str == null) {
                str = "";
            }
            A0e.A9F("component_position", DbV.A0p(A0e, "component_id", str, i));
            A0e.AAJ("component_type", "story");
            switch (num.intValue()) {
                case 0:
                    str4 = "prompt_info";
                    break;
                case 1:
                    str4 = "media";
                    break;
                default:
                    str4 = "add_yours_button";
                    break;
            }
            C66584MXp.A0w(A0e, "target_type", str4, str3);
            A0e.A9F("num_media_loaded", Long.valueOf(j));
            A0e.AAJ("component_subtype", String.valueOf(storyTrendingPromptSubType));
            A0e.AAJ("target_id", str2);
            if (nkk != null) {
                A0e.AAJ("entrypoint", nkk.toString());
            }
            A0e.Cgf();
        }
    }
}
