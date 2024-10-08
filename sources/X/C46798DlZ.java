package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.DlZ  reason: case insensitive filesystem */
public final class C46798DlZ extends 2Z7 {
    public final Application A00;
    public final UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46798DlZ(Application application, UserSession userSession) {
        super(application);
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    public final 2YL create(Class cls) {
        return new C46728DkH(this.A00, this.A01);
    }
}
