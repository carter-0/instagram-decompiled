package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Twv  reason: case insensitive filesystem */
public final class C14473Twv implements C20980X7u {
    public static final C14473Twv A00 = new Object();

    public final void AHn(UserSession userSession) {
        0xY A0Y = C13989Tnp.A0Y(userSession);
        A0Y.ED3("recent_audio_searches_with_ts");
        A0Y.apply();
    }

    public final String B8G(UserSession userSession) {
        1Av A0Z = C13989Tnp.A0Z(userSession);
        return (String) Pxe.A0s(A0Z, A0Z.A6v, 1Av.A8a, 14);
    }

    public final void EKG(UserSession userSession, String str) {
        AnonymousClass7TG.A1N(userSession, str);
        1Av A002 = 1Au.A00(userSession);
        DbS.A1a(A002, str, A002.A6v, 1Av.A8a, 14);
    }
}
