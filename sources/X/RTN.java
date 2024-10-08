package X;

import android.animation.Animator;
import java.util.List;

public abstract class RTN {
    public static final Animator A00(C307896Rx r8, AnonymousClass6Tm r9) {
        Object q3a;
        C307786Rm r82 = r8.A03;
        if (r82 == null) {
            return null;
        }
        float A04 = C51970G9q.A04(r9.A01(), "null cannot be cast to non-null type kotlin.Number");
        Object A03 = r9.A03(1);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>");
        List list = (List) A03;
        long j = (long) (A04 * ((float) Q3U.A00));
        0qQ.A0B(list, 1);
        if (list.size() == 1) {
            q3a = 00k.A0I(list);
        } else {
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                Animator animator = (Animator) next;
                C307476Qg.A08(animator, r82);
                Q3U.A02(animator, ((long) i) * j);
                i = i2;
            }
            q3a = new C7300Q3a(AnonymousClass05K.A0C, list);
        }
        return (Animator) q3a;
    }
}
