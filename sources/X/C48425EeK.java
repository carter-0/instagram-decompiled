package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.EeK  reason: case insensitive filesystem */
public abstract class C48425EeK {
    public static final Object A00(C307896Rx r2, AnonymousClass6Tm r3) {
        Object A0j = DbU.A0j(r3);
        0qQ.A0C(A0j, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        UserSession A0Z = DbT.A0Z(r2);
        1Xj A0B = 1Xj.A0h.A0B(0c9.A04.A01(A0Z, DbT.A10(new JSONObject((Map) A0j))));
        if (A0B != null) {
            A0B.AE7(A0Z);
        }
        return null;
    }
}
