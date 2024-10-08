package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4aZ  reason: invalid class name and case insensitive filesystem */
public abstract class C266924aZ {
    public static void A00(C228812mN r1, Object obj, Set set) {
        Integer num;
        if (r1.CcL(obj)) {
            num = AnonymousClass05K.A0C;
        } else if (r1.CYA(obj)) {
            num = AnonymousClass05K.A0N;
        } else {
            return;
        }
        A01(num, set);
    }

    public static void A01(Integer num, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C233602vz) it.next()).DKh(num);
        }
    }
}
