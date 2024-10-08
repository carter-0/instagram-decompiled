package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6MZ  reason: invalid class name */
public abstract class AnonymousClass6MZ {
    public static final void A00(Context context, View view, View view2, View view3, UserSession userSession, C309426Yf r12, 0sL r13) {
        UserSession userSession2 = userSession;
        if (182.A06(0Tu.A05, userSession, 36313909835335984L)) {
            view.setOnTouchListener(new C71436Okb(context, view2, view3, userSession2, r12, new C377439Lv(35, r13, view)));
            return;
        }
        AnonymousClass0fU.A00(new C306446Me(r13), view);
    }

    public static final boolean A01(UserSession userSession, C255773uh r5, boolean z, boolean z2, boolean z3, boolean z4) {
        if (C297785sK.A0D(userSession, r5) || z2 || z3 || z4) {
            return false;
        }
        0Tu r3 = 0Tu.A05;
        if (!z) {
            return 182.A06(r3, userSession, 36313909835991349L);
        }
        if (!182.A06(r3, userSession, 36313909836187958L) || !182.A06(r3, userSession, 36313909835991349L)) {
            return false;
        }
        return true;
    }
}
