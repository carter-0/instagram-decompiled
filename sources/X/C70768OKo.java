package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.OKo  reason: case insensitive filesystem */
public final class C70768OKo {
    public final Map A00 = AnonymousClass7TE.A1H();
    public final Map A01 = AnonymousClass7TE.A1H();
    public final Map A02 = AnonymousClass7TE.A1H();

    public final synchronized ArrayList A00(List list) {
        ArrayList A1C;
        A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            0eP A1A = JTO.A1A(it);
            LinkedHashSet A0y = DbS.A0y();
            Set set = (Set) this.A01.get(A1A.A00);
            if (set != null) {
                A0y.addAll(set);
            }
            Set set2 = (Set) this.A00.get(A1A.A01);
            if (set2 != null) {
                A0y.addAll(set2);
            }
            A1C.add(A0y);
        }
        return A1C;
    }
}
