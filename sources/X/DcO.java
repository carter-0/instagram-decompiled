package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class DcO extends C392289uY {
    public C49571Eyg A00;
    public final 1Av A01;
    public final UserSession A02;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        C49571Eyg eyg = this.A00;
        if (eyg == null) {
            eyg = new C49571Eyg(context, new C58679Ivo(this, 31));
            this.A00 = eyg;
        }
        return AnonymousClass7TE.A0c(eyg.A01);
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r8, boolean z) {
        0qQ.A0B(puH, 1);
        if (r8 != null) {
            UserSession userSession = this.A02;
            0qQ.A0B(userSession, 0);
            1Av A002 = 1Au.A00(userSession);
            if (A002.A01.getInt("blend_direct_thread_nux_seen_count", 0) < 3 && 1Av.A07(A002, "blend_direct_thread_nux_last_shown_time_ms", 1) && 182.A06(0Tu.A05, userSession, 36324123265347398L) && GAW.A00(userSession).booleanValue()) {
                puH.DoM(this);
                return;
            }
        }
        puH.onFailure();
    }

    public DcO(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = 1Au.A00(userSession);
    }
}
