package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AEP {
    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, X.0rk] */
    public static final void A01(C358058aI r9, List list) {
        float f;
        float f2;
        0qQ.A0B(list, 1);
        List list2 = AGz.A01;
        Iterator it = list.iterator();
        while (true) {
            f = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            AHB ahb = (AHB) it.next();
            if (0qQ.A0K(ahb.A01, AGz.A01.get(7))) {
                Float f3 = ahb.A00;
                if (f3 != null) {
                    f = f3.floatValue();
                }
            }
        }
        r9.A01 = Float.valueOf(f);
        Iterator it2 = list.iterator();
        float f4 = 0.0f;
        loop1:
        while (true) {
            f2 = 0.0f;
            while (true) {
                if (!it2.hasNext()) {
                    break loop1;
                }
                AHB ahb2 = (AHB) it2.next();
                String str = ahb2.A01;
                List list3 = AGz.A09;
                if (0qQ.A0K(str, list3.get(0))) {
                    Float f5 = ahb2.A00;
                    if (f5 != null) {
                        f2 = f5.floatValue();
                    }
                } else if (0qQ.A0K(str, list3.get(1))) {
                    f4 = AHB.A00(ahb2);
                }
            }
        }
        Float valueOf = Float.valueOf(f4);
        Float valueOf2 = Float.valueOf(f2);
        r9.A08 = valueOf;
        r9.A0F = valueOf2;
        ? obj = new Object();
        Iterator it3 = C242173Sx.A0E(new J6L(new TY5(obj, 29), 23), C242173Sx.A09(C41688Ayf.A00, new 0jq(list))).iterator();
        double d = 0.0d;
        while (it3.hasNext()) {
            d += (double) AHB.A00((AHB) it3.next());
        }
        float f6 = (float) d;
        int i = obj.A00;
        if (i > 0) {
            f6 /= (float) i;
        }
        r9.A02 = Float.valueOf(f6);
    }

    public static final void A02(C358058aI r5, List list) {
        List list2 = AGy.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            String str = ((AHB) next).A01;
            if (str != null && 0qQ.A0K(C10073RmA.A01.get(str), "people")) {
                A1C.add(next);
            }
        }
        Iterator it = A1C.iterator();
        float f = 0.0f;
        if (it.hasNext()) {
            float A00 = AHB.A00((AHB) it.next());
            while (it.hasNext()) {
                A00 = Math.max(A00, AHB.A00((AHB) it.next()));
            }
            Float valueOf = Float.valueOf(A00);
            if (valueOf != null) {
                f = valueOf.floatValue();
            }
        }
        r5.A0A = Float.valueOf(f);
        r5.A03 = A00(AGz.A04, list);
        r5.A07 = A00(AGz.A08, list);
        r5.A05 = A00(AGz.A06, list);
        r5.A0B = A00(AGz.A02, list);
        r5.A0C = A00(AGz.A0D, list);
        r5.A0D = A00(AGz.A0E, list);
        r5.A0E = A00(AGz.A0F, list);
        r5.A0G = A00(AGz.A0G, list);
        r5.A09 = A00(AGz.A0B, list);
        r5.A06 = A00(AGz.A07, list);
        r5.A04 = A00(AGz.A05, list);
    }

    public static Float A00(List list, List list2) {
        return Float.valueOf(AGz.A00(list, list2));
    }
}
