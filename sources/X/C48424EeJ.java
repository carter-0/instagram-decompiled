package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.EeJ  reason: case insensitive filesystem */
public abstract class C48424EeJ {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        String A0h = DbY.A0h(r8, 1);
        Object A0j = DbU.A0j(r8);
        0qQ.A0C(A0j, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        UserSession A0Z = DbT.A0Z(r7);
        1Xj A0B = 1Xj.A0h.A0B(0c9.A04.A01(A0Z, DbT.A10(new JSONObject((Map) A0j))));
        if (A0B != null) {
            A0B.AE7(A0Z);
        }
        1Ng A00 = AnonymousClass1Nd.A00(A0Z);
        C294255m9 r3 = C294255m9.A04;
        A00.A00(new C321786uk(r3, A0h));
        AnonymousClass1Nd.A00(A0Z).A00(new C321786uk(r3, A0Z.A06));
        return null;
    }
}
