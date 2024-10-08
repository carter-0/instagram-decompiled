package X;

import android.animation.TimeInterpolator;
import java.util.List;

public abstract class Q3T {
    public static final Q3Q A00(C307896Rx r12, AnonymousClass6Tm r13) {
        C307786Rm r7 = r12.A03;
        if (r7 == null) {
            return null;
        }
        C277014uI A0P = DbW.A0P(r13, 0);
        List list = r13.A00;
        C277014uI A0R = DbV.A0R(list, 1);
        float A04 = C51970G9q.A04(r13.A03(2), "null cannot be cast to non-null type kotlin.Number");
        float A042 = C51970G9q.A04(r13.A03(3), "null cannot be cast to non-null type kotlin.Number");
        float A043 = C51970G9q.A04(r13.A03(4), "null cannot be cast to non-null type kotlin.Number");
        Q3Q q3q = new Q3Q();
        q3q.setFloatValues(new float[]{A04, A042});
        q3q.setDuration((long) (A043 * ((float) Q3U.A00)));
        q3q.setInterpolator((TimeInterpolator) list.get(5));
        q3q.addUpdateListener(new I83(0, (Object) r12, (Object) A0P));
        if (A0R == null) {
            return q3q;
        }
        Q3U.A04(q3q, r7, r12, A0R);
        return q3q;
    }
}
