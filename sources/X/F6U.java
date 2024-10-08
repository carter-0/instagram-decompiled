package X;

import android.content.Context;
import android.view.WindowManager;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class F6U {
    public static void A00(Context context) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131975817);
        A0Y.A0r(false);
        A0Y.A08(2131965890);
        A0Y.A0E(new C49969FHc(8));
        DbT.A1V(A0Y);
    }

    public static void A01(UserSession userSession, Context context, boolean z) {
        String str;
        String str2;
        IllegalStateException illegalStateException;
        0qQ.A0B(userSession, 0);
        ArrayList arrayList = 1Y3.A00;
        Iterator it = AnonymousClass7TE.A1D(arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            1Y2 r1 = (1Y2) it.next();
            if (!r1.COB(context, userSession)) {
                str = r1.AXv(context, userSession, z);
                break;
            }
        }
        Iterator it2 = AnonymousClass7TE.A1D(arrayList).iterator();
        while (true) {
            if (!it2.hasNext()) {
                str2 = null;
                break;
            }
            1Y2 r12 = (1Y2) it2.next();
            if (!r12.COB(context, userSession)) {
                str2 = r12.AXu(context, userSession, z);
                break;
            }
        }
        try {
            C358248ab A0Y = DbS.A0Y(context);
            if (str != null) {
                A0Y.A05 = str;
                if (str2 != null) {
                    A0Y.A0q(str2);
                    A0Y.A0r(false);
                    A0Y.A0E(new C49969FHc(9));
                    DbT.A1V(A0Y);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            }
            throw illegalStateException;
        } catch (WindowManager.BadTokenException unused) {
            C59689JTv.A09(context, str2);
        }
    }
}
