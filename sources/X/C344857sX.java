package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7sX  reason: invalid class name and case insensitive filesystem */
public final class C344857sX {
    public final C3496981j A00 = new C3496981j();
    public final AtomicBoolean A01 = new AtomicBoolean();

    public static C345787u5 A00(C344857sX r4, C345237tA r5) {
        List list = r4.A00.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C345787u5 r1 = (C345787u5) list.get(i);
            if (r1.A00 == r5) {
                return r1;
            }
        }
        return null;
    }
}
