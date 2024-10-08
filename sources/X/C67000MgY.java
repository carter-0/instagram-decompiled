package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.MgY  reason: case insensitive filesystem */
public abstract class C67000MgY {
    public static final void A00(AnonymousClass0iw r3, UserSession userSession, Long l, String str, String str2, String str3, String str4, Map map) {
        String A0k;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "instagram_remix_reactions");
        if (A0e.isSampled() && (A0k = DbS.A0k()) != null) {
            A0e.AAJ("event_type", str);
            DbS.A1J(A0e, str2);
            DbS.A1M(A0e, str3);
            A0e.AAJ("ref_surface", (String) null);
            A0e.AAJ("story_id", str4);
            C51965G9l.A1K(A0e, A0k);
            A0e.A9F("duration_seconds", l);
            A0e.AAJ("audio_mode", (String) null);
            A0e.A9H("extra_data_map", map);
            A0e.Cgf();
        }
    }

    public static final void A01(AnonymousClass0iw r3, UserSession userSession, String str, String str2, String str3) {
        A00(r3, userSession, (Long) null, str, str2, str3, (String) null, (Map) null);
    }
}
