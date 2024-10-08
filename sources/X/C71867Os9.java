package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Os9  reason: case insensitive filesystem */
public final class C71867Os9 implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "AvatarStickersLogger";
    public final 0wc A00;
    public final UserSession A01;

    public C71867Os9(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(this, userSession);
    }

    public final String getModuleName() {
        return "ig_avatar_stickers";
    }

    public final void A00(String str) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "stickers_tray_opened");
        A0e.AAJ("ig_user_id", this.A01.A06);
        DbV.A1J(A0e, str);
    }
}
