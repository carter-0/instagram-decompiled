package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class NN5 extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final MXR A02;

    public NN5(Application application, UserSession userSession, MXR mxr) {
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = mxr;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C67710MtP(this.A00, this.A01, this.A02);
    }
}
