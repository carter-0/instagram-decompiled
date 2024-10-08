package X;

import java.util.Iterator;
import java.util.List;

public abstract class F5M {
    public static final String A00(String str, List list) {
        C257443xP r0;
        0qQ.A0B(list, 0);
        PzX A00 = PzX.A00(list);
        MYK myk = new MYK(str, 24);
        Iterator it = ((Iterable) A00.A00.A05(A00)).iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                r0 = C2612848z.A00;
                break;
            }
            Object next = it.next();
            if (AnonymousClass7TE.A1a(myk.invoke(next))) {
                r0 = C257443xP.A01(next);
                break;
            }
        }
        return (String) r0.A02(new C12608Szs(9, (0sP) G3B.A00)).A04();
    }

    public static final String A01(String str, List list) {
        C257443xP r0;
        PzX A00 = PzX.A00(list);
        MYK myk = new MYK(str, 25);
        Iterator it = ((Iterable) A00.A00.A05(A00)).iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                r0 = C2612848z.A00;
                break;
            }
            Object next = it.next();
            if (AnonymousClass7TE.A1a(myk.invoke(next))) {
                r0 = C257443xP.A01(next);
                break;
            }
        }
        return (String) r0.A02(new C12608Szs(9, (0sP) MO6.A00)).A04();
    }
}
