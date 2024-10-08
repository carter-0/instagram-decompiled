package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Bl  reason: invalid class name and case insensitive filesystem */
public final class C327607Bl {
    public final C327597Bk A00;
    public final Map A01 = new LinkedHashMap();

    public final synchronized void A02(String str) {
        0qQ.A0B(str, 0);
        this.A01.remove(str);
    }

    public final synchronized void A03(String str, long j) {
        0qQ.A0B(str, 0);
        if (A00()) {
            Map map = this.A01;
            List list = (List) map.get(str);
            if (list == null) {
                list = new ArrayList();
            }
            if (!map.containsKey(str)) {
                map.put(str, list);
            }
            if (!A01(list, j)) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((Number) it.next()).longValue() <= j - this.A00.A02) {
                        i++;
                    } else if (i > 0) {
                        list = list.subList(i, list.size());
                        map.put(str, list);
                    }
                }
                list.add(Long.valueOf(j));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A04(java.lang.String r3, long r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            r1 = 0
            X.0qQ.A0B(r3, r1)     // Catch:{ all -> 0x001d }
            boolean r0 = r2.A00()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001b
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x001d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x001d }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001b
            boolean r0 = r2.A01(r0, r4)     // Catch:{ all -> 0x001d }
            monitor-exit(r2)
            return r0
        L_0x001b:
            monitor-exit(r2)
            return r1
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327607Bl.A04(java.lang.String, long):boolean");
    }

    private final boolean A00() {
        C327597Bk r3 = this.A00;
        if (r3.A02 == 0 || r3.A00 == 0 || r3.A01 == 0) {
            return false;
        }
        return true;
    }

    public C327607Bl(C327597Bk r2) {
        this.A00 = r2;
    }

    private final boolean A01(List list, long j) {
        if (!A00()) {
            return false;
        }
        int size = list.size();
        C327597Bk r5 = this.A00;
        if (size < r5.A00 || ((Number) 00k.A0I(list)).longValue() + r5.A02 < ((Number) 00k.A0K(list)).longValue() || ((Number) 00k.A0K(list)).longValue() + r5.A01 < j) {
            return false;
        }
        return true;
    }
}
