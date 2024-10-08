package X;

import com.instagram.model.shopping.ProductTagDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CXh  reason: case insensitive filesystem */
public abstract class C44142CXh {
    public static C275374q3 A00(List list) {
        ArrayList arrayList = null;
        1E9 A0p = C41847B3o.A0p();
        if (list != null) {
            arrayList = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductTagDictIntf) it.next()).FFM(A0p));
            }
        }
        return new C275374q3(arrayList);
    }
}
