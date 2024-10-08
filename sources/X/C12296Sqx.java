package X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Sqx  reason: case insensitive filesystem */
public final class C12296Sqx implements C241943Rz {
    public final Map A00 = AnonymousClass7TE.A1E();
    public final Map A01 = AnonymousClass7TE.A1E();
    public final Map A02 = AnonymousClass7TE.A1E();

    public final synchronized void A00(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A02;
        Set<AnonymousClass1TA> set = (Set) map.get(str);
        if (set != null) {
            for (AnonymousClass1TA cancel : set) {
                cancel.cancel();
            }
        }
        map.remove(str);
    }

    public final synchronized void AA2(AnonymousClass1TA r4, 1QU r5, String str) {
        Set A1F;
        String str2 = r5.A0E;
        Map map = this.A02;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            0qQ.A0A(obj);
            A1F = (Set) obj;
        } else {
            A1F = AnonymousClass7TE.A1F();
        }
        A1F.add(r4);
        map.put(str, A1F);
        this.A01.put(r4, r5);
        if (str2 != null) {
            Map map2 = this.A00;
            if (map2.containsKey(str2)) {
                Object obj2 = map2.get(str2);
                0qQ.A0A(obj2);
                ((Set) obj2).add(r4);
            } else {
                HashSet A1F2 = AnonymousClass7TE.A1F();
                A1F2.add(r4);
                map2.put(str2, A1F2);
            }
        }
    }

    public final synchronized void EEV(AnonymousClass1TA r4, 1QU r5, String str) {
        String str2 = r5.A0E;
        Set set = (Set) this.A02.get(str);
        if (set != null) {
            set.remove(r4);
        }
        this.A01.remove(r4);
        if (str2 != null) {
            Map map = this.A00;
            if (map.containsKey(str2)) {
                Object obj = map.get(str2);
                0qQ.A0A(obj);
                ((Set) obj).remove(r4);
            }
        }
    }

    public final synchronized void FKv(String str, boolean z) {
        1Fe r0;
        0qQ.A0B(str, 0);
        Map map = this.A02;
        Set<AnonymousClass1TA> set = (Set) map.get(str);
        if (set != null) {
            for (AnonymousClass1TA r1 : set) {
                if (z) {
                    r0 = 1Fe.A03;
                } else {
                    r0 = 1Fe.A02;
                }
                r1.FJj(r0);
            }
        }
        map.remove(str);
    }
}
