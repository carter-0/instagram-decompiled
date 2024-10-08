package X;

import android.animation.Animator;
import java.util.UUID;

public abstract class Q3Y {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        C307786Rm r6 = r8.A03;
        if (r6 != null) {
            Object A01 = r9.A01();
            0qQ.A0C(A01, "null cannot be cast to non-null type android.animation.Animator");
            Q3U q3u = Q3U.A01;
            String str = null;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("NO_ID");
            String A0i = AnonymousClass7TF.A0i(UUID.randomUUID(), A1A);
            Q3U.A05((Animator) A01, r6, A0i);
            C276634te r1 = r8.A02;
            if (r1 != null) {
                str = r1.BOB();
            }
            q3u.A06(r6, A0i, str, true);
        }
        return null;
    }
}
