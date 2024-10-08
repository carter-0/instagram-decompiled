package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Mie  reason: case insensitive filesystem */
public final class C67120Mie {
    public final C263944Ny A00;
    public final 0wc A01;

    public C67120Mie(UserSession userSession) {
        C263944Ny r0;
        this.A01 = AnonymousClass0kN.A02(userSession);
        try {
            r0 = C263944Ny.A00(userSession.A06);
        } catch (NumberFormatException unused) {
            r0 = new C263944Ny(C51971G9r.A0m());
        }
        this.A00 = r0;
    }

    public final void A00(String str) {
        HashMap A0x = C66582MXn.A0x(str);
        A0x.put("inbox_throttle_state", str);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "direct_inbox_banner_impression");
        if (A0e.isSampled()) {
            A0e.AAE(this.A00, "user_igid");
            A0e.A9H("extra_data", A0x);
            A0e.Cgf();
        }
    }
}
