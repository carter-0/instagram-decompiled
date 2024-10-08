package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Qoh extends C11335SNp {
    public final List A00 = AnonymousClass7TE.A1C();
    public final List A01 = AnonymousClass7TE.A1C();
    public final Map A02 = AnonymousClass7TE.A1E();

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        List list = this.A01;
        if (!list.isEmpty()) {
            A1E.put("products", list);
        }
        List list2 = this.A00;
        if (!list2.isEmpty()) {
            A1E.put(AnonymousClass000.A00(3813), list2);
        }
        Map map = this.A02;
        if (!map.isEmpty()) {
            A1E.put(C273654mx.A00(160), map);
        }
        return C11335SNp.A01("productAction", (Object) null, A1E);
    }
}
