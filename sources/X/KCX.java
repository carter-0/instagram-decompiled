package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class KCX extends C228042kh {
    public final Context A00;
    public final UserSession A01;

    public KCX(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        return new C60121Jg2(C311746dB.A00(this.A00, userSession), userSession);
    }
}
