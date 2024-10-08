package X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.5Sn  reason: invalid class name and case insensitive filesystem */
public final class C285755Sn extends 0Yg implements 0sL {
    public static final C285755Sn A00 = new C285755Sn();

    public C285755Sn() {
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
