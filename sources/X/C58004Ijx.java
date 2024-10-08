package X;

import java.util.Comparator;
import java.util.Set;

/* renamed from: X.Ijx  reason: case insensitive filesystem */
public final class C58004Ijx implements Comparator {
    public final /* synthetic */ C250973mM A00;

    public C58004Ijx(C250973mM r1) {
        this.A00 = r1;
    }

    public final int compare(Object obj, Object obj2) {
        Set set = this.A00.A0K;
        return 29b.A00(Integer.valueOf(00k.A03(set, ((C255773uh) obj).A0j)), Integer.valueOf(00k.A03(set, ((C255773uh) obj2).A0j)));
    }
}
