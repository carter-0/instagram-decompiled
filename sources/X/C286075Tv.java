package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Tv  reason: invalid class name and case insensitive filesystem */
public final class C286075Tv extends 0Yg implements 0sP {
    public static final C286075Tv A00 = new C286075Tv();

    public C286075Tv() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            C286015Tp r2 = C286035Tr.A02;
            Object obj3 = null;
            if (!0qQ.A0K(obj2, false) && obj2 != null) {
                obj3 = r2.EIl(obj2);
            }
            0qQ.A0A(obj3);
            arrayList.add(obj3);
        }
        return arrayList;
    }
}
