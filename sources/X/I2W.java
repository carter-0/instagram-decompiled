package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.concurrent.TimeUnit;

public abstract class I2W {
    public static final void A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        AnonymousClass7TG.A0g(A0q, "seen_double_tap_comment_to_like_nux_count").apply();
        0xY AR4 = A0q.AR4();
        AR4.E5c("seen_double_tap_comment_to_like_nux_time", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        AR4.apply();
    }

    public static final boolean A01(C337197fs r6, C333777a7 r7, C335847dd r8, UserSession userSession, AnonymousClass571 r10) {
        0qQ.A0B(userSession, 0);
        return AnonymousClass7TE.A0q(userSession).getInt("seen_share_comment_nux_count", 0) < 1 && I5a.A00.A02(r6, r7, r8, userSession, r10) && !182.A06(0Tu.A05, userSession, 36323032344177408L);
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1Av A00 = 1Au.A00(userSession);
        if (AnonymousClass7TG.A1a(A00, A00.A8M, 1Av.A8a, 85)) {
            return false;
        }
        0xa r5 = A00.A01;
        if (r5.getInt("seen_double_tap_comment_to_like_nux_count", 0) >= 3 || TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - DbW.A06(r5, "seen_double_tap_comment_to_like_nux_time") <= SandboxRepository.CACHE_TTL) {
            return false;
        }
        return true;
    }
}
