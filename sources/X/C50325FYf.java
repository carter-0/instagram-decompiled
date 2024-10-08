package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.FYf  reason: case insensitive filesystem */
public final class C50325FYf implements AnonymousClass0lh {
    public boolean A00;
    public final UserSession A01;

    public C50325FYf(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A00() {
        UserSession userSession = this.A01;
        if (!182.A06(0Tu.A06, userSession, 2342157464507583031L) && 182.A06(0Tu.A05, userSession, 36314455293823542L)) {
            CallerContext callerContext = C347337we.A00;
            C347347wf r4 = new C347347wf();
            C347357wg r0 = r4.A01;
            r0.A00.A02("ig_discover_people_upsell", AnonymousClass7TE.A0v());
            ArrayList arrayList = r4.A02;
            arrayList.add("IG_DISCOVER_PEOPLE_HOME_UPSELL");
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            boolean z = r4.A00;
            0qQ.A0B(strArr, 2);
            C347337we.A00(userSession, new C50461Fc9(this, 0), r4, strArr, z);
        }
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C50325FYf.class);
    }
}
