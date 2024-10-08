package X;

/* renamed from: X.OaD  reason: case insensitive filesystem */
public final class C71040OaD {
    public static final void A01(0wc r1, String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        0Aj A0e = AnonymousClass7TE.A0e(r1, "reels_view_direct_reply_bar_exit");
        if (A0e.isSampled()) {
            A0e.AAJ("containermodule", str);
            C66580MXl.A1J(A0e, "");
            DbS.A1N(A0e, str2);
            DbV.A1G(A0e, str3);
        }
    }

    public static final void A00(0wc r2, String str, String str2) {
        Long l;
        0Aj A0e = AnonymousClass7TE.A0e(r2, C273654mx.A00(2251));
        if (A0e.isSampled()) {
            DbS.A1N(A0e, str);
            if (str2 != null) {
                l = DbV.A0q(str2);
            } else {
                l = null;
            }
            A0e.A9F("blend_id", l);
            A0e.Cgf();
        }
    }

    public static final void A02(0wc r2, String str, String str2, String str3, String str4) {
        Long l;
        0qQ.A0B(str, 1);
        0Aj A0e = AnonymousClass7TE.A0e(r2, "instagram_direct_reply_bar_tap");
        if (A0e.isSampled()) {
            A0e.AAJ("containermodule", str);
            A0e.AAJ("media_id", str3);
            DbS.A1N(A0e, str2);
            DbS.A1J(A0e, "direct_reply_bar_tap");
            if (str4 != null) {
                l = DbV.A0q(str4);
            } else {
                l = null;
            }
            A0e.A9F("blend_id", l);
            A0e.Cgf();
        }
    }
}
