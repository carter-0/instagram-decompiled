package X;

import java.util.Map;

/* renamed from: X.ONr  reason: case insensitive filesystem */
public final class C70840ONr {
    public final Map A00 = AnonymousClass7TE.A1H();

    public final void A00(Integer num, String str) {
        if (num != null) {
            this.A00.put(str, new C69076NeG(num.intValue()));
        }
    }

    public final void A01(String str, Boolean bool) {
        if (bool != null) {
            this.A00.put(str, new C69073NeD(bool.booleanValue()));
        }
    }

    public final void A02(String str, Long l) {
        if (l != null) {
            this.A00.put(str, new C69077NeH(l.longValue()));
        }
    }

    public final void A03(String str, String str2) {
        if (str2 != null) {
            this.A00.put(str, new C69078NeI(str2));
        }
    }
}
