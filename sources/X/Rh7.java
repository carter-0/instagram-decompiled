package X;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class Rh7 {
    public static final Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        String A0h = DbY.A0h(r13, 0);
        List list = r13.A00;
        list.get(1);
        String A0t = DbU.A0t(list, 2);
        String A0t2 = DbU.A0t(list, 3);
        boolean A01 = Q0A.A01(list.get(4));
        Uri A09 = DbT.A09(A0h);
        UserSession A0B = C308206Td.A0B(r12);
        FragmentActivity activity = DbU.A0H(r12).getActivity();
        0qQ.A0C(A0B, AnonymousClass000.A00(2));
        UserSession userSession = A0B;
        if (activity != null) {
            String A10 = DbT.A10(A09);
            2EG r9 = 2EG.A1y;
            0qQ.A0B(userSession, 1);
            SUL sul = new SUL(activity, userSession, r9, A10, false);
            sul.A0E(userSession.A06);
            sul.A0S = "in_app_browser_v2";
            sul.A0Q = A0t;
            if (A0t != null) {
                sul.A1L.A00.putString("TrackingInfo.ARG_LINK_HISTORY_ITEM_ID", A0t);
            }
            sul.A0D(A0t2);
            if (A01) {
                sul.A0r = false;
                sul.A0D = ZonePolicy.A0D;
            }
            sul.A0A();
        }
        return null;
    }
}
