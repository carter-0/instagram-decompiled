package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Trl  reason: case insensitive filesystem */
public final class C14206Trl {
    public final ConcurrentMap A00 = new ConcurrentHashMap();
    public final ConcurrentMap A01 = new ConcurrentHashMap();

    public final synchronized N3M A00(String str) {
        N3M n3m;
        0qQ.A0B(str, 0);
        ConcurrentMap concurrentMap = this.A01;
        if (concurrentMap.containsKey(str)) {
            n3m = (N3M) concurrentMap.get(str);
        } else {
            n3m = null;
        }
        return n3m;
    }

    public final synchronized void A01(N3M n3m, String str) {
        0qQ.A0B(str, 0);
        this.A01.put(str, n3m);
        String str2 = n3m.A05;
        if (str2 == null) {
            str2 = n3m.A06;
        }
        Boolean bool = n3m.A00;
        if (str2 != null) {
            ConcurrentMap concurrentMap = this.A00;
            if (!concurrentMap.containsKey(str2) && bool != null) {
                JTP.A1R(str2, concurrentMap, AnonymousClass7TF.A1Q(bool.booleanValue() ? 1 : 0));
            }
        }
    }

    public final synchronized void A02(String str) {
        if (str != null) {
            ConcurrentMap concurrentMap = this.A00;
            if (concurrentMap.containsKey(str)) {
                JTP.A1R(str, concurrentMap, true);
            }
        }
    }

    public final synchronized boolean A03(N3M n3m) {
        boolean z;
        String str = n3m.A05;
        if (str == null) {
            str = n3m.A06;
        }
        Boolean bool = (Boolean) this.A00.get(str);
        if (str == null || bool == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        return z;
    }

    public final synchronized boolean A04(String str) {
        boolean z;
        0qQ.A0B(str, 0);
        N3M n3m = (N3M) this.A01.get(str);
        if (n3m == null) {
            z = true;
        } else {
            z = A03(n3m);
        }
        return z;
    }
}
