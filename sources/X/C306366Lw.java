package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Lw  reason: invalid class name and case insensitive filesystem */
public abstract class C306366Lw {
    public static final void A00(1Bk r13) {
        int i = 50;
        1Bk r8 = r13;
        Set A05 = r13.A05();
        ArrayList arrayList = new ArrayList();
        Iterator it = A05.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof Long) {
                if (((Number) value).longValue() > Long.MAX_VALUE) {
                    i2++;
                }
                arrayList.add(value);
            } else {
                it.remove();
            }
        }
        List A0g = 00k.A0g(arrayList, new C306376Lx());
        if (i2 > 0) {
            int min = Math.min(i2, 50);
            Object obj = A0g.get(((A0g.size() - i2) + min) - 1);
            0qQ.A0A(obj);
            A01(r8, A05, Long.MAX_VALUE, ((Number) obj).longValue());
            i = 50 - min;
            if (i <= 0) {
                return;
            }
        }
        Object obj2 = A0g.get(i - 1);
        0qQ.A0A(obj2);
        A01(r8, A05, 0, ((Number) obj2).longValue());
    }

    public static final void A01(1Bk r5, Set set, long j, long j2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            0qQ.A0C(value, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Number) value).longValue();
            if (j <= longValue && longValue <= j2) {
                r5.A0A(str);
            }
        }
    }
}
