package X;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7pb  reason: invalid class name and case insensitive filesystem */
public abstract class C343057pb {
    public static C343047pa A00(List list, int i, int i2) {
        double d;
        int i3 = i;
        int i4 = i2;
        double d2 = ((double) i3) / ((double) i4);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C343047pa r1 = (C343047pa) it.next();
            if (!A02(r1)) {
                arrayList.add(r1);
            }
        }
        Iterator it2 = arrayList.iterator();
        C343047pa r0 = null;
        int i5 = Integer.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        while (it2.hasNext()) {
            C343047pa r8 = (C343047pa) it2.next();
            int i6 = r8.A02;
            if (i6 == i3 && r8.A01 == i4) {
                return r8;
            }
            int i7 = r8.A01;
            if (i6 >= i7) {
                double d4 = (double) i6;
                double d5 = (double) i7;
                double d6 = d4 / d5;
                if (d6 >= d2) {
                    d = d5 * ((d5 * d6) - (d5 * d2));
                } else {
                    d = d4 * ((d4 / d6) - (d4 / d2));
                }
                int abs = Math.abs(i7 - i4);
                if (r0 == null || abs < i5 || (r0.A01 == i7 && d < d3)) {
                    i5 = abs;
                    r0 = r8;
                    d3 = d;
                }
            }
        }
        if (r0 == null) {
            return (C343047pa) arrayList.get(arrayList.size() - 1);
        }
        return r0;
    }

    public static ArrayList A01(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet(list);
        for (Object next : list2) {
            if (hashSet.contains(next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        Collections.sort(arrayList, new C343067pc());
        return arrayList;
    }

    public static boolean A02(C343047pa r3) {
        int i;
        int i2;
        String str = Build.MODEL;
        if (str.startsWith("HUAWEI GRA") || str.startsWith("HUAWEI MT7")) {
            if (r3.A02 != 1440) {
                return false;
            }
            i = r3.A01;
            i2 = 1080;
        } else if (!str.equals("SD4930UR") || r3.A02 != 2592) {
            return false;
        } else {
            i = r3.A01;
            i2 = 1944;
        }
        if (i == i2) {
            return true;
        }
        return false;
    }
}
