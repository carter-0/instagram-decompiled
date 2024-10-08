package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5UZ  reason: invalid class name */
public final class AnonymousClass5UZ extends 0Yg implements 0sP {
    public static final AnonymousClass5UZ A00 = new AnonymousClass5UZ();

    public AnonymousClass5UZ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            C286015Tp r2 = C286035Tr.A08;
            Object obj3 = null;
            if (!0qQ.A0K(obj2, false) && obj2 != null) {
                obj3 = r2.EIl(obj2);
            }
            0qQ.A0A(obj3);
            arrayList.add(obj3);
        }
        return new C286155Ud(arrayList);
    }
}
