package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Am  reason: invalid class name and case insensitive filesystem */
public final class C351808Am extends C228042kh {
    public final Application A00;
    public final UserSession A01;

    public C351808Am(Application application, UserSession userSession) {
        0qQ.A0B(application, 1);
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C351818An(this.A00, this.A01);
    }
}
