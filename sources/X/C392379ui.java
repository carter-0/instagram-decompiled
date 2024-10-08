package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9ui  reason: invalid class name and case insensitive filesystem */
public abstract class C392379ui {
    public static final C39663A4d A00(C296505qA r7, A8A a8a) {
        C296545qF r1;
        String str;
        Map.Entry A1J;
        Iterator A0u = AnonymousClass7TF.A0u(a8a.A03);
        loop0:
        while (true) {
            if (A0u.hasNext()) {
                A1J = AnonymousClass7TE.A1J(A0u);
                String str2 = (String) A1J.getKey();
                0qQ.A0B(str2, 0);
                List list = r7.A0E;
                0qQ.A0B(list, 0);
                int size = list.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        r1 = (C296545qF) list.get(size);
                        if (!str2.equals(r1.A08) && !str2.equals(r1.A07)) {
                            if (i < 0) {
                                break;
                            }
                            size = i;
                        } else {
                            str = (String) A1J.getValue();
                        }
                    }
                }
            } else {
                Map map = a8a.A04;
                if (!map.isEmpty()) {
                    List list2 = r7.A0G;
                    0qQ.A0B(list2, 0);
                    Iterator it = new 097(list2).iterator();
                    while (it.hasNext()) {
                        C238873Dt r12 = (C238873Dt) it.next();
                        String str3 = (String) map.get(r12.A01.toString());
                        if (str3 != null) {
                            return new C39663A4d((C296545qF) r7.A0H.get(r12), str3);
                        }
                    }
                }
                Iterator it2 = a8a.A00.iterator();
                if (it2.hasNext()) {
                    it2.next();
                    throw AnonymousClass7TE.A11("getAllowlist");
                }
                r1 = null;
                if (!a8a.A06) {
                    return null;
                }
                str = "generic_click";
            }
        }
        str = (String) A1J.getValue();
        return new C39663A4d(r1, str);
    }
}
