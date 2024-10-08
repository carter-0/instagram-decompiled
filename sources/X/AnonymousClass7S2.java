package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7S2  reason: invalid class name */
public final class AnonymousClass7S2 {
    public final List A00;

    public final void A00(Class cls, 0sP r5) {
        for (Object next : this.A00) {
            if (cls.isInstance(next)) {
                r5.invoke(next);
            }
        }
    }

    public AnonymousClass7S2(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C331647Ru) next).A08()) {
                arrayList.add(next);
            }
        }
        this.A00 = arrayList;
    }
}
