package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class NN3 extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public NN3(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        Context context = this.A00;
        AnonymousClass0iw r0 = this.A01;
        AnonymousClass7TG.A1T(userSession, context, r0);
        return new C67729Mti(context, userSession, new C69066Ne3(context, r0, userSession));
    }
}
