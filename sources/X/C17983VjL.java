package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VjL  reason: case insensitive filesystem */
public final class C17983VjL {
    public final C42107BHk A00;
    public final C17997VjZ A01;
    public final List A02 = new ArrayList();

    public C17983VjL(C42107BHk bHk) {
        this.A00 = bHk;
        List<C15059UNc> list = bHk.A09;
        if (list != null && AnonymousClass7TE.A1b(list)) {
            for (C15059UNc vjZ : list) {
                this.A02.add(new C17997VjZ(vjZ));
            }
            List list2 = this.A02;
            ((C17997VjZ) list2.get(DbT.A02(list2, 1))).A02 = true;
        }
        C15059UNc uNc = this.A00.A00;
        if (uNc != null) {
            C17997VjZ vjZ2 = new C17997VjZ(uNc);
            this.A01 = vjZ2;
            vjZ2.A01 = true;
        }
    }

    public final int A00() {
        return this.A02.size() + (AnonymousClass7TF.A1V(this.A01) ? 1 : 0);
    }

    public final C17997VjZ A01(int i) {
        C17997VjZ vjZ;
        List list = this.A02;
        if (i != list.size() || (vjZ = this.A01) == null) {
            return (C17997VjZ) list.get(i);
        }
        return vjZ;
    }
}
