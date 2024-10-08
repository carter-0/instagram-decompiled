package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class NN2 extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final C62320sa A02;

    public /* synthetic */ NN2(Application application, UserSession userSession) {
        MYO A012 = MYO.A01(userSession, 12);
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = A012;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C67709MtO(this.A00, this.A01, (NUN) this.A02.invoke());
    }
}
