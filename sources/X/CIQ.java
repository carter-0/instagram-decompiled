package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CIQ extends 17P implements C46235DRq {
    public List A00;
    public List A01;

    public final C46235DRq E77(1E9 r5) {
        ArrayList arrayList;
        List list = this.A00;
        if (list == null) {
            list = A08(1969903821, B5k.class);
        }
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41848B3p.A1U(r5, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        List list2 = this.A01;
        if (!(list2 == null && (list2 = A08(1973704552, B5k.class)) == null)) {
            arrayList2 = AnonymousClass7TF.A0p(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C41848B3p.A1U(r5, arrayList2, it2);
            }
        }
        this.A01 = arrayList2;
        return this;
    }

    public final C53436GoT F1A(1E9 r9) {
        ArrayList arrayList;
        String A0h = A0h(1253013930);
        String A0h2 = A0h(-1076648986);
        String A0i = A0i(-815905284);
        List list = this.A00;
        if (list == null) {
            list = A08(1969903821, B5k.class);
        }
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41848B3p.A1Q(r9, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        List list2 = this.A01;
        if (!(list2 == null && (list2 = A08(1973704552, B5k.class)) == null)) {
            arrayList2 = AnonymousClass7TF.A0p(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C41848B3p.A1Q(r9, arrayList2, it2);
            }
        }
        return new C53436GoT(A0h, A0h2, A0i, A0h(-1773366604), arrayList, arrayList2);
    }
}
