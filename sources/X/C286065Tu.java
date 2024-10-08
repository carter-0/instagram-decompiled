package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Tu  reason: invalid class name and case insensitive filesystem */
public final class C286065Tu extends 0Yg implements 0sL {
    public static final C286065Tu A00 = new C286065Tu();

    public C286065Tu() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass6HK r6 = (AnonymousClass6HK) obj;
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(C286035Tr.A00(C286035Tr.A02, r6, list.get(i)));
        }
        return arrayList;
    }
}
