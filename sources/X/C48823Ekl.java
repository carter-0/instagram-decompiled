package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Ekl  reason: case insensitive filesystem */
public abstract class C48823Ekl {
    public static final void A00(AnonymousClass0iw r3, UserSession userSession, String str, String str2, String str3, String str4, Map map) {
        long A07 = DbZ.A07(userSession.A06);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_nme_benefits");
        if (A0e.isSampled()) {
            A0e.AAJ("event_type", str2);
            A0e.AAJ("benefit_type", "BRANDED_THREADS");
            A0e.AAJ("subject_type", "subscriber");
            DbY.A1H(A0e, str3, A07);
            DbS.A1M(A0e, str);
            A0e.A9H("extra", map);
            DbV.A1I(A0e, str4);
        }
    }
}
