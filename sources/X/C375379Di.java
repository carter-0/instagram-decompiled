package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Di  reason: invalid class name and case insensitive filesystem */
public final class C375379Di {
    public final C375369Dh A00;
    public final C375219Cs A01;
    public final Class A02;
    public final Map A03;
    public final List A04;

    public static void A00(C375369Dh r3, List list, Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r3);
        C3740497y r2 = r3.A03;
        Collection collection = (Collection) map.put(r2, Collections.unmodifiableList(arrayList));
        if (collection != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(collection);
            arrayList2.add(r3);
            map.put(r2, Collections.unmodifiableList(arrayList2));
        }
        list.add(r3);
    }

    public final List A01(byte[] bArr) {
        List list = (List) this.A03.get(C3740497y.A00(bArr));
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public C375379Di(C375369Dh r1, C375219Cs r2, Class cls, List list, Map map) {
        this.A03 = map;
        this.A04 = list;
        this.A00 = r1;
        this.A02 = cls;
        this.A01 = r2;
    }
}
