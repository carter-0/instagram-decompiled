package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7xR  reason: invalid class name and case insensitive filesystem */
public abstract class C347827xR {
    public static final boolean A00(C347817xQ r8, C347297wa r9, C347677xC r10, C347697xE r11) {
        C347727xH r4;
        C347747xJ r5 = (C347747xJ) r8.A01.get(r10);
        if (r5 != null) {
            List<C347737xI> list = r5.A01;
            boolean z = list instanceof Collection;
            if (!z || !list.isEmpty()) {
                for (C347737xI r2 : list) {
                    if (r2.A00 == C347297wa.IG && r2.A04.contains(r11) && r2.A01 == C347727xH.IGNORE) {
                        return true;
                    }
                }
            }
            if (!z || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C347737xI r22 = (C347737xI) it.next();
                    if (r22.A00 == C347297wa.IG && r22.A04.contains(r11) && r22.A01 == (r4 = C347727xH.ALLOW)) {
                        List<C347737xI> list2 = r5.A00;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            return false;
                        }
                        for (C347737xI r23 : list2) {
                            if (r23.A00 == r9 && r23.A04.contains(r11) && 00k.A0u(0sr.A1P(new C347727xH[]{r4, C347727xH.IGNORE}), r23.A01)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
