package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.List;

public final class OL8 {
    public final MZ0 A00;
    public final C70808OMd A01;
    public final UserSession A02;
    public final OMV A03;

    public final void A00(ThreadFetchReason threadFetchReason, String str, 0sP r12, int i, long j, long j2) {
        UserSession userSession = this.A00.A00;
        C66613MYz mYz = (C66613MYz) userSession.A01(C66613MYz.class, C73921Pm1.A00(userSession, 48));
        0xY AR4 = C51969G9p.A0n(1Al.A01(mYz.A00), 1An.A0D, mYz).AR4();
        AR4.E5g(String.valueOf(j), 002.A0H(str, ':', i));
        AR4.apply();
        this.A01.A00(str, (List) null, 117, 0);
        boolean A1S = AnonymousClass7TF.A1S(i, 16);
        C72639PDs pDs = new C72639PDs(this, str, r12, j);
        OMV omv = this.A03;
        if (A1S) {
            omv.A01(threadFetchReason, pDs, j);
        } else {
            omv.A00(threadFetchReason, pDs, j2);
        }
    }

    public OL8(UserSession userSession, C70808OMd oMd) {
        AnonymousClass7TG.A1O(userSession, oMd);
        this.A02 = userSession;
        this.A01 = oMd;
        this.A00 = (MZ0) userSession.A01(MZ0.class, C73921Pm1.A00(userSession, 49));
        this.A03 = (OMV) userSession.A01(OMV.class, C73913Plo.A00(userSession, 4));
    }
}
