package X;

import android.animation.TimeInterpolator;
import java.util.List;

public abstract class RTF {
    public static final C7498QGp A00(C307896Rx r12, AnonymousClass6Tm r13) {
        float f;
        float f2;
        Integer num;
        C307786Rm r6 = r12.A03;
        if (r6 == null) {
            return null;
        }
        C277014uI A0P = DbW.A0P(r13, 0);
        List list = r13.A00;
        C277014uI A0R = DbV.A0R(list, 1);
        Object A03 = r13.A03(2);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        String str2 = (String) DbT.A0q(r13, "null cannot be cast to non-null type kotlin.String", 3);
        float A04 = C51970G9q.A04(r13.A03(4), "null cannot be cast to non-null type kotlin.Number");
        TimeInterpolator timeInterpolator = (TimeInterpolator) list.get(5);
        try {
            if (str.endsWith("%")) {
                f = AnonymousClass6Su.A00(str);
                f2 = AnonymousClass6Su.A00(str2);
                num = AnonymousClass05K.A00;
            } else {
                f = AnonymousClass6Su.A01(str);
                f2 = AnonymousClass6Su.A01(str2);
                num = AnonymousClass05K.A01;
            }
            C7498QGp qGp = new C7498QGp(num);
            qGp.setFloatValues(new float[]{f, f2});
            qGp.setDuration((long) (A04 * ((float) Q3U.A00)));
            qGp.setInterpolator(timeInterpolator);
            qGp.addUpdateListener(new I83(2, (Object) r12, (Object) A0P));
            if (A0R == null) {
                return qGp;
            }
            Q3U.A04(qGp, r6, r12, A0R);
            return qGp;
        } catch (C258053yO e) {
            throw C51973G9u.A0g(e, "Could not parse start and end values. ", AnonymousClass7TE.A1A());
        }
    }
}
