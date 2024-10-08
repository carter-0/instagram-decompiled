package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class Q44 {
    public static int A00(C13670Tee tee, List list) {
        for (int i = 0; i < list.size(); i++) {
            C276544tV r1 = (C276544tV) list.get(i);
            if (r1.A0C() != null && tee.Ezc(r1)) {
                return i;
            }
        }
        return -1;
    }

    public static void A04(C307446Qd r4, String str, List list) {
        C7296Q2v q2v = new C7296Q2v(str);
        Pair A0K = Pxe.A0K(new Q43(q2v), new R9Y(1, list, q2v));
        r4.A0D((C13670Tee) A0K.first, (Q42) A0K.second);
    }

    public static Pair A01(C276544tV r6, C13670Tee tee) {
        Object obj;
        int i;
        int[] A00 = C64361Kj.A00().A03().A00(r6.A04);
        int length = A00.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                obj = Collections.EMPTY_LIST;
                i = -1;
                break;
            }
            int i3 = A00[i2];
            List A0M = r6.A0M(i3);
            i = A00(tee, A0M);
            if (i >= 0) {
                obj = AnonymousClass7TE.A1D(A0M);
                r6.A0P(i3, obj);
                break;
            }
            i2++;
        }
        return Pxf.A0K(obj, i);
    }

    public static ArrayList A02(C307446Qd r4, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3034368u r1 = (C3034368u) it.next();
            if (!r4.A0N) {
                C245983dn.A02("Tree operations are only supported from the UI Thread");
                r4.A0G.add(r1);
                C307446Qd.A02(r4);
            }
            A1C.add(r1.A02);
        }
        return A1C;
    }

    public static ArrayList A03(C276544tV r7, List list) {
        ArrayList A0m = C51970G9q.A0m(list);
        for (int i = 0; i < list.size(); i++) {
            C276544tV r2 = (C276544tV) list.get(i);
            if (r2 != null) {
                if (r2.A04 == 13346) {
                    List A0N = r2.A0N(32);
                    for (int i2 = 0; i2 < A0N.size(); i2++) {
                        C276544tV r22 = (C276544tV) A0N.get(i2);
                        A0m.add(C7288Q2n.A00(r7.A01, new Q4J(r22), r22));
                    }
                } else {
                    A0m.add(C7288Q2n.A00(r7.A01, new Q4J(r2), r2));
                }
            }
        }
        return A0m;
    }
}
