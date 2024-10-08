package X;

import android.animation.Animator;
import java.util.List;

public abstract class RTL {
    public static final Animator A00(C307896Rx r8, AnonymousClass6Tm r9) {
        Object q3a;
        C307786Rm r82 = r8.A03;
        if (r82 == null) {
            return null;
        }
        Object A01 = r9.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>");
        List list = (List) A01;
        0qQ.A0B(list, 1);
        int size = list.size();
        if (size == 1) {
            q3a = 00k.A0I(list);
        } else {
            for (int i = 0; i < size; i++) {
                Animator animator = (Animator) list.get(i);
                C307476Qg.A08(animator, r82);
                if (i > 0) {
                    Animator animator2 = (Animator) list.get(i - 1);
                    Q3U.A02(animator, animator2.getStartDelay() + animator2.getDuration());
                }
            }
            q3a = new C7300Q3a(AnonymousClass05K.A01, list);
        }
        return (Animator) q3a;
    }
}
