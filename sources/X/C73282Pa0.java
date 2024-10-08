package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.Pa0  reason: case insensitive filesystem */
public final class C73282Pa0 implements Runnable {
    public final /* synthetic */ N4A A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ Set A02;

    public C73282Pa0(N4A n4a, List list, Set set) {
        this.A01 = list;
        this.A02 = set;
        this.A00 = n4a;
    }

    public final void run() {
        for (Object A1U : this.A01) {
            DbS.A1U(A1U);
        }
        Set<C74225PrE> set = this.A02;
        N4A n4a = this.A00;
        for (C74225PrE prE : set) {
            if (prE instanceof C74560Px9) {
                ((C74560Px9) prE).CNt(n4a);
            } else if (prE instanceof C71759OqL) {
                0sP r0 = ((C71759OqL) prE).A00;
                if (r0 != null) {
                    r0.invoke(n4a);
                }
            } else if (!(prE instanceof C59667JSm)) {
                throw AnonymousClass7TE.A1K();
            } else {
                throw AnonymousClass7TE.A0z("Granular subscribers should not be added to subscribersWithDiffs - must be wrapped as ()-> Unit & added to granularSubscriberCallbacks");
            }
        }
    }
}
