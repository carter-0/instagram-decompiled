package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;

public abstract class V9U {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        String str;
        Object obj = r12.A00.get(0);
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r2 = (C276544tV) obj;
        UserSession A0R = DbW.A0R(r11);
        FragmentActivity A04 = C308206Td.A04(r11);
        String A0K = r2.A0K(45);
        String A0K2 = r2.A0K(46);
        String A0G = r2.A0G();
        if (A0G != null) {
            str = AnonymousClass7TF.A0k(A0G);
        } else {
            str = null;
        }
        XIGIGBoostDestination A00 = C16852V8h.A00(str);
        boolean A0T = r2.A0T(false);
        0qQ.A07(r2.A0N(43));
        C305936Kd.A02(A04, A00, new C19163WNv(r11, r2), A0R, A0K, A0K2, A0T);
        return null;
    }
}
