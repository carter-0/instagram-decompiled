package X;

import com.instagram.common.session.UserSession;

public final class FV0 implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "AvatarMimicryFlowLogger";
    public final 0wc A00;
    public final UserSession A01;

    public FV0(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(this, userSession);
    }

    public final String getModuleName() {
        return "ig_avatar_sticker_mimicry_flow";
    }

    public final void A00(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        String str2;
        if (z3) {
            str2 = "create_avatar_nux";
        } else {
            str2 = "avatar_sticker";
        }
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "mimicry_upsell_cta_clicked");
        DbS.A1N(A0e, str2);
        A0e.AAJ("has_avatar", String.valueOf(z));
        A0e.AAJ("is_sender", String.valueOf(z2));
        A0e.AAJ("ig_user_id", this.A01.A06);
        if (!z4) {
            if (str == null) {
                str = "None";
            }
            A0e.AAJ("sticker_template_id", str);
        }
        A0e.Cgf();
    }
}
