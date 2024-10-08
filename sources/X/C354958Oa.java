package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.8Oa  reason: invalid class name and case insensitive filesystem */
public final class C354958Oa {
    public final HashMap A00 = new HashMap();
    public final HashMap A01 = new HashMap();

    public final List A00(String str) {
        0qQ.A0B(str, 0);
        return (List) this.A01.get(str);
    }

    public final void A01(String str, List list) {
        0qQ.A0B(str, 0);
        this.A01.put(str, list);
    }
}
