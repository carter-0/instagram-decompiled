package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.graphics.Color;
import java.util.List;

public abstract class RTE {
    public static final Q3Q A00(C307896Rx r11, AnonymousClass6Tm r12) {
        C307786Rm r6 = r11.A03;
        if (r6 == null) {
            return null;
        }
        C277014uI A0P = DbW.A0P(r12, 0);
        List list = r12.A00;
        C277014uI A0R = DbV.A0R(list, 1);
        Object A03 = r12.A03(2);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        int parseColor = Color.parseColor((String) A03);
        int parseColor2 = Color.parseColor((String) DbT.A0q(r12, "null cannot be cast to non-null type kotlin.String", 3));
        float A04 = C51970G9q.A04(r12.A03(4), "null cannot be cast to non-null type kotlin.Number");
        Q3Q q3q = new Q3Q();
        q3q.setIntValues(new int[]{parseColor, parseColor2});
        q3q.setEvaluator(new ArgbEvaluator());
        q3q.setDuration((long) (A04 * ((float) Q3U.A00)));
        q3q.setInterpolator((TimeInterpolator) list.get(5));
        q3q.addUpdateListener(new I83(1, (Object) r11, (Object) A0P));
        if (A0R == null) {
            return q3q;
        }
        Q3U.A04(q3q, r6, r11, A0R);
        return q3q;
    }
}
