package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lal  reason: case insensitive filesystem */
public final class C64369Lal implements CallerContextable {
    public static final String __redex_internal_original_name = "AutoXpostingMutationController";
    public final UserSession A00;

    public static final void A00(C64369Lal lal, Integer num, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C39876ACx aCx = (C39876ACx) it.next();
            String str = aCx.A00;
            boolean z = aCx.A01;
            int hashCode = str.hashCode();
            Integer num2 = num;
            C64369Lal lal2 = lal;
            if (hashCode != 2153886) {
                if (hashCode != 77853049) {
                    if (hashCode == 79233237 && str.equals("STORY")) {
                        C363008it.A05.A01(lal2.A00, num2, "upsell", z, true);
                    }
                } else if (str.equals("REELS")) {
                    C367288qV.A0A(lal2.A00, "mutation", z, false);
                }
            } else if (str.equals("FEED")) {
                C363548ju.A03.A01(lal2.A00, num2, "upsell", z, false);
            }
        }
    }

    public final void A01(List list, C62320sa r6, C62320sa r7) {
        AnonymousClass7TG.A1R(r6, r7);
        UserSession userSession = this.A00;
        CallerContext callerContext = AnonymousClass8PU.A00;
        int intValue = C363038ix.A00(userSession).intValue();
        if (intValue == 0) {
            C59780JXz.A00.A01(userSession, new C65637LxE(this, list, r6, r7), list);
        } else if (intValue == 1) {
            C64105LNd.A00.A00(userSession, new C65636LxD(this, list, r6, r7), list);
        }
    }

    public C64369Lal(UserSession userSession) {
        this.A00 = userSession;
    }
}
