package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class ArV implements Comparator {
    public final int A00;
    public final Object A01;

    public ArV(0sL r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable comparable;
        Comparable comparable2;
        int i;
        switch (this.A00) {
            case 0:
            case 1:
                List list = (List) this.A01;
                comparable = (Float) list.get(AnonymousClass7TE.A0M(((0eP) obj2).A00));
                comparable2 = (Float) list.get(AnonymousClass7TE.A0M(((0eP) obj).A00));
                break;
            case 2:
            case 3:
                C343047pa r8 = (C343047pa) obj;
                C343047pa r9 = (C343047pa) obj2;
                return (r8.A02 * r8.A01) - (r9.A02 * r9.A01);
            case 4:
                1Xj r82 = (1Xj) obj;
                List list2 = (List) this.A01;
                Iterator it = list2.iterator();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (!0qQ.A0K(it.next(), r82.A2n())) {
                        i3++;
                    }
                }
                comparable = Integer.valueOf(i3);
                1Xj r92 = (1Xj) obj2;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (0qQ.A0K(it2.next(), r92.A2n())) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            case 8:
                C343047pa r83 = (C343047pa) obj;
                C343047pa r93 = (C343047pa) obj2;
                0qQ.A0A(r83);
                long A002 = C343047pa.A00(r83);
                0qQ.A0A(r93);
                long A003 = A002 - C343047pa.A00(r93);
                if (A003 > 0) {
                    return 1;
                }
                if (A003 == 0) {
                    return 0;
                }
                return -1;
            case 9:
                C54575HJk hJk = ((GIV) this.A01).A05;
                comparable = Integer.valueOf(hJk.A0B((C267324bN) ((C376489Ie) obj).A03));
                i = hJk.A0B((C267324bN) ((C376489Ie) obj2).A03);
                break;
            default:
                return AnonymousClass7TE.A0M(((0sL) this.A01).invoke(obj, obj2));
        }
        comparable2 = Integer.valueOf(i);
        return 29b.A00(comparable, comparable2);
    }

    public ArV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
