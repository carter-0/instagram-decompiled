package X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Q2h  reason: case insensitive filesystem */
public final class C7282Q2h implements C13752TgO {
    public final Object A00;
    public final AnonymousClass6RT A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final boolean A05;

    public C7282Q2h(AnonymousClass6RT r2, Object obj, String str, String str2, Map map, boolean z) {
        0qQ.A0B(str2, 4);
        0qQ.A0B(r2, 6);
        this.A02 = str;
        this.A00 = obj;
        this.A05 = z;
        this.A03 = str2;
        this.A04 = map;
        this.A01 = r2;
    }

    public final Runnable AIV(C307786Rm r8, C307446Qd r9, C229652no r10) {
        C307846Rs r0;
        0qQ.A0B(r10, 2);
        boolean z = this.A05;
        AnonymousClass6RT r4 = this.A01;
        String str = this.A02;
        Object obj = this.A00;
        String str2 = this.A03;
        synchronized (r4) {
            if (z) {
                r4.A01(str, obj);
                C307836Rr A002 = AnonymousClass6RT.A00(r9, r4);
                Map map = A002.A02;
                Set set = (Set) map.get(str);
                HashSet hashSet = set;
                if (set == null) {
                    HashSet hashSet2 = new HashSet(1);
                    hashSet2.add(str2);
                    map.put(str, hashSet2);
                    hashSet = hashSet2;
                }
                hashSet.add(str2);
                r0 = A002.A00;
            } else {
                Object obj2 = r4.A00.get(str);
                if (obj2 == null) {
                    r4.A01(str, obj);
                } else if (!obj2.equals(obj)) {
                    r9.A0G(r4.A00, obj2, "gs", str2);
                }
                C307836Rr A003 = AnonymousClass6RT.A00(r9, r4);
                Map map2 = A003.A02;
                Set set2 = (Set) map2.get(str);
                HashSet hashSet3 = set2;
                if (set2 == null) {
                    HashSet hashSet4 = new HashSet(1);
                    hashSet4.add(str2);
                    map2.put(str, hashSet4);
                    hashSet3 = hashSet4;
                }
                hashSet3.add(str2);
                r0 = A003.A00;
            }
        }
        return r0;
    }

    public final Object BHB() {
        return this.A00;
    }
}
