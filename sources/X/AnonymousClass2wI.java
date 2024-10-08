package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.2wI  reason: invalid class name */
public enum AnonymousClass2wI {
    ;

    public static final boolean A01(String str, Map map) {
        C271754jX r2;
        0qQ.A0B(str, 0);
        if (map.containsKey(str)) {
            C271744jW r0 = (C271744jW) map.get(str);
            if (r0 != null) {
                r2 = r0.Bz6();
            } else {
                r2 = null;
            }
            if (r2 == C271754jX.SEEN) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A02(C233172vA r4, C228812mN r5, C233402vf r6, AnonymousClass2vG r7, C233432vi r8, Object obj, Map map) {
        0qQ.A0B(r7, 1);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r8, 5);
        ArrayList A0U = 00k.A0U(r6.BYj());
        if (A01(r5.BEZ(obj), map)) {
            1PW AGd = r8.AGd(A0U);
            C251373n0 FIa = r6.FIa();
            if (FIa != null) {
                r7.Chf(FIa, AGd, "deleted_unseen_item");
                if (r4 != null) {
                    r4.A0e = r5.BEZ(FIa.BTb());
                    r4.A0V = "pool_replacement_and_injected_item_removal";
                }
                r8.EIr();
            }
        }
    }

    /* access modifiers changed from: public */
    static {
        AnonymousClass2wI[] r0;
        A00 = 0oU.A00(r0);
    }

    public static final void A00(C233172vA r1, String str, int i, int i2, int i3, boolean z) {
        if (r1 != null) {
            r1.A03 = true;
            r1.A06 = Boolean.valueOf(z);
            r1.A0V = str;
            Integer num = r1.A0C;
            if (num != null) {
                i += num.intValue();
            }
            r1.A0C = Integer.valueOf(i);
            r1.A0G = Integer.valueOf(i2);
            r1.A0E = Integer.valueOf(i3);
        }
    }
}
