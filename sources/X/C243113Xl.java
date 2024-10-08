package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.3Xl  reason: invalid class name and case insensitive filesystem */
public abstract class C243113Xl {
    public static final void A00(String str, 0sP r10, int i) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        if (2SO.A02.compareTo(2SN.A00()) >= 0) {
            Set set = 2SN.A00;
            if (!set.isEmpty()) {
                ArrayList<2SM> arrayList = null;
                Iterator it = set.iterator();
                while (true) {
                    str2 = str;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String[] strArr = ((2SM) next).A00;
                    if (03t.A0O(str, strArr) || 03t.A0O("*", strArr)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(next);
                    }
                }
                if (arrayList == null) {
                    arrayList = 0sn.A00;
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    r10.invoke(linkedHashMap);
                    PzP pzP = new PzP(currentTimeMillis, str2, String.valueOf(i), linkedHashMap);
                    for (2SM A00 : arrayList) {
                        A00.A00(pzP);
                    }
                }
            }
        }
    }
}
