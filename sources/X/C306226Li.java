package X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Li  reason: invalid class name and case insensitive filesystem */
public final class C306226Li implements C250603lj {
    public final C306216Lh A00;

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        Set set;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        int intValue = r6.CEk(r5).intValue();
        if (intValue == 0) {
            C306216Lh r0 = this.A00;
            Object obj = r5.A04;
            0qQ.A06(obj);
            C306176Ld r1 = (C306176Ld) obj;
            0qQ.A0B(r1, 1);
            C310676bR r02 = r0.A00.A03;
            C309426Yf r2 = r1.A02;
            Map map = r02.A00;
            if (!map.containsKey(r2)) {
                set = new HashSet();
                map.put(r2, set);
            } else {
                set = (Set) map.get(r2);
            }
            set.add(this);
        } else if (intValue == 2) {
            C306216Lh r03 = this.A00;
            Object obj2 = r5.A04;
            0qQ.A06(obj2);
            C306176Ld r3 = (C306176Ld) obj2;
            0qQ.A0B(r3, 1);
            r03.A00.A03.A00(this, r3.A01, r3.A02);
        }
    }

    public C306226Li(C306216Lh r1) {
        this.A00 = r1;
    }
}
