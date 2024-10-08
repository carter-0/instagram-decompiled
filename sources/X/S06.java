package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class S06 {
    public C8553Qwr A00;

    public final void A00(List list) {
        if (list == null || list.isEmpty()) {
            throw AnonymousClass7TE.A0w("Product list cannot be empty.");
        }
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C10357Rqu) it.next()).A01;
            if (!"play_pass_subs".equals(str)) {
                A1F.add(str);
            }
        }
        if (A1F.size() <= 1) {
            this.A00 = C8553Qwr.A02(list);
            return;
        }
        throw AnonymousClass7TE.A0w("All products should be of the same product type.");
    }
}
