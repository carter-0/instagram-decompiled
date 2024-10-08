package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hwd  reason: case insensitive filesystem */
public abstract class C56326Hwd {
    public static final void A00(C54689HOu hOu, AnonymousClass8ZN r3, UserSession userSession, Long l, String str, String str2, String str3, long j) {
        AnonymousClass7TG.A1N(userSession, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "instagram_music_on_profile_tap");
        if (A0e.isSampled()) {
            C51973G9u.A12(A0e, str, j);
            C51965G9l.A1C(hOu, A0e);
            C51965G9l.A1K(A0e, str2);
            C51971G9r.A16(r3, A0e, str3);
            A0e.A9F("best_audio_cluster_id", l);
            G9t.A1G(A0e);
            A0e.Cgf();
        }
    }

    public static final void A01(AnonymousClass0iw r3, UserSession userSession, Long l, Long l2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "instagram_organic_audio_unavailable_impression");
        if (A0e.isSampled()) {
            DbW.A16(A0e, r3);
            C51970G9q.A18(A0e, DbY.A04(l));
            A0e.A9F("target_id", Long.valueOf(C51967G9n.A08(l2, 0)));
            A0e.Cgf();
        }
    }
}
