package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Eot  reason: case insensitive filesystem */
public abstract class C49075Eot {
    public static final void A00(AnonymousClass0iw r3, UserSession userSession, String str, String str2, String str3, String str4, String str5, Map map) {
        long j;
        Long A10;
        if (str5 == null || (A10 = AnonymousClass7TE.A10(str5)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_nme_benefits");
        if (A0e.isSampled()) {
            A0e.AAJ("event_type", str);
            A0e.AAJ("benefit_type", "BIZ_MULTIPLE_ADDRESSES");
            A0e.AAJ("subject_type", str3);
            DbY.A1H(A0e, str2, j);
            DbS.A1M(A0e, str4);
            A0e.A9H("extra", map);
            A0e.Cgf();
        }
    }
}
