package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.7iT  reason: invalid class name and case insensitive filesystem */
public final class C338747iT {
    public final Integer A00;
    public final List A01;
    public final AnonymousClass9JA A02;

    public C338747iT(Integer num, List list) {
        Object obj;
        this.A01 = list;
        this.A00 = num;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AnonymousClass9JA) obj).A04) {
                break;
            }
        }
        this.A02 = (AnonymousClass9JA) obj;
    }
}
