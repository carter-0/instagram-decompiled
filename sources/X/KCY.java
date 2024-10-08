package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;

public final class KCY extends C228042kh {
    public final Context A00;
    public final UserSession A01;

    public KCY(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        Context applicationContext = this.A00.getApplicationContext();
        0qQ.A0C(applicationContext, AnonymousClass000.A00(29));
        return new C60148JgT(userSession, new L0J((Application) applicationContext));
    }
}
