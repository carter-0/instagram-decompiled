package X;

import com.instagram.common.session.UserSession;

public final class OEO {
    public C74561PxA A00;
    public final C74497Pvr A01;
    public final UserSession A02;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.O25, java.lang.Object] */
    public /* synthetic */ OEO(UserSession userSession) {
        Object obj;
        02m r6 = 02m.A0p;
        0Tu r2 = 0Tu.A05;
        boolean A06 = 182.A06(r2, userSession, 36313686494677185L);
        boolean A062 = 182.A06(r2, userSession, 36314206185720297L);
        boolean A063 = 182.A06(r2, userSession, 36315546215517542L);
        OLJ olj = new OLJ(r6, new Object());
        if (A06) {
            obj = new C71771OqX(new C70684OGf(A062), olj, A062, A063);
        } else {
            obj = new Object();
        }
        C74497Pvr pvr = (C74497Pvr) obj;
        AnonymousClass7TG.A1P(userSession, pvr);
        this.A02 = userSession;
        this.A01 = pvr;
    }
}
