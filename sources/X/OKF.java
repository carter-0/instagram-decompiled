package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class OKF {
    public final ONE A00;
    public final UserSession A01;

    public final void A00(C331237Qc r10, List list, 0sP r12, long j) {
        List list2 = list;
        0qQ.A0B(list, 2);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(C2611348j.A03(AnonymousClass7TE.A18(it)));
        }
        0sP r6 = r12;
        if (A0r.isEmpty()) {
            r12.invoke(AnonymousClass7TF.A0x(0sn.A00, 10019));
            return;
        }
        C66847Mdg.A00(new C73957Pmb(this, r10, A0r, list2, r6, j), this.A01);
    }

    public OKF(UserSession userSession) {
        this.A01 = userSession;
        0qQ.A0B(userSession, 0);
        this.A00 = (ONE) userSession.A01(ONE.class, new C73661Pha(userSession, 42));
        OSF.A00();
    }
}
