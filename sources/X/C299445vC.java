package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5vC  reason: invalid class name and case insensitive filesystem */
public final class C299445vC {
    public final C299435v9 A00;
    public final C274594oe A01;
    public final Integer A02;
    public final String A03;
    public final Map A04 = new LinkedHashMap();
    public final Set A05 = new LinkedHashSet();

    public final void A00(String str, List list, boolean z) {
        String str2;
        List<AnonymousClass9J3> list2 = list;
        0qQ.A0B(list2, 0);
        Map map = this.A04;
        String str3 = str;
        long longValue = ((Number) map.getOrDefault(str3, 0L)).longValue();
        int i = (longValue > 0 ? 1 : (longValue == 0 ? 0 : -1));
        if (z) {
            if (i == 0) {
                map.put(str3, Long.valueOf(System.currentTimeMillis()));
            }
        } else if (i > 0) {
            long currentTimeMillis = System.currentTimeMillis() - longValue;
            int i2 = 0;
            for (AnonymousClass9J3 r5 : list2) {
                if (!0qQ.A0K(r5.A03, str3)) {
                    i2++;
                } else if (i2 != -1) {
                    if (currentTimeMillis > 250) {
                        C299435v9 r9 = this.A00;
                        C274594oe r52 = this.A01;
                        String str4 = null;
                        if (r52 != null) {
                            str2 = r52.A06;
                            str4 = r52.A07;
                        } else {
                            str2 = null;
                        }
                        int size = list2.size();
                        Set set = this.A05;
                        r9.Cl7(str3, str2, str4, C292845jc.A00(this.A02), this.A03, (double) currentTimeMillis, i2, size, set.contains(str3));
                        set.add(str3);
                    }
                    map.remove(str3);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void A01(AnonymousClass62P r23) {
        String str;
        AnonymousClass62P r6 = r23;
        0qQ.A0B(r6, 0);
        Map map = this.A04;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            if (System.currentTimeMillis() - longValue > 250) {
                int i = 0;
                Iterator it = r6.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!0qQ.A0K(((AnonymousClass9J3) it.next()).A03, str2)) {
                        i++;
                    } else if (i != -1) {
                        C299435v9 r11 = this.A00;
                        C274594oe r2 = this.A01;
                        String str3 = null;
                        if (r2 != null) {
                            str = r2.A06;
                            str3 = r2.A07;
                        } else {
                            str = null;
                        }
                        int size = r6.size();
                        Set set = this.A05;
                        r11.Cl7(str2, str, str3, C292845jc.A00(this.A02), this.A03, (double) longValue, i, size, set.contains(str2));
                        set.add(str2);
                    }
                }
            }
        }
        map.clear();
    }

    public C299445vC(C299435v9 r2, C274594oe r3, Integer num, String str) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = num;
        this.A03 = str;
    }
}
