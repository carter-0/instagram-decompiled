package X;

import com.instagram.android.R;
import java.util.Map;

public abstract class RSU {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        AnonymousClass6RB r1;
        String A0g = DbY.A0g(r5);
        Object A02 = r5.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A02;
        C307786Rm r12 = r4.A03;
        if (r12 == null || (r1 = (AnonymousClass6RB) r12.A00(R.id.bk_context_key_async_component_store)) == null) {
            return null;
        }
        r1.A04(A0g, map, REH.A00);
        return null;
    }
}
