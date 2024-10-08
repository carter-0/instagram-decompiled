package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class F2E {
    public boolean A00;
    public final UserSession A01;
    public final boolean A02;

    public F2E(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = C363558jv.A00(userSession);
    }

    public final void A00() {
        CallerContext callerContext = C347337we.A00;
        C347347wf r5 = new C347347wf();
        2IS r6 = r5.A01.A00;
        r6.A02("ig_feed_xpost_upsell", true);
        ArrayList arrayList = r5.A02;
        arrayList.add("IG_FEED_CROSS_POSTING_UPSELL");
        r5.A00();
        UserSession userSession = this.A01;
        0Tu r7 = 0Tu.A06;
        if (!182.A06(r7, userSession, 2342156957701441860L) || 182.A06(0Tu.A05, userSession, 36314403754215962L)) {
            r6.A01(AnonymousClass000.A00(3337));
        }
        if (!182.A06(r7, userSession, 2342156957701507397L) || 182.A06(0Tu.A05, userSession, 36314403754215962L)) {
            r6.A01(AnonymousClass000.A00(3840));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        boolean z = r5.A00;
        0qQ.A0B(strArr, 2);
        C347337we.A00(userSession, new C50461Fc9(this, 1), r5, strArr, z);
    }
}
