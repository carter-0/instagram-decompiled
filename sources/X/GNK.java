package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class GNK {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass93T A02;

    public GNK(AnonymousClass0iw r1, UserSession userSession, AnonymousClass93T r3) {
        AnonymousClass7TG.A1U(userSession, r1, r3);
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void A00(Context context, C267324bN r6, C52058GDe gDe, String str, float f, float f2, float f3, float f4) {
        long j;
        Long l;
        int i;
        User A11;
        String A2n;
        Long A10;
        DbY.A1S(context, gDe);
        UserSession userSession = this.A01;
        AnonymousClass0iw r3 = this.A00;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "instagram_clips_playback_speed_changed");
        if (A0e.isSampled()) {
            DbW.A16(A0e, r3);
            1Xj r0 = r6.A02;
            if (r0 == null || (A2n = r0.A2n()) == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A18(A0e, j);
            C51969G9p.A16(A0e, gDe.A09());
            AnonymousClass93T r1 = this.A02;
            C51965G9l.A1O(A0e, r1.A01);
            C51965G9l.A1R(A0e, r1.A00);
            C51973G9u.A14(A0e, "ranking_info_token", r6.A0Q);
            1Xj r02 = r6.A02;
            if (r02 == null || (A11 = C51966G9m.A11(r02)) == null) {
                l = null;
            } else {
                l = C51972G9s.A0h(A11);
            }
            C51965G9l.A1H(A0e, l);
            AnonymousClass3W1 r03 = gDe.A0E;
            if (r03 != null) {
                i = r03.A05;
            } else {
                i = 0;
            }
            A0e.A8D(AnonymousClass000.A00(4684), Double.valueOf((double) i));
            A0e.A9F(AnonymousClass000.A00(1565), DbS.A0j(gDe.A08));
            A0e.A8D(AnonymousClass000.A00(4706), Double.valueOf((double) AnonymousClass0nB.A01(context)));
            A0e.A8D(AnonymousClass000.A00(4705), Double.valueOf((double) AnonymousClass0nB.A00(context)));
            A0e.A8D("playback_speed_from", Double.valueOf((double) f));
            A0e.A8D("playback_speed_to", Double.valueOf((double) f2));
            A0e.A8D("long_press_x_position", Double.valueOf((double) f3));
            A0e.A8D("long_press_y_position", Double.valueOf((double) f4));
            A0e.AAJ("gesture_state", str);
            DbX.A1L(A0e);
        }
    }
}
