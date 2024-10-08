package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Kt2  reason: case insensitive filesystem */
public abstract class C63195Kt2 {
    public static final String A00(String str, Collection collection) {
        0qQ.A0B(collection, 1);
        ArrayList A0r = AnonymousClass7TG.A0r(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0r.add(((C66787McY) it.next()).A03);
        }
        return DbT.A0z("_", 00k.A0S(00k.A0g(A0r, new C58002Ijv(1)), AnonymousClass7TE.A1I(str)), (0sP) null);
    }
}
