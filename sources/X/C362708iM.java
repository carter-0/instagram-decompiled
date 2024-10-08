package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8iM  reason: invalid class name and case insensitive filesystem */
public final class C362708iM {
    public final UserSession A00;
    public final C279284yO A01;
    public final C362718iN A02;
    public final List A03 = new ArrayList();

    public C362708iM(UserSession userSession, C279284yO r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = new C362718iN(userSession);
    }

    public static final void A00(C362898if r4, C362708iM r5, List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass9JL r2 = (AnonymousClass9JL) it.next();
                if (r2.A02 == C391339sj.OPTED_IN) {
                    r5.A03.add(r2.A03);
                }
            }
            r4.A00.A00();
        }
    }
}
