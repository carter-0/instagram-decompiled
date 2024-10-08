package X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6cJ  reason: invalid class name and case insensitive filesystem */
public final class C311206cJ implements C311216cK {
    public final /* synthetic */ C310676bR A00;

    public final void DMC(C250603lj r3, C255773uh r4, AnonymousClass6YY r5) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r5, 2);
        this.A00.A00(r3, r4, r5.A02);
    }

    public final void DMT(C250603lj r4, C255773uh r5, AnonymousClass6YY r6) {
        Set set;
        0qQ.A0B(r6, 2);
        C310676bR r0 = this.A00;
        C309426Yf r2 = r6.A02;
        Map map = r0.A00;
        if (!map.containsKey(r2)) {
            set = new HashSet();
            map.put(r2, set);
        } else {
            set = (Set) map.get(r2);
        }
        set.add(r4);
    }

    public C311206cJ(C310676bR r1) {
        this.A00 = r1;
    }
}
