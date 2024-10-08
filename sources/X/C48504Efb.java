package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;

/* renamed from: X.Efb  reason: case insensitive filesystem */
public abstract class C48504Efb {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        if (r7.A03 != null) {
            UserSession A0V = DbU.A0V(r7);
            DbS.A1Z(A0V);
            UserSession userSession = A0V;
            Context context = C308206Td.A09(r7).A00;
            2bL r3 = new 2bL(userSession);
            r3.A01.markerPoint(716775037, r3.A02.A00("chain_interstitial_bloks_action", false, false));
            if (!((String) DbW.A0d(r8)).equals(String.valueOf(QuickPromotionSurface.A0B.A00))) {
                return null;
            }
            2bK r1 = new 2bK(context, userSession);
            if (2bK.A08 == null) {
                r1.A03();
                return null;
            }
            r1.A02();
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
