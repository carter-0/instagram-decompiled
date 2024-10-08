package X;

import android.animation.Animator;
import java.util.List;

/* renamed from: X.Q3b  reason: case insensitive filesystem */
public abstract class C7301Q3b {
    public static final Animator A00(C307896Rx r7, AnonymousClass6Tm r8) {
        Animator q3a;
        C307786Rm r5 = r7.A03;
        if (r5 == null) {
            return null;
        }
        C277014uI A0R = DbV.A0R(r8.A00, 0);
        float A04 = C51970G9q.A04(r8.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A00 = r8.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type kotlin.collections.List<android.animation.Animator>");
        List<Animator> list = (List) A00;
        long j = (long) (A04 * ((float) Q3U.A00));
        0qQ.A0B(list, 1);
        if (list.size() == 1) {
            q3a = (Animator) 00k.A0I(list);
            Q3U.A02(q3a, j);
        } else {
            for (Animator animator : list) {
                C307476Qg.A08(animator, r5);
                Q3U.A02(animator, j);
            }
            q3a = new C7300Q3a(AnonymousClass05K.A00, list);
        }
        if (A0R == null) {
            return q3a;
        }
        Q3U.A04(q3a, r5, r7, A0R);
        return q3a;
    }
}
