package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6K7  reason: invalid class name */
public final class AnonymousClass6K7 {
    public static volatile AnonymousClass6K7 A03;
    public final 1QP A00;
    public final UserSession A01;
    public final Map A02 = new LinkedHashMap();

    public static final void A00(AnonymousClass6K7 r2, Integer num, long j) {
        String str;
        1QP r22 = r2.A00;
        boolean z = false;
        if (num != null) {
            z = true;
        }
        r22.flowAnnotate(j, "is_forced_muted", z);
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "roll_call";
                    break;
                case 2:
                    str = "media_overlaY";
                    break;
                default:
                    str = "audio_unavailable";
                    break;
            }
            r22.flowAnnotate(j, "force_muted_reason", str);
        }
    }

    public AnonymousClass6K7(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AnonymousClass1QO.A00(userSession);
    }
}
