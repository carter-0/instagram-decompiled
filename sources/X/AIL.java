package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AIL {
    public static final AIL A00 = new Object();

    public static final C39788A9i A00(C39794A9p a9p, C347677xC r7, List list, List list2) {
        C347727xH r0;
        C347727xH r3 = C347727xH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        ImmutableList immutableList = 0sn.A00;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C347737xI r4 = (C347737xI) it.next();
            if (r4.A00 == a9p.A00 && r4.A04.containsAll(a9p.A03) && r4.A03.containsAll(a9p.A02) && (r0 = r4.A01) != null && r0 != r3) {
                r3 = r0;
                break;
            }
        }
        if (r3 == C347727xH.ALLOW || r3 == C347727xH.IGNORE) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw AnonymousClass7TE.A11("getRuleName");
            }
            immutableList = builder.build();
            0qQ.A07(immutableList);
        }
        return new C39788A9i(r7, r3, immutableList);
    }

    public static final List A01(C39794A9p a9p, C39794A9p a9p2, C347817xQ r11, Set set) {
        C39788A9i A002;
        ArrayList A0r = AnonymousClass7TG.A0r(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C39787A9h a9h = (C39787A9h) it.next();
            Map map = r11.A01;
            C347677xC r4 = a9h.A00;
            C347747xJ r6 = (C347747xJ) map.get(r4);
            if (r6 == null) {
                A002 = new C39788A9i(r4, C347727xH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, 0sn.A00);
            } else {
                A002 = A00(a9p, r4, a9h.A02, r6.A01);
                if (A002.A00 == C347727xH.ALLOW) {
                    List list = A002.A01;
                    if (!AnonymousClass7TE.A1b(list)) {
                        C39788A9i A003 = A00(a9p2, r4, a9h.A01, r6.A00);
                        A002 = new C39788A9i(r4, A003.A00, 00k.A0S(A003.A01, list));
                    }
                }
            }
            A0r.add(A002);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0r) {
            if (a9p.A01.contains(((C39788A9i) next).A00)) {
                A1C.add(next);
            }
        }
        return A1C;
    }
}
