package X;

import java.util.List;
import java.util.Set;

public final class GB9 extends C235042zB {
    public final C234072ww A00;
    public final Set A01 = C51972G9s.A0u();

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        List A3f;
        C247733gp r2;
        C267324bN r4 = (C267324bN) obj;
        1Xj A0l = C51968G9o.A0l(r4);
        if (A0l != null && (A3f = A0l.A3f()) != null && (r2 = (C247733gp) 00k.A0J(A3f)) != null && !r2.A03()) {
            Set set = this.A01;
            if (!set.contains(r2.A0G)) {
                set.add(r2.A0G);
                this.A00.A02(r2, r4.A02);
            }
        }
    }

    public GB9(C234072ww r2, long j) {
        super(j);
        this.A00 = r2;
    }
}
