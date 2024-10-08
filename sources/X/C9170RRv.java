package X;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.RRv  reason: case insensitive filesystem */
public abstract class C9170RRv {
    public static final C319836rJ A00(Bundle bundle, Bundle bundle2) {
        AbstractMap abstractMap;
        if (bundle != null) {
            ClassLoader classLoader = C319836rJ.class.getClassLoader();
            0qQ.A0A(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw AnonymousClass7TE.A0z("Invalid bundle passed as restored state");
            }
            abstractMap = AnonymousClass7TE.A1H();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                DbS.A1Y(obj);
                abstractMap.put(obj, parcelableArrayList2.get(i));
            }
        } else if (bundle2 == null) {
            return new C319836rJ();
        } else {
            abstractMap = AnonymousClass7TE.A1E();
            Iterator A0t = Pxf.A0t(bundle2);
            while (A0t.hasNext()) {
                String A18 = AnonymousClass7TE.A18(A0t);
                0qQ.A05(A18);
                abstractMap.put(A18, bundle2.get(A18));
            }
        }
        return new C319836rJ(abstractMap);
    }
}
