package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class EF8 extends C228042kh {
    public final Context A00;
    public final UserSession A01;

    public EF8(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Context context = this.A00;
        UserSession userSession = this.A01;
        return new C46771Dky(context, userSession, AnonymousClass2o3.A00(userSession));
    }
}
