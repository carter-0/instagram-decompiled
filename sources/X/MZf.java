package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class MZf implements AnonymousClass2KC {
    public final UserSession A00;
    public final C66598MYk A01;

    public MZf(UserSession userSession, C66598MYk mYk) {
        0qQ.A0B(mYk, 2);
        this.A00 = userSession;
        this.A01 = mYk;
    }

    public final AnonymousClass3H4 E6u() {
        C61072JwA jwA = (C61072JwA) this.A01.A01.A0X();
        if (jwA == null) {
            return new AnonymousClass3H4(new AnonymousClass3H3(0, -1, -1), (List) null, (Map) null);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        UserSession userSession = this.A00;
        HashSet A1F = AnonymousClass7TE.A1F();
        if (2El.A0C(userSession)) {
            A1F.add(AnonymousClass2EL.A00);
            A1F.add(AnonymousClass2EU.A00);
        }
        HashMap hashMap = new HashMap(A1F.size());
        Iterator A1H = C51966G9m.A1H(jwA.A02);
        int i = 0;
        while (A1H.hasNext()) {
            N4E n4e = (N4E) A1H.next();
            AnonymousClass5HX r1 = new AnonymousClass5HX(n4e);
            if (n4e.A06) {
                if (i < 20) {
                    A1C.add(r1);
                }
                Iterator it = A1F.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((2EM) next).A00 == n4e.A01) {
                        if (next != null) {
                            C66581MXm.A1S(next, hashMap, AnonymousClass7TE.A0M(hashMap.getOrDefault(next, 0)) + 1);
                        }
                    }
                }
            }
            i++;
        }
        int size = A1C.size();
        return new AnonymousClass3H4(new AnonymousClass3H3(size, -1, size), A1C, hashMap);
    }
}
