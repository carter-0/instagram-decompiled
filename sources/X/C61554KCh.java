package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.KCh  reason: case insensitive filesystem */
public final class C61554KCh extends C228042kh {
    public final Application A00;
    public final UserSession A01;

    public C61554KCh(Application application, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60089JfV(this.A00, this.A01);
    }
}
