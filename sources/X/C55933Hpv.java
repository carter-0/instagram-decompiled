package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.Hpv  reason: case insensitive filesystem */
public final class C55933Hpv {
    public final Map A00 = AnonymousClass7TE.A1H();
    public final Set A01 = DbS.A0y();

    public final void A00() {
        Map map = this.A00;
        map.clear();
        Set set = this.A01;
        for (Object next : set) {
            map.put(((AnonymousClass30Y) next).A05, next);
        }
        set.clear();
    }
}
