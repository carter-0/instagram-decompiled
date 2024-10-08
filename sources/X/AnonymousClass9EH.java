package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9EH  reason: invalid class name */
public final class AnonymousClass9EH implements AnonymousClass0lh {
    public final Context A00;
    public final UserSession A01;

    public final void onSessionWillEnd() {
        UserSession userSession = this.A01;
        userSession.A03(AnonymousClass9EH.class);
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5c(AnonymousClass000.A00(3833), 0);
        AR4.apply();
    }

    public AnonymousClass9EH(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
