package X;

import android.animation.Animator;

public abstract class RTI {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        Animator A01;
        C307786Rm r2 = r4.A03;
        if (r2 == null || (A01 = Q3U.A01(r2, DbY.A0g(r5))) == null) {
            return null;
        }
        long totalDuration = A01.getTotalDuration();
        if (totalDuration == -1) {
            return -1L;
        }
        return Float.valueOf(((float) totalDuration) / ((float) Q3U.A00));
    }
}
