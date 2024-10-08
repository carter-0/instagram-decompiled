package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.4sj  reason: invalid class name and case insensitive filesystem */
public final class C276144sj implements C2361432p {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C249763kK A02;

    public C276144sj(UserSession userSession, AnonymousClass4DU r3, C249763kK r4) {
        0qQ.A0B(r4, 2);
        this.A00 = userSession;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final void CjM(1Xj r10, AnonymousClass3W1 r11) {
        0qQ.A0B(r10, 0);
        0qQ.A0B(r11, 1);
        UserSession userSession = this.A00;
        C249763kK r5 = this.A02;
        AnonymousClass4DU r4 = this.A01;
        C254523sc A022 = C254513sb.A02(userSession, r10, r4, r5, Integer.valueOf(r11.getPosition()), -1, "more_indicator_tap");
        if (A022 != null) {
            C233822wX.A0C(userSession, A022, r10, r4, (Integer) null);
        }
    }

    public final void CjN(1Xj r17, AnonymousClass3W1 r18) {
        1Xj r10 = r17;
        0qQ.A0B(r10, 0);
        AnonymousClass3W1 r0 = r18;
        0qQ.A0B(r0, 1);
        UserSession userSession = this.A00;
        C249763kK r12 = this.A02;
        AnonymousClass4DU r11 = this.A01;
        C254523sc A022 = C254513sb.A02(userSession, r10, r11, r12, Integer.valueOf(r0.getPosition()), -1, "feed_video_end_scene_impression");
        if (A022 != null) {
            A022.A01 = r10.A0k();
            A022.A5K = "more_indicator";
            0jB r4 = new 0jB();
            Map map = r4.A00;
            map.put("mid_nudge_auto_dismiss_enabled", true);
            C231512rn.A00(userSession);
            double A002 = 182.A00(0Tu.A05, userSession, 37173757991191137L);
            if (A002 == 0.0d) {
                A002 = r10.A0k() / 3.0d;
            }
            map.put("mid_nudge_auto_dismiss_duration", Double.valueOf(A002));
            A022.A0E(r4);
            C233822wX.A0C(userSession, A022, r10, r11, (Integer) null);
        }
    }
}
