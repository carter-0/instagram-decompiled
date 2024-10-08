package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class FAI {
    public C49416EvI A00;
    public final Deque A01 = new LinkedList();
    public final Map A02 = AnonymousClass7TE.A1E();

    public static final void A00(FAI fai) {
        C49416EvI evI = fai.A00;
        if (evI != null) {
            ImmutableList A0K = DbU.A0K(fai.A01);
            C49918FEs fEs = evI.A00;
            if (fEs.A04) {
                UserSession userSession = fEs.A07;
                AnonymousClass0iw r9 = fEs.A06;
                FAI fai2 = fEs.A09;
                Map map = fai2.A02;
                ImmutableList A0K2 = DbU.A0K(map.keySet());
                Deque deque = fai2.A01;
                HashMap A012 = C49918FEs.A01(DbU.A0K(deque));
                String str = fEs.A01;
                C48137EZf eZf = C48137EZf.BLOCKED_ACCOUNTS;
                EZZ ezz = EZZ.SUGGESTED_BLOCKS;
                boolean A1Z = AnonymousClass7TG.A1Z(userSession, r9);
                0qQ.A0B(str, 4);
                C49760F5m.A01(eZf, ezz, r9, userSession, str, A0K2, A012, A1Z ? 1 : 0);
                if (182.A06(0Tu.A06, userSession, 36314622797810405L) && !DbU.A0K(deque).isEmpty()) {
                    C49760F5m.A01(eZf, ezz, r9, userSession, str, DbU.A0K(map.keySet()), C49918FEs.A01(DbU.A0K(deque)), 9);
                }
            }
            fEs.A04 = false;
            fEs.A0A.A01(C49918FEs.A00(fEs, A0K));
        }
    }
}
