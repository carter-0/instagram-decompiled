package X;

import java.util.Map;

/* renamed from: X.2zt  reason: invalid class name and case insensitive filesystem */
public abstract class C235422zt implements C250603lj {
    public final Map A00;

    public final AnonymousClass59J A02(1Xj r4) {
        0qQ.A0B(r4, 0);
        Map map = this.A00;
        AnonymousClass59J r1 = (AnonymousClass59J) map.get(r4.getId());
        if (r1 != null) {
            return r1;
        }
        AnonymousClass59J r12 = new AnonymousClass59J(r4);
        map.put(r4.getId(), r12);
        return r12;
    }

    public C235422zt(Map map) {
        this.A00 = map;
    }
}
