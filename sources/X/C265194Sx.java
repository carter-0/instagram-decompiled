package X;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.4Sx  reason: invalid class name and case insensitive filesystem */
public final class C265194Sx {
    public final Map A00;
    public final Map A01;
    public final Map A02 = new HashMap();
    public final Random A03;

    public C265194Sx() {
        Random random = new Random();
        this.A03 = random;
        this.A01 = new HashMap();
        this.A00 = new HashMap();
    }

    public static void A01(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Number) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public static ArrayList A00(C265194Sx r6, List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map map = r6.A01;
        A01(elapsedRealtime, map);
        Map map2 = r6.A00;
        A01(elapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C256383vg r1 = (C256383vg) list.get(i);
            if (!map.containsKey(r1.A02) && !map2.containsKey(Integer.valueOf(r1.A00))) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public final C256383vg A02(List list) {
        C256383vg r1;
        Object obj;
        ArrayList A002 = A00(this, list);
        if (A002.size() < 2) {
            obj = null;
            Iterator it = A002.iterator();
            if (it.hasNext()) {
                obj = it.next();
            }
        } else {
            Collections.sort(A002, new C13096TLd());
            ArrayList arrayList = new ArrayList();
            int i = ((C256383vg) A002.get(0)).A00;
            int i2 = 0;
            while (true) {
                if (i2 >= A002.size()) {
                    break;
                }
                C256383vg r12 = (C256383vg) A002.get(i2);
                if (i == r12.A00) {
                    arrayList.add(new Pair(r12.A02, Integer.valueOf(r12.A01)));
                    i2++;
                } else if (arrayList.size() == 1) {
                    obj = A002.get(0);
                }
            }
            Map map = this.A02;
            C256383vg r13 = (C256383vg) map.get(arrayList);
            if (r13 != null) {
                return r13;
            }
            List subList = A002.subList(0, arrayList.size());
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((C256383vg) subList.get(i5)).A01;
            }
            int nextInt = this.A03.nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i3 >= subList.size()) {
                    r1 = (C256383vg) SA7.A00(subList);
                    break;
                }
                r1 = (C256383vg) subList.get(i3);
                i6 += r1.A01;
                if (nextInt < i6) {
                    break;
                }
                i3++;
            }
            map.put(arrayList, r1);
            return r1;
        }
        return (C256383vg) obj;
    }
}
