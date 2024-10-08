package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.LJh  reason: case insensitive filesystem */
public abstract class C64020LJh {
    public static final List A01(UserSession userSession, C255773uh r7) {
        DUA A05;
        DUA A052;
        0qQ.A0B(userSession, 1);
        if (!r7.A1H() || (A05 = r7.A05()) == null) {
            return null;
        }
        Reel A0M = ReelStore.A03(userSession).A0M(r7.A0k);
        if (A0M == null) {
            return 0sn.A00;
        }
        List A0O = A0M.A0O(userSession);
        ArrayList<C255773uh> A15 = DbV.A15(A0O);
        for (Object next : A0O) {
            C255773uh r1 = (C255773uh) next;
            if (!(!r1.A1H() || r1.A0b == null || (A052 = r1.A05()) == null)) {
                JTR.A1P(A05.BrW(), A052.BrW(), next, A15);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A15);
        for (C255773uh r0 : A15) {
            1Xj r02 = r0.A0b;
            0qQ.A0A(r02);
            A0r.add(r02);
        }
        return A0r;
    }

    public static final int A00(UserSession userSession, C255773uh r6) {
        DUA A05;
        Reel A0M;
        DUA A052;
        boolean A1X = DbW.A1X(userSession);
        int i = 0;
        if (!r6.A1H() || (A05 = r6.A05()) == null || (A0M = ReelStore.A03(userSession).A0M(r6.A0k)) == null) {
            return A1X ? 1 : 0;
        }
        List<C255773uh> A0O = A0M.A0O(userSession);
        0qQ.A07(A0O);
        if (!(A0O instanceof Collection) || !A0O.isEmpty()) {
            for (C255773uh r1 : A0O) {
                if (r1.A1H() && (A052 = r1.A05()) != null && 0qQ.A0K(A05.BrW(), A052.BrW()) && (i = i + 1) < 0) {
                    0sr.A1S();
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        return i;
    }
}
