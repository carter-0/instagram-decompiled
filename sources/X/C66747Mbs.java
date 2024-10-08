package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mbs  reason: case insensitive filesystem */
public final /* synthetic */ class C66747Mbs implements C74306Psg {
    public static final C66747Mbs A00 = new C66747Mbs();

    public final /* bridge */ /* synthetic */ Object ABl(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        Map map = (Map) obj3;
        AnonymousClass7TG.A1T(list, list2, map);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (!map.containsKey(C66647MaG.A03(((C66702Mb9) next).A0J).A00)) {
                A1C.add(next);
            }
        }
        if (list2.isEmpty()) {
            return A1C;
        }
        if (A1C.isEmpty()) {
            return list2;
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        int i = 0;
        int i2 = 0;
        while (i < A1C.size() && i2 < list2.size()) {
            C66702Mb9 mb9 = (C66702Mb9) A1C.get(i);
            C66702Mb9 mb92 = (C66702Mb9) list2.get(i2);
            if (mb9.A05 > mb92.A05) {
                A1C2.add(mb9);
                i++;
            } else {
                A1C2.add(mb92);
                i2++;
            }
        }
        while (i < A1C.size()) {
            A1C2.add(A1C.get(i));
            i++;
        }
        while (i2 < list2.size()) {
            A1C2.add(list2.get(i2));
            i2++;
        }
        return A1C2;
    }
}
