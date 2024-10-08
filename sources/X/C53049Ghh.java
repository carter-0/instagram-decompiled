package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ghh  reason: case insensitive filesystem */
public final class C53049Ghh extends 2Z7 {
    public final Application A00;
    public final UserSession A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53049Ghh(Application application, UserSession userSession, String str) {
        super(application);
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final 2YL create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C60101Jfh(application, userSession, C54975Ha8.A00(userSession), 28K.A00(userSession), this.A02);
    }
}
