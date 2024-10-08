package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.P0j  reason: case insensitive filesystem */
public final class C72292P0j implements C74238PrR {
    public AnonymousClass2Ep A00;

    public final List A00() {
        O7Y o7y;
        List list;
        AnonymousClass2Ep r1 = this.A00;
        if (r1 == null) {
            0qQ.A0F("thread");
            throw AnonymousClass00P.createAndThrow();
        }
        C254703su BKv = r1.BKv();
        if (BKv == null || (o7y = BKv.A0K) == null || (list = o7y.A00) == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }
}
