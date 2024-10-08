package X;

import com.instagram.android.R;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Q3J {
    public static final Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        Q3K q3k;
        AnonymousClass6RB r2;
        String A0F;
        Object A03 = r13.A03(0);
        DbS.A1Y(A03);
        String str = (String) A03;
        Object A02 = r13.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map map = (Map) A02;
        Object A00 = r13.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type kotlin.Number");
        long A0R = AnonymousClass7TE.A0R(A00);
        C276544tV r1 = (C276544tV) DbT.A0p(r13, 3);
        if (r1 == null || (A0F = r1.A0F()) == null) {
            q3k = null;
        } else {
            q3k = Q3K.valueOf(AnonymousClass7TF.A0k(A0F));
        }
        0qQ.A0C(q3k, "null cannot be cast to non-null type com.instagram.common.bloks.componentquery.BloksComponentQueryStore.BloksAsyncComponentQueryPurpose");
        boolean A0R2 = r1.A0R(41, false);
        boolean A0R3 = r1.A0R(40, false);
        List A0N = r1.A0N(43);
        0qQ.A07(A0N);
        Set A0k = 00k.A0k(A0N);
        C307786Rm r14 = r12.A03;
        if (!(r14 == null || (r2 = (AnonymousClass6RB) r14.A00(R.id.bk_context_key_async_component_store)) == null)) {
            r2.A03(q3k, (JPG) null, str, map, A0k, A0R, A0R3, A0R2);
        }
        return null;
    }
}
