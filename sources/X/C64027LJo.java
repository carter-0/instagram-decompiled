package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LJo  reason: case insensitive filesystem */
public final class C64027LJo {
    public static final 1OC A00(UserSession userSession, String str, String str2) {
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("feed/saved/audio/");
        A0b.A9m("browse_session_id", userSession.A05);
        A0b.A0Q(C43857CFx.class, D2U.class);
        A0b.A0G("cursor", str);
        A0b.A0G("audio_type", str2);
        return A0b.A0M();
    }
}
