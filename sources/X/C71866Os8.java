package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Os8  reason: case insensitive filesystem */
public final class C71866Os8 implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "PinnedMessagesLogger";
    public final 0wc A00;

    public C71866Os8(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A01(this, userSession);
    }

    public final String getModuleName() {
        return "pinned_messages_logger_module";
    }

    public final void A00(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        0Aj A0H = C66582MXn.A0H(this.A00, "direct_eyebrow_text_impression", str);
        A0H.AAJ("media_type", str2);
        DbS.A1N(A0H, "");
        A0H.AAJ("content", "pinned");
        A0H.Cgf();
    }
}
