package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

public final class S1Q {
    public final UserSession A00;
    public final AnonymousClass3Q2 A01;

    public S1Q(UserSession userSession, AnonymousClass3Q2 r3) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final LinkedHashMap A00(boolean z) {
        UserSession userSession = this.A00;
        AnonymousClass3Q2 r5 = this.A01;
        0yf A002 = C64193LTa.A00(userSession, r5, r5.A3t);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        0qQ.A0C(A002, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        A1H.put("X-Instagram-Rupload-Params", JTQ.A0c(A002));
        if (z && 182.A06(0Tu.A05, userSession, 36315103833885684L) && r5.A3O != null) {
            A1H.put(AnonymousClass000.A00(4223), 002.A0j("xpv_carousel_upload_ig4a", C51972G9s.A0n(), r5.A3t, ':', ':'));
        }
        return A1H;
    }
}
