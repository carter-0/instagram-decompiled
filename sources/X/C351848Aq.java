package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Aq  reason: invalid class name and case insensitive filesystem */
public final class C351848Aq extends AnonymousClass8Z8 {
    public final UserSession A00;
    public final Application A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C351848Aq(Application application, UserSession userSession) {
        super(new C377429Lu(24, application, userSession));
        0qQ.A0B(userSession, 1);
        0qQ.A0B(application, 2);
        this.A00 = userSession;
        this.A01 = application;
    }
}
