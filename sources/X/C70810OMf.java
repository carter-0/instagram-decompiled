package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.activity.RtcCallActivity;

/* renamed from: X.OMf  reason: case insensitive filesystem */
public final class C70810OMf {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void A00(String str, Long l) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A02;
        C71342cb.A00(userSession).A0D(this.A01, str, 0);
        RtcCallActivity.A0C.A00(this.A00, userSession, l);
    }

    public final boolean A01(String str) {
        0qQ.A0B(str, 0);
        C72192OyC A012 = C66953Mfm.A01(this.A02);
        if (A012 == null) {
            return false;
        }
        if (!A012.A09() && ((N9J) A012.A09.A0K.A00.A00).A01 != AnonymousClass05K.A01) {
            return false;
        }
        A00(str, (Long) null);
        return true;
    }

    public C70810OMf(Context context, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
