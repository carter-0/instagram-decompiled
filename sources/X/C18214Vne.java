package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vne  reason: case insensitive filesystem */
public abstract class C18214Vne {
    public static final Integer A00(C17674Vc5 vc5) {
        0qQ.A0B(vc5, 0);
        if (vc5.A00 != null) {
            return AnonymousClass05K.A00;
        }
        if (vc5.A02 != null) {
            return AnonymousClass05K.A01;
        }
        if (vc5.A08 != null) {
            return AnonymousClass05K.A0C;
        }
        return null;
    }

    public static final List A01(List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C298735tw r1 = (C298735tw) it.next();
            0qQ.A0B(r1, 0);
            A0r.add(new C17674Vc5(r1));
        }
        return A0r;
    }
}
