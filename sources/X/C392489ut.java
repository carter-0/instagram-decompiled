package X;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.9ut  reason: invalid class name and case insensitive filesystem */
public abstract class C392489ut {
    public static C343047pa A00(C343047pa r19, List list, Set set, double d) {
        C343047pa r18 = null;
        C343047pa r0 = r19;
        int i = r0.A02;
        int i2 = r0.A01;
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        if (d <= 0.0d) {
            d = AAH.A00(i, i2);
        }
        double d2 = Double.MAX_VALUE;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C343047pa r4 = (C343047pa) it.next();
            int i3 = r4.A02;
            int i4 = r4.A01;
            int max2 = Math.max(i3, i4);
            int min2 = Math.min(i3, i4);
            double A00 = AAH.A00(i3, i4);
            Set set2 = set;
            if (set == null || set2.isEmpty() || set2.contains(Double.valueOf(A00))) {
                if (max2 == max && min2 == min && Math.abs(A00 - d) <= 0.001d) {
                    return r4;
                }
                double abs = Math.abs(d - A00);
                double d3 = abs - d2;
                if (d3 <= 0.001d) {
                    if (Math.abs(d3) > 0.001d) {
                        d2 = abs;
                        r18 = null;
                        z = false;
                    }
                    if (max2 < max || min2 < min) {
                        if (!z) {
                            if (r18 != null && Long.signum((((long) i3) * ((long) i4)) - C343047pa.A00(r18)) <= 0) {
                            }
                        }
                    } else if (!z) {
                        r18 = r4;
                        z = true;
                    } else if (r18 != null) {
                        if (Long.signum((((long) i3) * ((long) i4)) - C343047pa.A00(r18)) >= 0) {
                        }
                    }
                    r18 = r4;
                }
            }
        }
        return r18;
    }
}
