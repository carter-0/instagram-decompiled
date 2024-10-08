package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LHj  reason: case insensitive filesystem */
public abstract class C63991LHj {
    public static final void A00(AnonymousClass0iw r2, UserSession userSession, Long l, String str) {
        0qQ.A0B(userSession, 1);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_rename_audio_exit_rename_page_successful");
        if (A0e.isSampled()) {
            DbW.A16(A0e, r2);
            A0e.A9F("container_id", l);
            A0e.AAJ("media_tap_token", str);
            AnonymousClass7TH.A0V(A0e);
        }
    }

    public static final void A01(AnonymousClass0iw r2, UserSession userSession, Long l, String str) {
        0qQ.A0B(userSession, 1);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_rename_audio_button_tapped");
        if (A0e.isSampled()) {
            DbW.A16(A0e, r2);
            A0e.A9F("container_id", l);
            if (str == null) {
                str = "0";
            }
            A0e.AAJ("media_tap_token", str);
            AnonymousClass7TH.A0V(A0e);
        }
    }
}
