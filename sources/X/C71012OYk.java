package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

/* renamed from: X.OYk  reason: case insensitive filesystem */
public final class C71012OYk {
    public Long A00;
    public boolean A01;
    public boolean A02;
    public final UserFlowLogger A03;
    public final UserSession A04;

    public /* synthetic */ C71012OYk(UserSession userSession) {
        UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl(02m.A0p, true, false);
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = userFlowLoggerImpl;
    }

    public static final void A00(O6M o6m, C71012OYk oYk) {
        A01(oYk, C73915Plq.A00(oYk, o6m, 30));
    }

    public static final void A01(C71012OYk oYk, C62320sa r4) {
        if (182.A06(0Tu.A05, oYk.A04, 36323625049009469L)) {
            r4.invoke();
        }
    }
}
