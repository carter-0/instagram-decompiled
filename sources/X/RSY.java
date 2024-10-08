package X;

import android.util.Pair;
import com.instagram.android.R;
import java.util.List;
import java.util.Map;

public abstract class RSY {
    public static final Object A00(C307896Rx r13, AnonymousClass6Tm r14) {
        AnonymousClass6RB r5;
        Map map;
        Integer num;
        C307576Qq r0;
        C307586Qr A00;
        C277014uI A0A;
        Object A03 = r14.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        Object A02 = r14.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A02;
        Object A002 = r14.A00();
        0qQ.A0C(A002, "null cannot be cast to non-null type kotlin.Number");
        long A0R = AnonymousClass7TE.A0R(A002);
        C276544tV r6 = (C276544tV) r14.A03(3);
        C307786Rm r1 = r13.A03;
        if (r1 != null) {
            r5 = (AnonymousClass6RB) r1.A00(R.id.bk_context_key_async_component_store);
        } else {
            r5 = null;
        }
        if (r1 == null || r5 == null) {
            1Kn.A02("Failed to get query store", "BKBloksActionAsyncComponentCacheWriteImpl");
            return null;
        }
        C307446Qd A022 = C307476Qg.A02(r1);
        C245983dn.A02("Tree resources can only be read from the UI Thread");
        C10485Rt0 rt0 = (C10485Rt0) A022.A04.A02.get(str);
        if (rt0 == null) {
            1Kn.A02(002.A0R("Didn't find payload with id ", str), "BKBloksActionAsyncComponentCacheWriteImpl");
            return null;
        }
        if (r6 == null || (A0A = r6.A0A(42)) == null) {
            map = null;
        } else {
            map = (Map) C299275ur.A00(r13, AnonymousClass6Tm.A01, A0A);
        }
        Pair pair = rt0.A00;
        if (pair != null) {
            Object obj = pair.first;
            C7308Q3k q3k = (C7308Q3k) pair.second;
            if (!(obj == null || q3k == null)) {
                C7318Q3u A003 = C7314Q3q.A00(q3k, (List) null);
                if (map == null) {
                    map = 0Yt.A0E();
                }
                0qQ.A0B(str2, 0);
                C307616Qu r4 = r5.A02;
                if (r4 == null || (A00 = r4.A00.A00(str2)) == null) {
                    num = null;
                } else {
                    num = A00.A00;
                }
                if (num != AnonymousClass05K.A01) {
                    if (r4 != null) {
                        r0 = r4.A00;
                    } else {
                        r0 = null;
                    }
                    String A004 = Q32.A00(r0, str2, map);
                    AnonymousClass6R6 A005 = r5.A07.A00(str2);
                    Q3K q3k2 = Q3K.HOISTED_PREFETCH;
                    AnonymousClass7TF.A1B(A004, 0, q3k2);
                    A005.A01.A00(A003, q3k2, (T9F) null, A004, A0R, A005.A02.now());
                    return null;
                }
                throw AnonymousClass7TE.A0w(002.A0S("Cannot write to cache for secure prepackaged query ", str2, '.'));
            }
        }
        1Kn.A02(002.A0g("Stored payload for ", str, " is null"), "BKBloksActionAsyncComponentCacheWriteImpl");
        return null;
    }
}
