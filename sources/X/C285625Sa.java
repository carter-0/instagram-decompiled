package X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.5Sa  reason: invalid class name and case insensitive filesystem */
public final class C285625Sa extends 0Yg implements 0sL {
    public static final C285625Sa A00 = new C285625Sa();

    public C285625Sa() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        if (collection == null) {
            return collection2;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.addAll(collection2);
        return arrayList;
    }
}
