package X;

import com.facebook.hyperthrift.HyperThriftBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class XUL {
    public static final List A00(List list) {
        List list2;
        Object obj;
        Object obj2;
        Number number;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HyperThriftBase hyperThriftBase = (HyperThriftBase) it.next();
            HyperThriftBase hyperThriftBase2 = (HyperThriftBase) hyperThriftBase.A00(1);
            HyperThriftBase hyperThriftBase3 = (HyperThriftBase) hyperThriftBase.A00(0);
            if (hyperThriftBase3 != null) {
                Long l = (Long) hyperThriftBase3.A00(0);
                if (l != null) {
                    Integer A00 = XUM.A00(l);
                    Integer A002 = XUM.A00(Long.valueOf(l.longValue() << 1));
                    if (!(A00 == null || A002 == null)) {
                        obj2 = new Object();
                    }
                }
                obj2 = new Object();
            } else {
                if (!(hyperThriftBase2 == null || (number = (Number) hyperThriftBase2.A00(0)) == null)) {
                    obj2 = new C22135Xvz(number.intValue());
                }
                obj2 = new Object();
            }
            A1C.add(obj2);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            HyperThriftBase hyperThriftBase4 = (HyperThriftBase) list.get(i);
            Y9B y9b = (Y9B) A1C.get(i);
            if (y9b instanceof C22135Xvz) {
                C22135Xvz xvz = (C22135Xvz) y9b;
                HyperThriftBase hyperThriftBase5 = (HyperThriftBase) hyperThriftBase4.A00(1);
                if (!(hyperThriftBase5 == null || (list2 = (List) hyperThriftBase5.A00(1)) == null)) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        long A0H = Pxg.A0H(it2);
                        if (A0H < 0 || A0H >= ((long) A1C.size())) {
                            obj = new Object();
                        } else {
                            obj = A1C.get((int) A0H);
                        }
                        0qQ.A0B(obj, 0);
                        xvz.A00.add(obj);
                    }
                }
            }
        }
        return 00k.A0a(A1C);
    }
}
