package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.882  reason: invalid class name */
public final class AnonymousClass882 extends 2YL {
    public C270564gw A00;
    public final Application A01;
    public final UserSession A02;
    public final HashMap A03 = new HashMap();
    public final C249513ju A04;
    public final AnonymousClass0r6 A05;

    public AnonymousClass882(Application application, UserSession userSession) {
        0qQ.A0B(application, 1);
        0qQ.A0B(userSession, 2);
        this.A01 = application;
        this.A02 = userSession;
        1HR r0 = new 1HR(0);
        this.A04 = r0;
        this.A05 = 0u9.A04(r0);
    }

    public static final void A00(AnonymousClass882 r4) {
        C318136oS A002 = C318116oQ.A00(r4);
        1Eo.A05(19B.A00, new MG7(r4, (AnonymousClass4D7) null, 16), A002);
        C310336ap r3 = new C310336ap();
        r3.A06();
        r3.A0D = r4.A01.getApplicationContext().getString(2131955892);
        1xC.A01.A00(new AnonymousClass3GP(r3.A00()));
    }
}
