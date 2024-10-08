package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8X5  reason: invalid class name */
public final class AnonymousClass8X5 implements C3493580b {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        0qQ.A0B(obj2, 1);
        UserSession userSession = this.A01;
        if (27p.A01(userSession).A0J() == C279294yP.STORY && obj2 == AnonymousClass80X.POST_CAPTURE && 182.A06(0Tu.A05, userSession, 36318471090673803L)) {
            new C367188qK(userSession).A00(this.A00, userSession, C367208qM.A06);
        }
    }

    public AnonymousClass8X5(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
