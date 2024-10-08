package X;

import com.instagram.model.shopping.ProductGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.WSy  reason: case insensitive filesystem */
public final class C19290WSy implements AnonymousClass0lh {
    public final LinkedHashMap A00 = new C58044Ikc(2);

    public final void A00(ProductGroup productGroup, String str) {
        0qQ.A0B(str, 0);
        if (productGroup != null) {
            LinkedHashMap linkedHashMap = this.A00;
            if (linkedHashMap.containsKey(str)) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(25);
                Set entrySet = linkedHashMap.entrySet();
                0qQ.A07(entrySet);
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(it);
                    if (!str.equals(A1J.getKey())) {
                        Dbb.A1V(A1J, linkedHashMap2);
                    }
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(linkedHashMap2);
            }
            linkedHashMap.put(str, productGroup);
        }
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
