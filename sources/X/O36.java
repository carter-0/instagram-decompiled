package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class O36 {
    public static final void A00(Context context, AnonymousClass0iw r8, UserSession userSession, String str, String str2, List list) {
        String str3;
        boolean A1Y = C51970G9q.A1Y(userSession);
        ArrayList A0m = C51970G9q.A0m(list);
        Iterator it = list.iterator();
        while (true) {
            str3 = null;
            if (!it.hasNext()) {
                break;
            }
            C254783t2 A0c = DbS.A0c(DbT.A0f(it));
            if (A0c instanceof C254763t0) {
                str3 = ((C254763t0) A0c).A00;
            }
            A0m.add(str3);
        }
        if (r8 != null) {
            str3 = r8.getModuleName();
        }
        ORO.A01(userSession, str3, str, (String) null, A0m);
        String str4 = "banner";
        if (A0m.size() > 1) {
            C69997Nvb.A00().A00(context, r8, "all");
            return;
        }
        FragmentActivity A06 = 2MD.A01().A06();
        if (A06 != null) {
            if (str2 != null) {
                str4 = str2;
            }
            if (r8 != null) {
                1pE A01 = 1pE.A01(A06, r8, userSession, str4);
                A01.A0B = DbS.A0c((DirectShareTarget) list.get(A1Y ? 1 : 0));
                A01.A06();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
