package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5UY  reason: invalid class name */
public final class AnonymousClass5UY extends 0Yg implements 0sL {
    public static final AnonymousClass5UY A00 = new AnonymousClass5UY();

    public AnonymousClass5UY() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass6HK r7 = (AnonymousClass6HK) obj;
        List list = ((C286155Ud) obj2).A01;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(C286035Tr.A00(C286035Tr.A08, r7, list.get(i)));
        }
        return arrayList;
    }
}
