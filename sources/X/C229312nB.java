package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2nB  reason: invalid class name and case insensitive filesystem */
public final class C229312nB {
    public final 1Bk A00;
    public final C61410nE A01;

    public static C229312nB A00(1Bk r2) {
        return new C229312nB(r2, C61410nE.A00);
    }

    public final boolean A03(String str, long j) {
        long A04 = this.A00.A04(str, -2147483648L);
        if (A04 == -2147483648L) {
            return false;
        }
        if (System.currentTimeMillis() - j > A04 || A04 > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public C229312nB(1Bk r1, C61410nE r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static void A01(1Bk r4, Set set, long j, long j2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Long l = (Long) entry.getValue();
            if (l.compareTo(Long.valueOf(j)) >= 0 && l.compareTo(Long.valueOf(j2)) <= 0) {
                r4.A0A((String) entry.getKey());
            }
        }
    }

    public final void A02(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        1Bk r8 = this.A00;
        r8.A0C(str, currentTimeMillis);
        if (r8.A03() > 200) {
            int i = 50;
            Set A05 = r8.A05();
            ArrayList arrayList = new ArrayList();
            Iterator it = A05.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue() instanceof Long) {
                    if (((Long) entry.getValue()).compareTo(Long.valueOf(currentTimeMillis)) > 0) {
                        i2++;
                    }
                    arrayList.add(entry.getValue());
                } else {
                    it.remove();
                }
            }
            Collections.sort(arrayList);
            if (i2 > 0) {
                int min = Math.min(i2, 50);
                A01(r8, A05, currentTimeMillis + 1, ((Number) arrayList.get(((arrayList.size() - i2) + min) - 1)).longValue());
                i = 50 - min;
                if (i <= 0) {
                    return;
                }
            }
            A01(r8, A05, 0, ((Number) arrayList.get(i - 1)).longValue());
        }
    }
}
