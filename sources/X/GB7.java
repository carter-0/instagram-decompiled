package X;

import java.util.List;
import java.util.Set;

public final class GB7 extends C235042zB {
    public final C234072ww A00;
    public final Set A01 = C51972G9s.A0u();

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        List list;
        C247733gp r2;
        C267324bN r4 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TG.A1N(r4, gDe);
        C61081JwJ jwJ = gDe.A0A;
        if (jwJ != null && (list = (List) jwJ.A00) != null && (r2 = (C247733gp) 00k.A0J(list)) != null && !r2.A03()) {
            Set set = this.A01;
            if (!set.contains(r2.A0G)) {
                set.add(r2.A0G);
                this.A00.A02(r2, r4.A02);
            }
        }
    }

    public GB7(C234072ww r2, long j) {
        super(j);
        this.A00 = r2;
    }
}
