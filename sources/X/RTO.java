package X;

import android.animation.Animator;

public abstract class RTO {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        String str;
        C307786Rm r5 = r7.A03;
        if (r5 == null) {
            return null;
        }
        Object A01 = r8.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type android.animation.Animator");
        Object A03 = r8.A03(1);
        DbS.A1Y(A03);
        String str2 = (String) A03;
        Q3U q3u = Q3U.A01;
        Q3U.A05((Animator) A01, r5, str2);
        C276634te r0 = r7.A02;
        if (r0 != null) {
            str = r0.BOB();
        } else {
            str = null;
        }
        q3u.A06(r5, str2, str, true);
        return null;
    }
}
