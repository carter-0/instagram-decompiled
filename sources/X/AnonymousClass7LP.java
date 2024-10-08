package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7LP  reason: invalid class name */
public final class AnonymousClass7LP {
    public final UserSession A00;
    public final 0mo A01;
    public final AnonymousClass48T A02;

    public final ArrayList A00() {
        String A0g;
        ArrayList arrayList = new ArrayList();
        0mo r5 = this.A01;
        for (int i = r5.A01 - 1; -1 < i; i--) {
            if (r5.A05(i) instanceof AnonymousClass7LQ) {
                Object A05 = r5.A05(i);
                0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.direct.messagethread.rowdata.DirectMessageRowData");
                C254703su r2 = ((AnonymousClass7LQ) A05).A0e;
                0qQ.A07(r2);
                if (!C3257974e.A00(r2, this.A02, this.A00.A06, true) && (A0g = r2.A0g()) != null) {
                    arrayList.add(A0g);
                }
            }
        }
        return arrayList;
    }

    public AnonymousClass7LP(UserSession userSession, 0mo r2, AnonymousClass48T r3) {
        this.A00 = userSession;
        this.A02 = r3;
        this.A01 = r2;
    }
}
