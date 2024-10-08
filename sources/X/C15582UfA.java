package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.UfA  reason: case insensitive filesystem */
public final class C15582UfA extends 1P0 {
    public final /* synthetic */ C323486xZ A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public C15582UfA(C323486xZ r1, List list, List list2) {
        this.A00 = r1;
        this.A01 = list;
        this.A02 = list2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1986721235);
        CG8 cg8 = (CG8) obj;
        int A0D = AnonymousClass7TG.A0D(cg8, -989444515);
        C323486xZ r6 = this.A00;
        List list = this.A01;
        List list2 = this.A02;
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            String str = (String) next;
            List<C17991VjT> list3 = (List) list2.get(i);
            if (AnonymousClass7TE.A1b(list3)) {
                for (C17991VjT vjT : list3) {
                    vjT.A00 = C16507Uw3.COMMITTED;
                }
                Object A0r = C66582MXn.A0r(list3);
                List A0A = r6.A0A(str);
                int indexOf = A0A.indexOf(A0r);
                if (indexOf != -1) {
                    r6.A0E.put(str, A0A.subList(indexOf + 1, A0A.size()));
                }
            }
            i = i2;
        }
        C323486xZ.A03(r6, cg8.A02, cg8.A01);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            C18071Vky A06 = r6.A06(A18);
            if (A06 != null) {
                r6.A07.D1H(A06, A18);
            }
        }
        AnonymousClass0fD.A0A(-449338442, A0D);
        AnonymousClass0fD.A0A(-742807515, A03);
    }
}
