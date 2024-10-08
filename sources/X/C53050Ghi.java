package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ghi  reason: case insensitive filesystem */
public final class C53050Ghi extends 2Z7 {
    public final Application A00;
    public final UserSession A01;
    public final AnonymousClass57N A02;

    public final 2YL create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C60100Jfg(application, AnonymousClass1Nd.A00(userSession), userSession, this.A02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53050Ghi(Application application, UserSession userSession, AnonymousClass57N r3) {
        super(application);
        AnonymousClass7TG.A1U(application, userSession, r3);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = r3;
    }
}
